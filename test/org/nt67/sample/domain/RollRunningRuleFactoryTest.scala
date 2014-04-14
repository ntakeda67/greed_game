package org.nt67.sample.domain

import org.scalatest.Assertions
import org.junit.Test
import org.junit.Assert._
import org.hamcrest.CoreMatchers._
import org.scalatest.junit.AssertionsForJUnit

class RollRunningRuleFactoryTest extends AssertionsForJUnit {
  @Test
  def initial_rule_is_created_when_first_roll() = {
    assertTrue(RollRunningRuleFactory.create(1).isInstanceOf[InitialRoleRunningRule])
  }

  @Test
  def initial_rule_is_created_when_any_roll_except_first() = {
    assertTrue(RollRunningRuleFactory.create(2).isInstanceOf[CommonRunningRule])
    assertTrue(RollRunningRuleFactory.create(3).isInstanceOf[CommonRunningRule])
    assertTrue(RollRunningRuleFactory.create(4).isInstanceOf[CommonRunningRule])
    assertTrue(RollRunningRuleFactory.create(5).isInstanceOf[CommonRunningRule])
  }
}