package org.nt67.sample

import org.nt67.sample.domain.GreedGame

object HelloWorld {
  
  def main(args: Array[String]):Unit = {
    println("Running GreedGame!")
    var greedGame = new GreedGame
    greedGame.run(3)
  }
  
}

