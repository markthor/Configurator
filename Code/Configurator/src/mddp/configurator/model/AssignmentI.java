package mddp.configurator.model;

import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Value;
import ConfiguratorPackage.impl.AssignmentImpl;

public class AssignmentI extends AssignmentImpl {
	
	public AssignmentI(Parameter parameter, Value value) {
		super();
		this.parameter = parameter;
		this.value = value;
	}
}
