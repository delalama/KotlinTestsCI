package com.calculator.calculator

import com.calculator.calculator.operations.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalculatorApplication

fun main(args: Array<String>) {
	runApplication<CalculatorApplication>(*args)

	val calculator = Calculator()

	calculator.run()
}

class Calculator() {
	fun run(){
		sumTable()
		minTable()
		divTable()
		mulTable()
	}

	private fun sumTable() {
		println("SUM TABLE")

		val a = 0

		for (i in 0..10){
			println("${a} + ${i} = " + add(a,i))
		}
	}

	private fun minTable() {
		println("MIN TABLE")

		val a = 10

		for (i in 0..10){
			println("${a} - ${i} = " + min(a , i))
		}
	}

	private fun divTable() {
		println("DIV TABLE")

		val a = 100

		for (i in 1..11){
			println("${a} / ${i} = " + div(a , i))
		}
	}

	private fun mulTable() {
		println("MUL TABLE")

		val a = 1

		for (i in 0..10){
			println("${a} x ${i} = " + mul(a , i))
		}
	}


}

