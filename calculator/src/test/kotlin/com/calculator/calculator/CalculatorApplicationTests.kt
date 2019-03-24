package com.calculator.calculator

import com.calculator.calculator.operations.add
import com.calculator.calculator.operations.div
import com.calculator.calculator.operations.min
import com.calculator.calculator.operations.mul
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.math.exp
import kotlin.random.Random

@RunWith(SpringRunner::class)
@SpringBootTest
class CalculatorApplicationTests {

	@Test
	fun testSum() {

		//given
		val a = Random.nextInt(1,50)
		val b = Random.nextInt(1,50)

		//when
		val expected = a + b
		val actual  = add(a,b)

		//then
		assert(expected == actual)
	}

	@Test
	fun testMin() {

		//given
		val a = Random.nextInt(50,100)
		val b = Random.nextInt(1,50)

		//when
		val expected = a - b
		val actual  = min(a,b)

		//then
		assert(expected == actual)
	}

	@Test
	fun testDiv() {

		//given
		val a = Random.nextInt(1,50)
		val b = Random.nextInt(1,50)

		//when
		val expected = a / b
		val actual  = div(a,b)

		//then
		assert(expected == actual)
	}

	@Test
	fun testMul() {

		//given
		val a = Random.nextInt(1,50)
		val b = Random.nextInt(1,50)

		//when
		val expected = a * b
		val actual  = mul(a,b)

		//then
		assert(expected == actual)
	}

}
