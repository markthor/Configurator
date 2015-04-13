package org.xtext.cfgdsl.validation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import ConfiguratorPackage.*

class Main {
	def static void main(String[] args) {

		// register the file extension to be read as XMI
		//How about no?
		
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap
			.put("xmi", new XMIResourceFactoryImpl)
		
		
		// register our meta-model package
		ConfiguratorPackage.ConfiguratorPackagePackage.eINSTANCE.eClass()
		//FsmPackage.eINSTANCE.eClass()
		
		// load the file 
		val resourceSet = new ResourceSetImpl
		// change file name here to try other files
		val uri = URI::createURI("test-files/test.xmi")
		val resource = resourceSet.getResource(uri, true)					/* true means follow proxies */

		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false)
				.forall [ 
					CfgDslValidator.constraint (it)
				])
			println ("All constraints are satisfied!")
		else println ("Some constraint is violated")
	}
}