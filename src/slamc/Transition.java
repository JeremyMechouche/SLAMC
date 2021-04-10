/**
 */
package slamc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slamc.Transition#getId <em>Id</em>}</li>
 *   <li>{@link slamc.Transition#getStateSource <em>State Source</em>}</li>
 *   <li>{@link slamc.Transition#getStateTarget <em>State Target</em>}</li>
 *   <li>{@link slamc.Transition#getEvents <em>Events</em>}</li>
 *   <li>{@link slamc.Transition#getReconfigurationActions <em>Reconfiguration Actions</em>}</li>
 * </ul>
 *
 * @see slamc.SlamcPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see slamc.SlamcPackage#getTransition_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link slamc.Transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Source</em>' reference.
	 * @see #setStateSource(State)
	 * @see slamc.SlamcPackage#getTransition_StateSource()
	 * @model required="true"
	 * @generated
	 */
	State getStateSource();

	/**
	 * Sets the value of the '{@link slamc.Transition#getStateSource <em>State Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Source</em>' reference.
	 * @see #getStateSource()
	 * @generated
	 */
	void setStateSource(State value);

	/**
	 * Returns the value of the '<em><b>State Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Target</em>' reference.
	 * @see #setStateTarget(State)
	 * @see slamc.SlamcPackage#getTransition_StateTarget()
	 * @model required="true"
	 * @generated
	 */
	State getStateTarget();

	/**
	 * Sets the value of the '{@link slamc.Transition#getStateTarget <em>State Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Target</em>' reference.
	 * @see #getStateTarget()
	 * @generated
	 */
	void setStateTarget(State value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link slamc.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see slamc.SlamcPackage#getTransition_Events()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Actions</b></em>' containment reference list.
	 * The list contents are of type {@link slamc.ReconfigurationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Actions</em>' containment reference list.
	 * @see slamc.SlamcPackage#getTransition_ReconfigurationActions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReconfigurationAction> getReconfigurationActions();

} // Transition
