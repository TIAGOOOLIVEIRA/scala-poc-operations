package org.tiagoooliveira.basicOperations

import scala.annotation.tailrec

import org.scalameter.api._

class Operations {

	//A function responsible for converting a Integer value to the sum of all its binary representation values
	//using tail recursive annotation for a better optimization in the scala compiler, preventing runtime overhead building a new stack-frame for each call
	//It is possible to check the processing time using {scalameter}: val t = measure { popcount(1024) }
	def popcount(n: Int): Int = {
	  @tailrec
	  def iter(x: Int, result: Int): Int =
	    if (x == 1) result
	    else iter(x / 2, result + (x % 2))

	  iter(n, 1)
	}
}
