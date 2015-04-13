/*
 * generated by Xtext
 */
package org.xtext.cfgdsl.validation

import ConfiguratorPackage.BinaryConstraint
import ConfiguratorPackage.BooleanValue
import ConfiguratorPackage.Configuration
import ConfiguratorPackage.Expression
import ConfiguratorPackage.IntegerValue
import ConfiguratorPackage.NamedElement
import ConfiguratorPackage.Parameter
import ConfiguratorPackage.Root
import ConfiguratorPackage.Set
import ConfiguratorPackage.StringValue
import ConfiguratorPackage.TypeEnum
import ConfiguratorPackage.UnaryConstraint
import ConfiguratorPackage.Value
import java.util.HashMap
import java.util.HashSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

import static ConfiguratorPackage.BinaryOperators.*

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class CfgDslValidator extends AbstractCfgDslValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	/* Fall back for all types that are not constrained */
	def static dispatch boolean constraint(EObject it) {
		true
	}

	@Check
	def static dispatch boolean constraint(NamedElement it) {
		name != null && !name.isEmpty
	}
	
	def static dispatch boolean constraint(Root it){
		constraintAssignment(it) && constraintParams(it)
	}
	
	/**
	 * Check for unique parameters in the root element.
	 * If the sizes of the params and unique params are not the same
	 * we have duplicate entries
	 */
	def static dispatch boolean constraintParams(Root it){
		val params = expressions.filter[e | e instanceof Parameter]
		val uniqueParams = params.fold(new HashSet<String>) [ s, e | s.add(e.name); s ]
		params.size == uniqueParams.size
	}
	
	/**
	 * Check that the value of each assignment has the correct type according to the assigned type of the parameter
	 */
	def static dispatch boolean constraintAssignment(Root it){
		val params = expressions.filter[e | e instanceof Parameter]
		val typeMap = params.fold(new HashMap<String, TypeEnum>)[ m, e | val p = e as Parameter; m.put(p.name, p.type); m]
		configurators.forall [c | 
			val strings	 = c.assignments.filter [ a | a instanceof StringValue ]
			val integers = c.assignments.filter [ a | a instanceof IntegerValue ]
			val booleans = c.assignments.filter [ a | a instanceof BooleanValue ]
			
			val stringsSatisfied  = strings.fold(true)  [ b, a | b && typeMap.get(a.parameter.name).equals(TypeEnum.STRING_TYPE) ]
			val integersSatisfied = integers.fold(true) [ b, a | b && typeMap.get(a.parameter.name).equals(TypeEnum.INTEGER_TYPE) ]
			val booleansSatisfied = booleans.fold(true) [ b, a | b && typeMap.get(a.parameter.name).equals(TypeEnum.BOOLEAN_TYPE) ]
			
			stringsSatisfied && integersSatisfied && booleansSatisfied
		]
	}
	
	/**
	 * Check for unique parameters in a given configuration
	 */
	def static dispatch boolean constraintOneAssignmentPerParameter(Configuration it) {
		val uniqueParams = assignments.fold(new HashSet<String>) [ s, a | s.add(a.parameter.name); s ]
		uniqueParams.size == assignments.size
	}
	
	/**
	 * Check that the types of BinaryConstraints are good
	 */
	def static dispatch boolean constraintBinary(BinaryConstraint it) {
		switch (operator) {
		case ADDITION:
			valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case AND:
			valueResolver(left).equals(TypeEnum.BOOLEAN_TYPE) && valueResolver(right).equals(TypeEnum.BOOLEAN_TYPE)
		case EQUAL:
			valueResolver(left).equals(valueResolver(right))
		case GREATER:
			valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case LESS:
			valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case MULTIPLICATION:
			valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case OR:
			valueResolver(left).equals(TypeEnum.BOOLEAN_TYPE) && valueResolver(right).equals(TypeEnum.BOOLEAN_TYPE)
		case SUBSET:
			valueResolver(left).equals(valueResolver(right))
		default:
			false
		}
	}
	
	/**
	 * Recursively resolve the type of an Expression
	 */
	def static TypeEnum valueResolver(Expression it) {
		if(it instanceof StringValue)
			return TypeEnum.STRING_TYPE
		if(it instanceof IntegerValue)
			return TypeEnum.INTEGER_TYPE
		if(it instanceof BooleanValue)
			return TypeEnum.BOOLEAN_TYPE
		if(it instanceof BinaryConstraint) {
			switch ((it as BinaryConstraint).operator) {
			case ADDITION:
				return TypeEnum.INTEGER_TYPE
			case AND:
				return TypeEnum.BOOLEAN_TYPE
			case EQUAL:
				return TypeEnum.BOOLEAN_TYPE
			case GREATER:
				return TypeEnum.BOOLEAN_TYPE
			case LESS:
				return TypeEnum.BOOLEAN_TYPE
			case MULTIPLICATION:
				return TypeEnum.INTEGER_TYPE
			case OR:
				return TypeEnum.BOOLEAN_TYPE
			case SUBSET:
				return TypeEnum.BOOLEAN_TYPE
			}
		}
		if(it instanceof Set) {
			val element = (it as Set).has.get(0)
			if(element instanceof StringValue)
				return TypeEnum.STRING_TYPE
			if(element instanceof IntegerValue)
				return TypeEnum.INTEGER_TYPE
			if(element instanceof BooleanValue)
				return TypeEnum.BOOLEAN_TYPE
		}		
		if(it instanceof UnaryConstraint) {
			return TypeEnum.BOOLEAN_TYPE
		}
	}
	
	/**
	 * Make sure that the expression of a unary constraint is a BooleanValue
	 */
	def static dispatch boolean constraintUnary(UnaryConstraint it) {
		valueResolver(expression).equals(TypeEnum.BOOLEAN_TYPE)
	}
	
	/**
	 * Check that a set is not empty and all values have the same type
	 */
	def static dispatch boolean constraintSet(Set it) {
		it.has.size > 0 && it.has.fold(true) [ b, v | b && v.class == it.has.get(0).class ]
	}
}