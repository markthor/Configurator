/**
 */
package ConfiguratorPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConfiguratorPackage.BinaryConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link ConfiguratorPackage.BinaryConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link ConfiguratorPackage.BinaryConstraint#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getBinaryConstraint()
 * @model
 * @generated
 */
public interface BinaryConstraint extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ConfiguratorPackage.BinaryOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ConfiguratorPackage.BinaryOperators
	 * @see #setOperator(BinaryOperators)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getBinaryConstraint_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperators getOperator();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.BinaryConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ConfiguratorPackage.BinaryOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperators value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getBinaryConstraint_Left()
	 * @model required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.BinaryConstraint#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getBinaryConstraint_Right()
	 * @model required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.BinaryConstraint#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // BinaryConstraint
