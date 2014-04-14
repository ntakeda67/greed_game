package org.nt67.sample.domain

object RollRunningRuleFactory {
	def create(rollNumber:Int):RollRunningRule = {
	  rollNumber match {
	    case 1 => new InitialRoleRunningRule
	    case _ => new CommonRunningRule
	  }
	}
}