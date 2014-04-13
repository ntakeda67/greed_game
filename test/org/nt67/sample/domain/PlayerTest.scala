package org.nt67.sample.domain

import org.scalatest.Assertions
import org.junit.Test
import org.junit.Assert._
import org.hamcrest.CoreMatchers._
import org.scalatest.junit.AssertionsForJUnit

class PlayerTest extends AssertionsForJUnit {
	@Test
	def initial_score_is_0() {
	  val p = new Player(0)
	  assertThat(p.getScore, is(0))
	}
	
	@Test
	def addScore_increment_players_score(){
	  val delta:Int = 100;
	  val p = new Player(0)
	  
	  assertThat(p.addScore(delta), is(100))
	  assertThat(p.getScore, is(100))
	}
	
}