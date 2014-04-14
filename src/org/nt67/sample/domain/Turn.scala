package org.nt67.sample.domain

class Turn(val player:Player) {
  val initialDiceNumber = 5
  var score:Int = 0

  def run():Unit = {
    println("Turn running")
    val cup:Cup = new Cup
    
    var rule:RollRunningRule = null
    var result:RollResult = new RollResult
    var rollNumber:Int = 0
    
    do {
      rule = RollRunningRuleFactory.create(rollNumber)
      result = cup.roll(result.remainedDiceNumber, rule)
      rollNumber += 1
    } while(rule.canNextRoll(result))
  }
  
}