/**
 */
package slamc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slamc.Service#getPartie <em>Partie</em>}</li>
 *   <li>{@link slamc.Service#getSlos <em>Slos</em>}</li>
 * </ul>
 *
 * @see slamc.SlamcPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Partie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partie</em>' attribute.
	 * @see #setPartie(String)
	 * @see slamc.SlamcPackage#getService_Partie()
	 * @model required="true"
	 * @generated
	 */
	String getPartie();

	/**
	 * Sets the value of the '{@link slamc.Service#getPartie <em>Partie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partie</em>' attribute.
	 * @see #getPartie()
	 * @generated
	 */
	void setPartie(String value);

	/**
	 * Returns the value of the '<em><b>Slos</b></em>' containment reference list.
	 * The list contents are of type {@link slamc.Slo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slos</em>' containment reference list.
	 * @see slamc.SlamcPackage#getService_Slos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Slo> getSlos();

} // Service
