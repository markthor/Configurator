package mddp.configurator.model;

import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.impl.ParameterImpl;

public class ParameterI extends ParameterImpl {
	
	public ParameterI(TypeEnum type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
}
