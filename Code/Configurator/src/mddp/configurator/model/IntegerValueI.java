package mddp.configurator.model;

import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.impl.IntegerValueImpl;

public class IntegerValueI extends IntegerValueImpl {
	public IntegerValueI(int integer) {
		value=integer;
		type = TypeEnum.INTEGER_TYPE;
	}
}
