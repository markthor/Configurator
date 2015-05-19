package mddp.configurator.model;

import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.impl.StringValueImpl;

public class StringValueI extends StringValueImpl {
	public StringValueI(String string) {
		value=string;
		type = TypeEnum.STRING_TYPE;
	}
}
