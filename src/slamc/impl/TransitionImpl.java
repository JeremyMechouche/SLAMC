/**
 */
package slamc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import slamc.Event;
import slamc.ReconfigurationAction;
import slamc.SlamcPackage;
import slamc.State;
import slamc.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slamc.impl.TransitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link slamc.impl.TransitionImpl#getStateSource <em>State Source</em>}</li>
 *   <li>{@link slamc.impl.TransitionImpl#getStateTarget <em>State Target</em>}</li>
 *   <li>{@link slamc.impl.TransitionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link slamc.impl.TransitionImpl#getReconfigurationActions <em>Reconfiguration Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateSource() <em>State Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSource()
	 * @generated
	 * @ordered
	 */
	protected State stateSource;

	/**
	 * The cached value of the '{@link #getStateTarget() <em>State Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTarget()
	 * @generated
	 * @ordered
	 */
	protected State stateTarget;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getReconfigurationActions() <em>Reconfiguration Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationAction> reconfigurationActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlamcPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.TRANSITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateSource() {
		if (stateSource != null && stateSource.eIsProxy()) {
			InternalEObject oldStateSource = (InternalEObject)stateSource;
			stateSource = (State)eResolveProxy(oldStateSource);
			if (stateSource != oldStateSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlamcPackage.TRANSITION__STATE_SOURCE, oldStateSource, stateSource));
			}
		}
		return stateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateSource() {
		return stateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateSource(State newStateSource) {
		State oldStateSource = stateSource;
		stateSource = newStateSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.TRANSITION__STATE_SOURCE, oldStateSource, stateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateTarget() {
		if (stateTarget != null && stateTarget.eIsProxy()) {
			InternalEObject oldStateTarget = (InternalEObject)stateTarget;
			stateTarget = (State)eResolveProxy(oldStateTarget);
			if (stateTarget != oldStateTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlamcPackage.TRANSITION__STATE_TARGET, oldStateTarget, stateTarget));
			}
		}
		return stateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateTarget() {
		return stateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTarget(State newStateTarget) {
		State oldStateTarget = stateTarget;
		stateTarget = newStateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.TRANSITION__STATE_TARGET, oldStateTarget, stateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, SlamcPackage.TRANSITION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationAction> getReconfigurationActions() {
		if (reconfigurationActions == null) {
			reconfigurationActions = new EObjectContainmentEList<ReconfigurationAction>(ReconfigurationAction.class, this, SlamcPackage.TRANSITION__RECONFIGURATION_ACTIONS);
		}
		return reconfigurationActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlamcPackage.TRANSITION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case SlamcPackage.TRANSITION__RECONFIGURATION_ACTIONS:
				return ((InternalEList<?>)getReconfigurationActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlamcPackage.TRANSITION__ID:
				return getId();
			case SlamcPackage.TRANSITION__STATE_SOURCE:
				if (resolve) return getStateSource();
				return basicGetStateSource();
			case SlamcPackage.TRANSITION__STATE_TARGET:
				if (resolve) return getStateTarget();
				return basicGetStateTarget();
			case SlamcPackage.TRANSITION__EVENTS:
				return getEvents();
			case SlamcPackage.TRANSITION__RECONFIGURATION_ACTIONS:
				return getReconfigurationActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlamcPackage.TRANSITION__ID:
				setId((String)newValue);
				return;
			case SlamcPackage.TRANSITION__STATE_SOURCE:
				setStateSource((State)newValue);
				return;
			case SlamcPackage.TRANSITION__STATE_TARGET:
				setStateTarget((State)newValue);
				return;
			case SlamcPackage.TRANSITION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case SlamcPackage.TRANSITION__RECONFIGURATION_ACTIONS:
				getReconfigurationActions().clear();
				getReconfigurationActions().addAll((Collection<? extends ReconfigurationAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlamcPackage.TRANSITION__ID:
				setId(ID_EDEFAULT);
				return;
			case SlamcPackage.TRANSITION__STATE_SOURCE:
				setStateSource((State)null);
				return;
			case SlamcPackage.TRANSITION__STATE_TARGET:
				setStateTarget((State)null);
				return;
			case SlamcPackage.TRANSITION__EVENTS:
				getEvents().clear();
				return;
			case SlamcPackage.TRANSITION__RECONFIGURATION_ACTIONS:
				getReconfigurationActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlamcPackage.TRANSITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SlamcPackage.TRANSITION__STATE_SOURCE:
				return stateSource != null;
			case SlamcPackage.TRANSITION__STATE_TARGET:
				return stateTarget != null;
			case SlamcPackage.TRANSITION__EVENTS:
				return events != null && !events.isEmpty();
			case SlamcPackage.TRANSITION__RECONFIGURATION_ACTIONS:
				return reconfigurationActions != null && !reconfigurationActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
