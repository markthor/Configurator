package mddp.configurator.model;

import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.TypeEnum;

public class ParameterImp {
	private TypeEnum type;
	private String name;

	public ParameterImp(TypeEnum type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	
	public void setType(TypeEnum type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeEnum getType() {
		return type;
	}

	public String getName() {
		return name;
	}
}
