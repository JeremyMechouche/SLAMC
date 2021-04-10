/**
 */
package slamc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see slamc.SlamcFactory
 * @model kind="package"
 * @generated
 */
public interface SlamcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slamc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/slamc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.slamc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlamcPackage eINSTANCE = slamc.impl.SlamcPackageImpl.init();

	/**
	 * The meta object id for the '{@link slamc.impl.SlaImpl <em>Sla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.SlaImpl
	 * @see slamc.impl.SlamcPackageImpl#getSla()
	 * @generated
	 */
	int SLA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Cover</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__SERVICE_COVER = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__STATES = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__TRANSITIONS = 3;

	/**
	 * The number of structural features of the '<em>Sla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.ServiceCoveredImpl <em>Service Covered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.ServiceCoveredImpl
	 * @see slamc.impl.SlamcPackageImpl#getServiceCovered()
	 * @generated
	 */
	int SERVICE_COVERED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COVERED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COVERED__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Service Covered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COVERED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Covered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COVERED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.ServiceImpl
	 * @see slamc.impl.SlamcPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Partie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARTIE = 0;

	/**
	 * The feature id for the '<em><b>Slos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SLOS = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.SloImpl <em>Slo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.SloImpl
	 * @see slamc.impl.SlamcPackageImpl#getSlo()
	 * @generated
	 */
	int SLO = 3;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO__CHARACTERISTIC = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO__OPERATOR = 4;

	/**
	 * The number of structural features of the '<em>Slo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Slo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.StateImpl
	 * @see slamc.impl.SlamcPackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.TransitionImpl
	 * @see slamc.impl.SlamcPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 0;

	/**
	 * The feature id for the '<em><b>State Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>State Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Reconfiguration Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RECONFIGURATION_ACTIONS = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.EventImpl
	 * @see slamc.impl.SlamcPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PREDICATE = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.ReconfigurationActionImpl <em>Reconfiguration Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.ReconfigurationActionImpl
	 * @see slamc.impl.SlamcPackageImpl#getReconfigurationAction()
	 * @generated
	 */
	int RECONFIGURATION_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Action Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION__ACTION_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Reconfiguration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reconfiguration Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.impl.CloudResourceImpl <em>Cloud Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.impl.CloudResourceImpl
	 * @see slamc.impl.SlamcPackageImpl#getCloudResource()
	 * @generated
	 */
	int CLOUD_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__SIZE = 2;

	/**
	 * The number of structural features of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cloud Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link slamc.SloType <em>Slo Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.SloType
	 * @see slamc.impl.SlamcPackageImpl#getSloType()
	 * @generated
	 */
	int SLO_TYPE = 9;

	/**
	 * The meta object id for the '{@link slamc.SloComparisonOperator <em>Slo Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.SloComparisonOperator
	 * @see slamc.impl.SlamcPackageImpl#getSloComparisonOperator()
	 * @generated
	 */
	int SLO_COMPARISON_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link slamc.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.StateType
	 * @see slamc.impl.SlamcPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 11;

	/**
	 * The meta object id for the '{@link slamc.ReconfigurationActionType <em>Reconfiguration Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.ReconfigurationActionType
	 * @see slamc.impl.SlamcPackageImpl#getReconfigurationActionType()
	 * @generated
	 */
	int RECONFIGURATION_ACTION_TYPE = 12;

	/**
	 * The meta object id for the '{@link slamc.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see slamc.EventType
	 * @see slamc.impl.SlamcPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link slamc.Sla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sla</em>'.
	 * @see slamc.Sla
	 * @generated
	 */
	EClass getSla();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Sla#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see slamc.Sla#getName()
	 * @see #getSla()
	 * @generated
	 */
	EAttribute getSla_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.Sla#getServiceCover <em>Service Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Cover</em>'.
	 * @see slamc.Sla#getServiceCover()
	 * @see #getSla()
	 * @generated
	 */
	EReference getSla_ServiceCover();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.Sla#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see slamc.Sla#getStates()
	 * @see #getSla()
	 * @generated
	 */
	EReference getSla_States();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.Sla#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see slamc.Sla#getTransitions()
	 * @see #getSla()
	 * @generated
	 */
	EReference getSla_Transitions();

	/**
	 * Returns the meta object for class '{@link slamc.ServiceCovered <em>Service Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Covered</em>'.
	 * @see slamc.ServiceCovered
	 * @generated
	 */
	EClass getServiceCovered();

	/**
	 * Returns the meta object for the attribute '{@link slamc.ServiceCovered#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see slamc.ServiceCovered#getName()
	 * @see #getServiceCovered()
	 * @generated
	 */
	EAttribute getServiceCovered_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.ServiceCovered#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see slamc.ServiceCovered#getServices()
	 * @see #getServiceCovered()
	 * @generated
	 */
	EReference getServiceCovered_Services();

	/**
	 * Returns the meta object for class '{@link slamc.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see slamc.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Service#getPartie <em>Partie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partie</em>'.
	 * @see slamc.Service#getPartie()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Partie();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.Service#getSlos <em>Slos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slos</em>'.
	 * @see slamc.Service#getSlos()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Slos();

	/**
	 * Returns the meta object for class '{@link slamc.Slo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slo</em>'.
	 * @see slamc.Slo
	 * @generated
	 */
	EClass getSlo();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Slo#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic</em>'.
	 * @see slamc.Slo#getCharacteristic()
	 * @see #getSlo()
	 * @generated
	 */
	EAttribute getSlo_Characteristic();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Slo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see slamc.Slo#getType()
	 * @see #getSlo()
	 * @generated
	 */
	EAttribute getSlo_Type();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Slo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see slamc.Slo#getValue()
	 * @see #getSlo()
	 * @generated
	 */
	EAttribute getSlo_Value();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Slo#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see slamc.Slo#getUnit()
	 * @see #getSlo()
	 * @generated
	 */
	EAttribute getSlo_Unit();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Slo#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see slamc.Slo#getOperator()
	 * @see #getSlo()
	 * @generated
	 */
	EAttribute getSlo_Operator();

	/**
	 * Returns the meta object for class '{@link slamc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see slamc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link slamc.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see slamc.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the attribute '{@link slamc.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see slamc.State#getType()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.State#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see slamc.State#getResources()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Resources();

	/**
	 * Returns the meta object for class '{@link slamc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see slamc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see slamc.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the reference '{@link slamc.Transition#getStateSource <em>State Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Source</em>'.
	 * @see slamc.Transition#getStateSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_StateSource();

	/**
	 * Returns the meta object for the reference '{@link slamc.Transition#getStateTarget <em>State Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Target</em>'.
	 * @see slamc.Transition#getStateTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_StateTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.Transition#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see slamc.Transition#getEvents()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link slamc.Transition#getReconfigurationActions <em>Reconfiguration Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reconfiguration Actions</em>'.
	 * @see slamc.Transition#getReconfigurationActions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ReconfigurationActions();

	/**
	 * Returns the meta object for class '{@link slamc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see slamc.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Event#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see slamc.Event#getId()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Id();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see slamc.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link slamc.Event#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see slamc.Event#getPredicate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Predicate();

	/**
	 * Returns the meta object for class '{@link slamc.ReconfigurationAction <em>Reconfiguration Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Action</em>'.
	 * @see slamc.ReconfigurationAction
	 * @generated
	 */
	EClass getReconfigurationAction();

	/**
	 * Returns the meta object for the attribute '{@link slamc.ReconfigurationAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see slamc.ReconfigurationAction#getId()
	 * @see #getReconfigurationAction()
	 * @generated
	 */
	EAttribute getReconfigurationAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link slamc.ReconfigurationAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see slamc.ReconfigurationAction#getType()
	 * @see #getReconfigurationAction()
	 * @generated
	 */
	EAttribute getReconfigurationAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link slamc.ReconfigurationAction#getActionAttribute <em>Action Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Attribute</em>'.
	 * @see slamc.ReconfigurationAction#getActionAttribute()
	 * @see #getReconfigurationAction()
	 * @generated
	 */
	EAttribute getReconfigurationAction_ActionAttribute();

	/**
	 * Returns the meta object for class '{@link slamc.CloudResource <em>Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Resource</em>'.
	 * @see slamc.CloudResource
	 * @generated
	 */
	EClass getCloudResource();

	/**
	 * Returns the meta object for the attribute '{@link slamc.CloudResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see slamc.CloudResource#getName()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link slamc.CloudResource#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see slamc.CloudResource#getProvider()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Provider();

	/**
	 * Returns the meta object for the attribute '{@link slamc.CloudResource#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see slamc.CloudResource#getSize()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_Size();

	/**
	 * Returns the meta object for enum '{@link slamc.SloType <em>Slo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slo Type</em>'.
	 * @see slamc.SloType
	 * @generated
	 */
	EEnum getSloType();

	/**
	 * Returns the meta object for enum '{@link slamc.SloComparisonOperator <em>Slo Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slo Comparison Operator</em>'.
	 * @see slamc.SloComparisonOperator
	 * @generated
	 */
	EEnum getSloComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link slamc.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see slamc.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link slamc.ReconfigurationActionType <em>Reconfiguration Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reconfiguration Action Type</em>'.
	 * @see slamc.ReconfigurationActionType
	 * @generated
	 */
	EEnum getReconfigurationActionType();

	/**
	 * Returns the meta object for enum '{@link slamc.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see slamc.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlamcFactory getSlamcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link slamc.impl.SlaImpl <em>Sla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.SlaImpl
		 * @see slamc.impl.SlamcPackageImpl#getSla()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSla();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__NAME = eINSTANCE.getSla_Name();

		/**
		 * The meta object literal for the '<em><b>Service Cover</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__SERVICE_COVER = eINSTANCE.getSla_ServiceCover();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__STATES = eINSTANCE.getSla_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__TRANSITIONS = eINSTANCE.getSla_Transitions();

		/**
		 * The meta object literal for the '{@link slamc.impl.ServiceCoveredImpl <em>Service Covered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.ServiceCoveredImpl
		 * @see slamc.impl.SlamcPackageImpl#getServiceCovered()
		 * @generated
		 */
		EClass SERVICE_COVERED = eINSTANCE.getServiceCovered();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COVERED__NAME = eINSTANCE.getServiceCovered_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COVERED__SERVICES = eINSTANCE.getServiceCovered_Services();

		/**
		 * The meta object literal for the '{@link slamc.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.ServiceImpl
		 * @see slamc.impl.SlamcPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Partie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PARTIE = eINSTANCE.getService_Partie();

		/**
		 * The meta object literal for the '<em><b>Slos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SLOS = eINSTANCE.getService_Slos();

		/**
		 * The meta object literal for the '{@link slamc.impl.SloImpl <em>Slo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.SloImpl
		 * @see slamc.impl.SlamcPackageImpl#getSlo()
		 * @generated
		 */
		EClass SLO = eINSTANCE.getSlo();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO__CHARACTERISTIC = eINSTANCE.getSlo_Characteristic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO__TYPE = eINSTANCE.getSlo_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO__VALUE = eINSTANCE.getSlo_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO__UNIT = eINSTANCE.getSlo_Unit();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO__OPERATOR = eINSTANCE.getSlo_Operator();

		/**
		 * The meta object literal for the '{@link slamc.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.StateImpl
		 * @see slamc.impl.SlamcPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TYPE = eINSTANCE.getState_Type();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__RESOURCES = eINSTANCE.getState_Resources();

		/**
		 * The meta object literal for the '{@link slamc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.TransitionImpl
		 * @see slamc.impl.SlamcPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ID = eINSTANCE.getTransition_Id();

		/**
		 * The meta object literal for the '<em><b>State Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATE_SOURCE = eINSTANCE.getTransition_StateSource();

		/**
		 * The meta object literal for the '<em><b>State Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATE_TARGET = eINSTANCE.getTransition_StateTarget();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENTS = eINSTANCE.getTransition_Events();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RECONFIGURATION_ACTIONS = eINSTANCE.getTransition_ReconfigurationActions();

		/**
		 * The meta object literal for the '{@link slamc.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.EventImpl
		 * @see slamc.impl.SlamcPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ID = eINSTANCE.getEvent_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__PREDICATE = eINSTANCE.getEvent_Predicate();

		/**
		 * The meta object literal for the '{@link slamc.impl.ReconfigurationActionImpl <em>Reconfiguration Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.ReconfigurationActionImpl
		 * @see slamc.impl.SlamcPackageImpl#getReconfigurationAction()
		 * @generated
		 */
		EClass RECONFIGURATION_ACTION = eINSTANCE.getReconfigurationAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_ACTION__ID = eINSTANCE.getReconfigurationAction_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_ACTION__TYPE = eINSTANCE.getReconfigurationAction_Type();

		/**
		 * The meta object literal for the '<em><b>Action Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION_ACTION__ACTION_ATTRIBUTE = eINSTANCE.getReconfigurationAction_ActionAttribute();

		/**
		 * The meta object literal for the '{@link slamc.impl.CloudResourceImpl <em>Cloud Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.impl.CloudResourceImpl
		 * @see slamc.impl.SlamcPackageImpl#getCloudResource()
		 * @generated
		 */
		EClass CLOUD_RESOURCE = eINSTANCE.getCloudResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__NAME = eINSTANCE.getCloudResource_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__PROVIDER = eINSTANCE.getCloudResource_Provider();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__SIZE = eINSTANCE.getCloudResource_Size();

		/**
		 * The meta object literal for the '{@link slamc.SloType <em>Slo Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.SloType
		 * @see slamc.impl.SlamcPackageImpl#getSloType()
		 * @generated
		 */
		EEnum SLO_TYPE = eINSTANCE.getSloType();

		/**
		 * The meta object literal for the '{@link slamc.SloComparisonOperator <em>Slo Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.SloComparisonOperator
		 * @see slamc.impl.SlamcPackageImpl#getSloComparisonOperator()
		 * @generated
		 */
		EEnum SLO_COMPARISON_OPERATOR = eINSTANCE.getSloComparisonOperator();

		/**
		 * The meta object literal for the '{@link slamc.StateType <em>State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.StateType
		 * @see slamc.impl.SlamcPackageImpl#getStateType()
		 * @generated
		 */
		EEnum STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '{@link slamc.ReconfigurationActionType <em>Reconfiguration Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.ReconfigurationActionType
		 * @see slamc.impl.SlamcPackageImpl#getReconfigurationActionType()
		 * @generated
		 */
		EEnum RECONFIGURATION_ACTION_TYPE = eINSTANCE.getReconfigurationActionType();

		/**
		 * The meta object literal for the '{@link slamc.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see slamc.EventType
		 * @see slamc.impl.SlamcPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

	}

} //SlamcPackage
