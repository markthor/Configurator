package org.xtext.cfgdsl.generator;

import java.util.ArrayList;
import java.util.List;

import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BooleanValue;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.IntegerValue;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Root;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.StringValue;
import ConfiguratorPackage.UnaryConstraint;
import ConfiguratorPackage.Value;

public class JsonConverter {
    public static String generate(Root it) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("{\n");
    	resultBuilder.append(toJson(it, 1));
    	resultBuilder.append("}");
    	
    	return resultBuilder.toString();
    }
    
    private static String toJson(Root it, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"root\": {\n");
    	resultBuilder.append(expressionsToJson(it.getExpressions(), level+1));
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("}\n");
    	
    	return resultBuilder.toString();
    }
    
    private static String expressionsToJson(List<Expression> expressions, int level) {
    	boolean first = true;
    	StringBuilder resultBuilder = new StringBuilder();
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"expressions\": {");
    	
    	List<Parameter> parameters = getParameters(expressions);
    	List<BinaryConstraint> binaryConstraints = getBinaryConstraints(expressions);
    	List<UnaryConstraint> unaryConstraints = getUnaryConstraints(expressions);
    	List<Value> values = getValues(expressions);
    	List<Set> sets = getSets(expressions);
    	
    	if(parameters.size() > 0) {
    		first=false;
        	resultBuilder.append(arrayToJson(parametersToJson(parameters, level+2), "parameter", level+1));
    	}
    	
    	if(binaryConstraints.size() > 0) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		first=false;
    		resultBuilder.append(arrayToJson(binaryConstraintsToJson(binaryConstraints, level+2), "binaryConstraints", level+1));
    	}
    	
    	if(unaryConstraints.size() > 0) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		first=false;
    		resultBuilder.append(arrayToJson(unaryConstraintsToJson(unaryConstraints, level+2), "unaryConstraints", level+1));
    	}
    	
    	if(values.size() > 0) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		first=false;
    		resultBuilder.append(arrayToJson(valuesToJson(values, level+2), "values", level+1));
    	}
    	
    	if(sets.size() > 0) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		first=false;
    		resultBuilder.append(arrayToJson(setsToJson(sets, level+2), "sets", level+1));
    	}
    	
    	resultBuilder.append("\n");
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("}\n");
    	return resultBuilder.toString();
    }
    
    private static String arrayToJson(String content, String name, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("\n");
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"");
    	resultBuilder.append(name);
    	resultBuilder.append("\": [");
    	
    	resultBuilder.append(content);
    	
    	resultBuilder.append("\n");
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("]");
    	
    	return resultBuilder.toString();
    }
    
    private static String arrayElementToJson(String content, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
		resultBuilder.append("\n");
		resultBuilder.append(getTabs(level));
		resultBuilder.append("{");
		resultBuilder.append(content);
		resultBuilder.append(getTabs(level));
		resultBuilder.append("}");
    	
    	return resultBuilder.toString();
    }
    
    private static String parametersToJson(List<Parameter> parameters, int level) {
    	StringBuilder resultBuilder = new StringBuilder();

    	boolean first = true;
    	for(Parameter p : parameters) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		resultBuilder.append(arrayElementToJson(parameterToJson(p, level+2), level+1));
    		first=false;
    	}
    	
    	return resultBuilder.toString();
    }
    
    private static String parameterToJson(Parameter parameter, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"name\": \"");
    	resultBuilder.append(parameter.getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"type\": \"");
    	resultBuilder.append(parameter.getType());
    	resultBuilder.append("\"\n");
    	
    	return resultBuilder.toString();
    }
    
    private static String binaryConstraintsToJson(List<BinaryConstraint> binaryConstraints, int level) {
    	StringBuilder resultBuilder = new StringBuilder();

    	boolean first = true;
    	for(BinaryConstraint bc : binaryConstraints) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		resultBuilder.append(arrayElementToJson(binaryConstraintToJson(bc, level+2), level+1));
    		first=false;
    	}
    	
    	return resultBuilder.toString();
    }
    
    private static String binaryConstraintToJson(BinaryConstraint bc, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"name\": \"");
    	resultBuilder.append(bc.getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"operator\": \"");
    	resultBuilder.append(bc.getOperator());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"left\": \"");
    	resultBuilder.append(bc.getLeft().getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"right\": \"");
    	resultBuilder.append(bc.getRight().getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"root\": \"");
    	resultBuilder.append(bc.isRoot());
    	resultBuilder.append("\"\n");
    	
    	return resultBuilder.toString();
    }
    
    private static String unaryConstraintsToJson(List<UnaryConstraint> unaryConstraints, int level) {
    	StringBuilder resultBuilder = new StringBuilder();

    	boolean first = true;
    	for(UnaryConstraint bc : unaryConstraints) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		resultBuilder.append(arrayElementToJson(unaryConstraintToJson(bc, level+2), level+1));
    		first=false;
    	}
    	
    	return resultBuilder.toString();
    }
    
    private static String unaryConstraintToJson(UnaryConstraint uc, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"name\": \"");
    	resultBuilder.append(uc.getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"operator\": \"");
    	resultBuilder.append(uc.getOperator());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"expression\": \"");
    	resultBuilder.append(uc.getExpression().getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"root\": \"");
    	resultBuilder.append(uc.isRoot());
    	resultBuilder.append("\"\n");
    	
    	return resultBuilder.toString();
    }
    
    private static String valuesToJson(List<Value> values, int level) {
    	StringBuilder resultBuilder = new StringBuilder();

    	boolean first = true;
    	for(Value value : values) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		resultBuilder.append(arrayElementToJson(valueToJson(value, level+2), level+1));
    		first=false;
    	}
    	
    	return resultBuilder.toString();
    }
    
    private static String valueToJson(Value value, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"name\": \"");
    	resultBuilder.append(value.getName());
    	resultBuilder.append("\",\n");
    	
    	if(value instanceof StringValue) {
    		StringValue sValue = (StringValue) value;
        	resultBuilder.append(getTabs(level));
    		resultBuilder.append("\"value\": \"");
        	resultBuilder.append(sValue.getValue());
        	resultBuilder.append("\",\n");
        	
        	resultBuilder.append(getTabs(level));
    		resultBuilder.append("\"type\": \"");
        	resultBuilder.append(sValue.getType());
        	resultBuilder.append("\"\n");
    	}
    	
    	if(value instanceof IntegerValue) {
    		IntegerValue iValue = (IntegerValue) value;
        	resultBuilder.append(getTabs(level));
    		resultBuilder.append("\"value\": \"");
        	resultBuilder.append(iValue.getValue());
        	resultBuilder.append("\",\n");
        	
        	resultBuilder.append(getTabs(level));
    		resultBuilder.append("\"type\": \"");
        	resultBuilder.append(iValue.getType());
        	resultBuilder.append("\"\n");
    	}
    	
    	if(value instanceof BooleanValue) {
    		BooleanValue bValue = (BooleanValue) value;
        	resultBuilder.append(getTabs(level));
    		resultBuilder.append("\"value\": \"");
        	resultBuilder.append(bValue.isValue());
        	resultBuilder.append("\",\n");
        	
        	resultBuilder.append(getTabs(level));
    		resultBuilder.append("\"type\": \"");
        	resultBuilder.append(bValue.getType());
        	resultBuilder.append("\"\n");
    	}
    	
    	return resultBuilder.toString();
    }
    
    private static String setsToJson(List<Set> sets, int level) {
    	StringBuilder resultBuilder = new StringBuilder();

    	boolean first = true;
    	for(Set set : sets) {
    		checkFirstAndInsertComma(first, resultBuilder);
    		resultBuilder.append(arrayElementToJson(setToJson(set, level+2), level+1));
    		first=false;
    	}
    	
    	return resultBuilder.toString();
    }
    
    private static String setToJson(Set set, int level) {
    	StringBuilder resultBuilder = new StringBuilder();
    	
    	resultBuilder.append("\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"name\": \"");
    	resultBuilder.append(set.getName());
    	resultBuilder.append("\",\n");
    	
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("\"has\": [");
    	resultBuilder.append(valuesToJson(set.getHas(), level+1));
    	resultBuilder.append("\n");
    	resultBuilder.append(getTabs(level));
    	resultBuilder.append("]\n");
    	
    	return resultBuilder.toString();
    }
    
    
    private static List<Parameter> getParameters(List<Expression> expressions) {
    	List<Parameter> result = new ArrayList<Parameter>();
    	for(Expression e : expressions) {
    		if(e instanceof Parameter)
    			result.add((Parameter)e);
    	}
    	return result;
    }
    
    private static List<BinaryConstraint> getBinaryConstraints(List<Expression> expressions) {
    	List<BinaryConstraint> result = new ArrayList<BinaryConstraint>();
    	for(Expression e : expressions) {
    		if(e instanceof BinaryConstraint)
    			result.add((BinaryConstraint)e);
    	}
    	return result;
    }
    
    private static List<UnaryConstraint> getUnaryConstraints(List<Expression> expressions) {
    	List<UnaryConstraint> result = new ArrayList<UnaryConstraint>();
    	for(Expression e : expressions) {
    		if(e instanceof UnaryConstraint)
    			result.add((UnaryConstraint)e);
    	}
    	return result;
    }
    
    private static List<Value> getValues(List<Expression> expressions) {
    	List<Value> result = new ArrayList<Value>();
    	for(Expression e : expressions) {
    		if(e instanceof Value)
    			result.add((Value)e);
    	}
    	return result;
    }
    
    private static List<Set> getSets(List<Expression> expressions) {
    	List<Set> result = new ArrayList<Set>();
    	for(Expression e : expressions) {
    		if(e instanceof Set)
    			result.add((Set)e);
    	}
    	return result;
    }
    
    private static void checkFirstAndInsertComma(boolean first, StringBuilder sb) {
    	if(!first)
			sb.append(",");
    }
    
    private static String getTabs(int numberOfTabs) {
    	StringBuilder resultBuilder = new StringBuilder();
    	for(int i = 0; i < numberOfTabs; i++) {
    		resultBuilder.append("\t");
    	}
    	return resultBuilder.toString();
    }
}