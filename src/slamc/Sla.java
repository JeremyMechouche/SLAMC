/**
 */
package slamc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slamc.Sla#getName <em>Name</em>}</li>
 *   <li>{@link slamc.Sla#getServiceCover <em>Service Cover</em>}</li>
 *   <li>{@link slamc.Sla#getStates <em>States</em>}</li>
 *   <li>{@link slamc.Sla#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see slamc.SlamcPackage#getSla()
 * @model
 * @generated
 */
public interface Sla extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see slamc.SlamcPackage#getSla_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link slamc.Sla#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Cover</b></em>' containment reference list.
	 * The list contents are of type {@link slamc.ServiceCovered}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Cover</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Cover</em>' containment reference list.
	 * @see slamc.SlamcPackage#getSla_ServiceCover()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceCovered> getServiceCover();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link slamc.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see slamc.SlamcPackage#getSla_States()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link slamc.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see slamc.SlamcPackage#getSla_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Sla
