/*
* generated by Xtext
*/
package org.xtext.cfgdsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CfgDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.cfgdsl.ui.internal.CfgDslActivator.getInstance().getInjector("org.xtext.cfgdsl.CfgDsl");
	}
	
}