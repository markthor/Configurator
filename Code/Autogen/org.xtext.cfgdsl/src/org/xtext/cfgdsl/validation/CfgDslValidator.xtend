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

	def static dispatch boolean constraint(NamedElement it) {
		name != null && !name.isEmpty
	}
	
	def static dispatch boolean constraint(Root it){
		constraintAssignment(it) && constraintParams(it)
	}
	
	def static dispatch boolean constraint(Configuration it) {
		constraintOneAssignmentPerParameter(it)
	}
	
	def static dispatch boolean constraint(Set it) {
		constraintSet(it)
	}
	
	def static dispatch boolean constraint(BinaryConstraint it) {
		constraintBinary(it) && constraintBinaryRoot(it)
	}
	
	def static dispatch boolean constraint(UnaryConstraint it) {
		constraintUnary(it)
	}
	
	def static dispatch boolean constraint(Value it) {
		constraintValueType(it)
	}
	
	def static dispatch boolean constraint(Parameter it){
		val ne = it as NamedElement
		constraint(ne) && type != null
	}
	
	/**
	 * Check for unique parameters in the root element.
	 * If the sizes of the params and unique params are not the same
	 * we have duplicate entries
	 */
	def static boolean constraintParams(Root it){
		println("Starting constraintParams")
		
		val params = expressions.filter[e | e instanceof Parameter]
		val uniqueParams = params.fold(new HashSet<String>) [ s, e | s.add(e.name); s ]
		val b = params.size == uniqueParams.size
		
		println("Done with constraintParams. b="+b)
		b
	}
	
	/**
	 * Check that the value of each assignment has the correct type according to the assigned type of the parameter
	 */
	def static boolean constraintAssignment(Root it){
		val params = expressions.filter[e | e instanceof Parameter]
		val typeMap = params.fold(new HashMap<String, TypeEnum>)[ m, e | val p = e as Parameter; m.put(p.name, p.type); m]
		configurators.forall [c | 
			val strings	 = c.assignments.filter [ a | a.value instanceof StringValue ]
			val integers = c.assignments.filter [ a | a.value instanceof IntegerValue ]
			val booleans = c.assignments.filter [ a | a.value instanceof BooleanValue ]
			
			val stringsSatisfied  = strings.fold(true)  [ b, a | b && TypeEnum.STRING_TYPE.equals(typeMap.get(a.parameter.name)) ]
			val integersSatisfied = integers.fold(true) [ b, a | b && TypeEnum.INTEGER_TYPE.equals(typeMap.get(a.parameter.name)) ]
			val booleansSatisfied = booleans.fold(true) [ b, a | b && TypeEnum.BOOLEAN_TYPE.equals(typeMap.get(a.parameter.name)) ]
			
			stringsSatisfied && integersSatisfied && booleansSatisfied
		]
	}
	
	def static boolean constraintValueType(Value it) {
		if(it instanceof IntegerValue) {
			val i = it as IntegerValue
			return TypeEnum.INTEGER_TYPE.equals(i.type)
		}
		if(it instanceof StringValue) {
			val i = it as StringValue
			return TypeEnum.STRING_TYPE.equals(i.type)
		}
		if(it instanceof BooleanValue) {
			val i = it as BooleanValue
			return TypeEnum.BOOLEAN_TYPE.equals(i.type)
		}
		return false
	}
	
	/**
	 * Check for unique parameters in a given configuration
	 */
	def static boolean constraintOneAssignmentPerParameter(Configuration it) {
		println("Starting constraintOneAssignmentPerParameter")
		
		val list = assignments.filter()[a | a.parameter == null || a.value == null]
		if(list.size != 0)
			return false;
		
		if(!assignments.fold(true)[b, a | val p = a.parameter as Parameter; b && constraint(p)])
			return false;
		
		val uniqueParams = assignments.fold(new HashSet<String>) [ s, a | s.add(a.parameter.name); s ]
		val b = uniqueParams.size == assignments.size
		
		println("Done with constraintOneAssignmentPerParameter. b="+b)
		b
	}
	
	/**
	 * Check that the types of BinaryConstraints are good
	 */
	def static boolean constraintBinary(BinaryConstraint it) {
		println("Starting constraintBinary")
		var b = false
		switch (operator) {
		case ADDITION:
			b = valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case AND:
			b = valueResolver(left).equals(TypeEnum.BOOLEAN_TYPE) && valueResolver(right).equals(TypeEnum.BOOLEAN_TYPE)
		case EQUAL:
			b = valueResolver(left).equals(valueResolver(right))
		case GREATER:
			b = valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case LESS:
			b = valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case MULTIPLICATION:
			b = valueResolver(left).equals(TypeEnum.INTEGER_TYPE) && valueResolver(right).equals(TypeEnum.INTEGER_TYPE)
		case OR:
			b = valueResolver(left).equals(TypeEnum.BOOLEAN_TYPE) && valueResolver(right).equals(TypeEnum.BOOLEAN_TYPE)
		case SUBSET:
			b = valueResolver(left).equals(valueResolver(right))
		}
		println("Done with constraintBinary. b="+b)
		b
	}
	
	def static boolean constraintBinaryRoot(BinaryConstraint it) {
		println("Starting constraintBinaryRoot")
		var b = true
		
		if(root)
			b = expressionResolver(left) && expressionResolver(right)
		
		println("Done with constraintBinaryRoot. b="+b)
		b
	}
	
	def static boolean expressionResolver(Expression it) {
		if(it instanceof BinaryConstraint) {
			val bc = it as BinaryConstraint
			if(bc.root) {
				return false;
			} else {
				return expressionResolver(left) && expressionResolver(right)
			}
		} else if(it instanceof UnaryConstraint) {
			val uc = it as UnaryConstraint
			return expressionResolver(uc.expression)
		}
		true
	}
	
	/**
	 * Recursively resolve the type of an Expression
	 */
	def static TypeEnum valueResolver(Expression it) {
		println("Starting valueResolver")
		var t = TypeEnum.STRING_TYPE;
		
		if(it instanceof StringValue)
			t = TypeEnum.STRING_TYPE
		if(it instanceof IntegerValue)
			t = TypeEnum.INTEGER_TYPE
		if(it instanceof BooleanValue)
			t = TypeEnum.BOOLEAN_TYPE
		if(it instanceof BinaryConstraint) {
			switch ((it as BinaryConstraint).operator) {
			case ADDITION:
				t = TypeEnum.INTEGER_TYPE
			case AND:
				t = TypeEnum.BOOLEAN_TYPE
			case EQUAL:
				t = TypeEnum.BOOLEAN_TYPE
			case GREATER:
				t = TypeEnum.BOOLEAN_TYPE
			case LESS:
				t = TypeEnum.BOOLEAN_TYPE
			case MULTIPLICATION:
				t = TypeEnum.INTEGER_TYPE
			case OR:
				t = TypeEnum.BOOLEAN_TYPE
			case SUBSET:
				t = TypeEnum.BOOLEAN_TYPE
			}
		}
		if(it instanceof Set) {
			val element = (it as Set).has.get(0)
			if(element instanceof StringValue)
				t = TypeEnum.STRING_TYPE
			if(element instanceof IntegerValue)
				t = TypeEnum.INTEGER_TYPE
			if(element instanceof BooleanValue)
				t = TypeEnum.BOOLEAN_TYPE
		}
		if(it instanceof UnaryConstraint) {
			t = TypeEnum.BOOLEAN_TYPE
		}
		
		println("Done with valueResolver. t="+t)
		t
	}
	
	/**
	 * Make sure that the expression of a unary constraint is a BooleanValue
	 */
	def static boolean constraintUnary(UnaryConstraint it) {
		println("Starting constraintUnary")
		val b = valueResolver(expression).equals(TypeEnum.BOOLEAN_TYPE)
		println("Done with constraintUnary. b="+b)
		b
	}
	
	/**
	 * Check that a set is not empty and all values have the same type
	 */
	def static boolean constraintSet(Set it) {
		println("Starting constraintSet")
		val b = has.size > 0 && has.fold(true) [ b, v | b && v.class == has.get(0).class ]
		println("Done with constraintSet. b="+b)
		b
	}
}