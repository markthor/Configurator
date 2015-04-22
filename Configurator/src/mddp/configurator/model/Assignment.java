package mddp.configurator.model;

public class Assignment {
	private final ParameterImp parameter;
	private final String value;
	
	public Assignment(ParameterImp parameter, String value) {
		super();
		this.parameter = parameter;
		this.value = value;
	}
	
	public ParameterImp getParameter() {
		return parameter;
	}
	
	public String getValue() {
		return value;
	}
}
