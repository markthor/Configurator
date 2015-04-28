package mddp.configurator.logic;

import java.util.ArrayList;
import java.util.List;

import mddp.configurator.model.ParameterI;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.impl.ParameterImpl;

public class ParameterHolder {
	
	private static List<Parameter> parameters;
	
	public static List<Parameter> getParameters() {
		if(parameters != null)
			return parameters;
		parameters = new ArrayList<Parameter>();
		parameters.add(new ParameterI(TypeEnum.INTEGER_TYPE, "x"));
		parameters.add(new ParameterI(TypeEnum.BOOLEAN_TYPE, "y"));
		parameters.add(new ParameterI(TypeEnum.STRING_TYPE, "z"));
		parameters.add(new ParameterI(TypeEnum.STRING_TYPE, "u"));
		parameters.add(new ParameterI(TypeEnum.INTEGER_TYPE, "hej"));
		parameters.add(new ParameterI(TypeEnum.STRING_TYPE, "sup"));
		parameters.add(new ParameterI(TypeEnum.STRING_TYPE, "son"));
		parameters.add(new ParameterI(TypeEnum.STRING_TYPE, "whut"));
		return parameters;
	}
}
