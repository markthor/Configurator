package mddp.configurator.model;

import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.impl.BooleanValueImpl;

public class BooleanValueI extends BooleanValueImpl {

	public BooleanValueI(boolean bool) {
		value=bool;
		type = TypeEnum.BOOLEAN_TYPE;
	}
}
