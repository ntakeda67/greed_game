package org.nt67.sample.domain

class GreedGame {
  def run(numOfPlayer:Int){
    println("参加プレイヤーは " + numOfPlayer + "人 です")
    val playerList = List.tabulate(numOfPlayer){i => new Player(i)}
    playerList foreach{player => println(player.getStatus) }
    
    val round:Round = new Round(playerList)
    round.run()
  }
  
  def printAllPlayerStatus(players:List[Player]):Unit = {
    println()
  }
  
}