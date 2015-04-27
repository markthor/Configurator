/**
 */
package ConfiguratorPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConfiguratorPackage.UnaryConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link ConfiguratorPackage.UnaryConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link ConfiguratorPackage.UnaryConstraint#isRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getUnaryConstraint()
 * @model
 * @generated
 */
public interface UnaryConstraint extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getUnaryConstraint_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.UnaryConstraint#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ConfiguratorPackage.UnaryOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ConfiguratorPackage.UnaryOperators
	 * @see #setOperator(UnaryOperators)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getUnaryConstraint_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperators getOperator();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.UnaryConstraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ConfiguratorPackage.UnaryOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperators value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getUnaryConstraint_Root()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link ConfiguratorPackage.UnaryConstraint#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

} // UnaryConstraint
