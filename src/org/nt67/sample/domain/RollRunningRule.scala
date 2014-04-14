package org.nt67.sample.domain

trait RollRunningRule {
  def canNextRoll(result:RollResult):Boolean
}