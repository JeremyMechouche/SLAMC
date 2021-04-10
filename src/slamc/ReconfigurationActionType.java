/**
 */
package slamc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reconfiguration Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see slamc.SlamcPackage#getReconfigurationActionType()
 * @model
 * @generated
 */
public enum ReconfigurationActionType implements Enumerator {
	/**
	 * The '<em><b>Horizontal Scale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_SCALE(0, "HorizontalScale", "HorizontalScale"),

	/**
	 * The '<em><b>Vertical Scale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_SCALE(0, "VerticalScale", "VerticalScale"),

	/**
	 * The '<em><b>Migration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MIGRATION(0, "Migration", "Migration"),

	/**
	 * The '<em><b>Application Reconfiguration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RECONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_RECONFIGURATION(0, "ApplicationReconfiguration", "ApplicationReconfiguration"),

	/**
	 * The '<em><b>Basic Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_ACTION(0, "BasicAction", "BasicAction"),

	/**
	 * The '<em><b>Composite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITE(0, "Composite", "Composite");

	/**
	 * The '<em><b>Horizontal Scale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal Scale</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_SCALE
	 * @model name="HorizontalScale"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_SCALE_VALUE = 0;

	/**
	 * The '<em><b>Vertical Scale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical Scale</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_SCALE
	 * @model name="VerticalScale"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_SCALE_VALUE = 0;

	/**
	 * The '<em><b>Migration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Migration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIGRATION
	 * @model name="Migration"
	 * @generated
	 * @ordered
	 */
	public static final int MIGRATION_VALUE = 0;

	/**
	 * The '<em><b>Application Reconfiguration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Reconfiguration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RECONFIGURATION
	 * @model name="ApplicationReconfiguration"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_RECONFIGURATION_VALUE = 0;

	/**
	 * The '<em><b>Basic Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC_ACTION
	 * @model name="BasicAction"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_ACTION_VALUE = 0;

	/**
	 * The '<em><b>Composite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE
	 * @model name="Composite"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Reconfiguration Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReconfigurationActionType[] VALUES_ARRAY =
		new ReconfigurationActionType[] {
			HORIZONTAL_SCALE,
			VERTICAL_SCALE,
			MIGRATION,
			APPLICATION_RECONFIGURATION,
			BASIC_ACTION,
			COMPOSITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Reconfiguration Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReconfigurationActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reconfiguration Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReconfigurationActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReconfigurationActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reconfiguration Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReconfigurationActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReconfigurationActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reconfiguration Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReconfigurationActionType get(int value) {
		switch (value) {
			case HORIZONTAL_SCALE_VALUE: return HORIZONTAL_SCALE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReconfigurationActionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ReconfigurationActionType
