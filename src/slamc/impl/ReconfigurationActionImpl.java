/**
 */
package slamc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import slamc.ReconfigurationAction;
import slamc.ReconfigurationActionType;
import slamc.SlamcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfiguration Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slamc.impl.ReconfigurationActionImpl#getId <em>Id</em>}</li>
 *   <li>{@link slamc.impl.ReconfigurationActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link slamc.impl.ReconfigurationActionImpl#getActionAttribute <em>Action Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationActionImpl extends MinimalEObjectImpl.Container implements ReconfigurationAction {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReconfigurationActionType TYPE_EDEFAULT = ReconfigurationActionType.HORIZONTAL_SCALE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationActionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionAttribute() <em>Action Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionAttribute() <em>Action Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionAttribute()
	 * @generated
	 * @ordered
	 */
	protected String actionAttribute = ACTION_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlamcPackage.Literals.RECONFIGURATION_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.RECONFIGURATION_ACTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationActionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ReconfigurationActionType newType) {
		ReconfigurationActionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.RECONFIGURATION_ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionAttribute() {
		return actionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionAttribute(String newActionAttribute) {
		String oldActionAttribute = actionAttribute;
		actionAttribute = newActionAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlamcPackage.RECONFIGURATION_ACTION__ACTION_ATTRIBUTE, oldActionAttribute, actionAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlamcPackage.RECONFIGURATION_ACTION__ID:
				return getId();
			case SlamcPackage.RECONFIGURATION_ACTION__TYPE:
				return getType();
			case SlamcPackage.RECONFIGURATION_ACTION__ACTION_ATTRIBUTE:
				return getActionAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlamcPackage.RECONFIGURATION_ACTION__ID:
				setId((String)newValue);
				return;
			case SlamcPackage.RECONFIGURATION_ACTION__TYPE:
				setType((ReconfigurationActionType)newValue);
				return;
			case SlamcPackage.RECONFIGURATION_ACTION__ACTION_ATTRIBUTE:
				setActionAttribute((String)newValue);
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
			case SlamcPackage.RECONFIGURATION_ACTION__ID:
				setId(ID_EDEFAULT);
				return;
			case SlamcPackage.RECONFIGURATION_ACTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SlamcPackage.RECONFIGURATION_ACTION__ACTION_ATTRIBUTE:
				setActionAttribute(ACTION_ATTRIBUTE_EDEFAULT);
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
			case SlamcPackage.RECONFIGURATION_ACTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SlamcPackage.RECONFIGURATION_ACTION__TYPE:
				return type != TYPE_EDEFAULT;
			case SlamcPackage.RECONFIGURATION_ACTION__ACTION_ATTRIBUTE:
				return ACTION_ATTRIBUTE_EDEFAULT == null ? actionAttribute != null : !ACTION_ATTRIBUTE_EDEFAULT.equals(actionAttribute);
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
		result.append(", type: ");
		result.append(type);
		result.append(", ActionAttribute: ");
		result.append(actionAttribute);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationActionImpl
