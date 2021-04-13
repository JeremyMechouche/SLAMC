#!/usr/bin/env python
# -*- coding: utf-8 -*-
import json
import argparse
from decimal import Decimal, getcontext
from sympy import Symbol, Eq, solve

getcontext().prec = 6

parser = argparse.ArgumentParser()
parser.add_argument("MCSLA")
parser.add_argument("ReconfStrat")
args = parser.parse_args()

# Function to Parse user input SLA 
def GetGlobalSLA(UserInputSLA):
    with open(UserInputSLA) as json_file:
        data = json.load(json_file)
        return data['mcsla']['global-SLA']

def GetGlobalSLAObjectives(UserInputSLA):
    with open(UserInputSLA) as json_file:
        data = json.load(json_file)
        T = []
        for SLO in data['mcsla']['global-SLA']['objectives']:
            T.append([SLO['termName'], SLO['value'], SLO['conditionStatement']])
        return T

def GetReconfStratEvents(RSInputSLA):
    with open(RSInputSLA) as json_file:
        TMP = {}
        data = json.load(json_file)
        for subSLA in data['ReconfigurationStrategy']['sub-SLAs']:
            TMP[subSLA] = []
            for event in data['ReconfigurationStrategy']['sub-SLAs'][subSLA]['transitions']['Events']:
                if event['predicate'] == 'Q-Event':
                    TMP[subSLA].append([event['id'],event['expression']['metric'],event['expression']['operator'],event['expression']['refValue']])
    return TMP

def GetSubSLAs(UserInputSLA):
    with open(UserInputSLA) as json_file:
        data = json.load(json_file)
        return data['mcsla']['sub-SLAs']

def GetSubSLA(UserInputSLA, SubSLA):
    with open(UserInputSLA) as json_file:
        data = json.load(json_file)
        return data['mcsla']['sub-SLAs'][SubSLA]

def GetComponentNumber(UserInputSLA):
    with open(UserInputSLA) as json_file:
        data = json.load(json_file)
        return len(data['mcsla']['sub-SLAs'])

def AvailAggregDecomp(GlobalAvailabilityRate, ServicesNumber):
    X = Symbol('x')
    result = solve(Eq(ServicesNumber *X - ((ServicesNumber*100)-100), GlobalAvailabilityRate))
    return round(float(result[0]),5)

def ThresholdComputation(SLAG, cN):
    T = {}
    CorrTable = {
        "Availability" : "AvailabilitySumType",
        "ResponseTime" : "MaxType",
        "Cost": "sumType"
    }
    for O in SLAG:
        computeMethod = CorrTable[O[0]]
        if computeMethod == "MaxType":
            w = O[1]
        elif computeMethod == "sumType":
            w = O[1] / cN
        elif computeMethod == "AvailabilitySumType":
            w = AvailAggregDecomp(float(O[1]),cN)
        T[O[0]] = [w,O[2]]
    return T

def ComplianceChecking(R, T):
    #Thresholds metric
    for subSLA in R:
        C = R[subSLA][0][1]
        if C in T:
            check = 'NOK'
            print(subSLA, end=": ")
            #print(T[C])
            t = float(T[C][0])
            op = T[C][1]
            ev = R[subSLA][0]
            eID = R[subSLA][0][0]
            eValue = float(R[subSLA][0][3])
            if op == '>=':
                if eValue >= t: 
                    check = 'OK'
            elif op == '>':
                if eValue > t: 
                    check = 'OK'
            elif op == '<=':
                if eValue <= t: 
                    check = 'OK'
            elif op == '<':
                if eValue < t: 
                    check = 'OK'
            ev.insert(4,check)
            print(ev)
        else:
            print('NOK')

## Variables Global :
MCSLA_JSON_FILE = args.MCSLA
RECONF_STRAT_FILE = args.ReconfStrat

print("###################################")
print("Global-SLA: ")
G_SLAobjectives = GetGlobalSLAObjectives(MCSLA_JSON_FILE)
print(G_SLAobjectives)

print("###################################")
ComponenetNumber = GetComponentNumber(MCSLA_JSON_FILE)
print("Number of components : "+str(ComponenetNumber))

print("###################################")
print("Event Thresholds : ")
T = ThresholdComputation(G_SLAobjectives, ComponenetNumber)
print(T)

print("###################################")
print("Reconfiguration Strategy Events : ")
R = GetReconfStratEvents(RECONF_STRAT_FILE)
for subSLA in R:
    print(subSLA, end=": ")
    print(R[subSLA])

print("###################################")
print("Compliance checking : ")
ComplianceChecking(R,T)