/**
 */
package slamc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slamc.ReconfigurationAction#getId <em>Id</em>}</li>
 *   <li>{@link slamc.ReconfigurationAction#getType <em>Type</em>}</li>
 *   <li>{@link slamc.ReconfigurationAction#getActionAttribute <em>Action Attribute</em>}</li>
 * </ul>
 *
 * @see slamc.SlamcPackage#getReconfigurationAction()
 * @model
 * @generated
 */
public interface ReconfigurationAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see slamc.SlamcPackage#getReconfigurationAction_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link slamc.ReconfigurationAction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link slamc.ReconfigurationActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see slamc.ReconfigurationActionType
	 * @see #setType(ReconfigurationActionType)
	 * @see slamc.SlamcPackage#getReconfigurationAction_Type()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationActionType getType();

	/**
	 * Sets the value of the '{@link slamc.ReconfigurationAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see slamc.ReconfigurationActionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ReconfigurationActionType value);

	/**
	 * Returns the value of the '<em><b>Action Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Attribute</em>' attribute.
	 * @see #setActionAttribute(String)
	 * @see slamc.SlamcPackage#getReconfigurationAction_ActionAttribute()
	 * @model required="true"
	 * @generated
	 */
	String getActionAttribute();

	/**
	 * Sets the value of the '{@link slamc.ReconfigurationAction#getActionAttribute <em>Action Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Attribute</em>' attribute.
	 * @see #getActionAttribute()
	 * @generated
	 */
	void setActionAttribute(String value);

} // ReconfigurationAction
