/**
 */
package ConfiguratorPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConfiguratorPackage.StringValue#getValue <em>Value</em>}</li>
 *   <li>{@link ConfiguratorPackage.StringValue#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getStringValue()
 * @model
 * @generated
 */
public interface StringValue extends Value {
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
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getStringValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.StringValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"StringType"</code>.
	 * The literals are from the enumeration {@link ConfiguratorPackage.TypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ConfiguratorPackage.TypeEnum
	 * @see #setType(TypeEnum)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getStringValue_Type()
	 * @model default="StringType" dataType="ConfiguratorPackage.TypeEnum" required="true"
	 * @generated
	 */
	TypeEnum getType();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.StringValue#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ConfiguratorPackage.TypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeEnum value);

} // StringValue
