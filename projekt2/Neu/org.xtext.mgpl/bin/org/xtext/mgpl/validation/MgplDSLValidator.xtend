/*
 * generated by Xtext
 */
package org.xtext.mgpl.validation

import org.eclipse.xtend.typesystem.Type
import org.eclipse.xtext.validation.Check
import org.xtext.mgpl.mgplDSL.AttrAss
import org.xtext.mgpl.mgplDSL.Disj

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MgplDSLValidator extends AbstractMgplDSLValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkSpeed(AttrAss aa) {
		if (aa.name.equals("speed")) {
			System.out.println();
			aa.expr.eGet(Disj)
			System.out.println(aa.name);
		}
	}
}
