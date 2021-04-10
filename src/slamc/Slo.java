/**
 */
package slamc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slamc.Slo#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link slamc.Slo#getType <em>Type</em>}</li>
 *   <li>{@link slamc.Slo#getValue <em>Value</em>}</li>
 *   <li>{@link slamc.Slo#getUnit <em>Unit</em>}</li>
 *   <li>{@link slamc.Slo#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see slamc.SlamcPackage#getSlo()
 * @model
 * @generated
 */
public interface Slo extends EObject {
	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' attribute.
	 * @see #setCharacteristic(String)
	 * @see slamc.SlamcPackage#getSlo_Characteristic()
	 * @model required="true"
	 * @generated
	 */
	String getCharacteristic();

	/**
	 * Sets the value of the '{@link slamc.Slo#getCharacteristic <em>Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic</em>' attribute.
	 * @see #getCharacteristic()
	 * @generated
	 */
	void setCharacteristic(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link slamc.SloType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see slamc.SloType
	 * @see #setType(SloType)
	 * @see slamc.SlamcPackage#getSlo_Type()
	 * @model required="true"
	 * @generated
	 */
	SloType getType();

	/**
	 * Sets the value of the '{@link slamc.Slo#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see slamc.SloType
	 * @see #getType()
	 * @generated
	 */
	void setType(SloType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see slamc.SlamcPackage#getSlo_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link slamc.Slo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see slamc.SlamcPackage#getSlo_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link slamc.Slo#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link slamc.SloComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see slamc.SloComparisonOperator
	 * @see #setOperator(SloComparisonOperator)
	 * @see slamc.SlamcPackage#getSlo_Operator()
	 * @model required="true"
	 * @generated
	 */
	SloComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link slamc.Slo#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see slamc.SloComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SloComparisonOperator value);

} // Slo
