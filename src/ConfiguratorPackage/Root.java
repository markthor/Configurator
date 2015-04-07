/**
 */
package ConfiguratorPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ConfiguratorPackage.Root#getConfigurators <em>Configurators</em>}</li>
 *   <li>{@link ConfiguratorPackage.Root#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurators</b></em>' containment reference list.
	 * The list contents are of type {@link ConfiguratorPackage.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurators</em>' containment reference list.
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getRoot_Configurators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurators();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link ConfiguratorPackage.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see ConfiguratorPackage.ConfiguratorPackagePackage#getRoot_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Root
