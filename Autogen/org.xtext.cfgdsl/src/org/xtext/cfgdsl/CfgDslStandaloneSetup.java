/*
* generated by Xtext
*/
package org.xtext.cfgdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CfgDslStandaloneSetup extends CfgDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CfgDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
