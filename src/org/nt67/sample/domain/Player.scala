package org.nt67.sample.domain

class Player(val id:Int = 0) {
  
  var score:Int = 0

  def getStatus():String = {
    return "Player ID:" + id + ", score:" + score
  }
  
  def addScore(delta:Int):Int = {
    this.score += delta;
    return this.score;
  }
  
  def getScore():Int = this.score
}