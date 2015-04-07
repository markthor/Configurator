/**
 */
package ConfiguratorPackage.impl;

import ConfiguratorPackage.ConfiguratorPackagePackage;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.UnaryConstraint;
import ConfiguratorPackage.UnaryOperators;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConfiguratorPackage.impl.UnaryConstraintImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link ConfiguratorPackage.impl.UnaryConstraintImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryConstraintImpl extends NamedElementImpl implements UnaryConstraint {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final UnaryOperators OPERATOR_EDEFAULT = UnaryOperators.NOT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperators operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorPackagePackage.Literals.UNARY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (Expression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackagePackage.UNARY_CONSTRAINT__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackagePackage.UNARY_CONSTRAINT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperators getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(UnaryOperators newOperator) {
		UnaryOperators oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackagePackage.UNARY_CONSTRAINT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__OPERATOR:
				return getOperator();
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
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__OPERATOR:
				setOperator((UnaryOperators)newValue);
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
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__EXPRESSION:
				return expression != null;
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UnaryConstraintImpl
