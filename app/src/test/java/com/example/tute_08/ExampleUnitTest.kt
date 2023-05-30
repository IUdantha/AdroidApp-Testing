package com.example.tute_08

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val calculations = Calculations(4, 5)

    @Test
    fun addition_isCorrect() {
        assertEquals(9, calculations.addition())
    }

    @Test
    fun substraction_isCorrect() {
        assertEquals(-1, calculations.substraction())
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(20, calculations.multiplication())

    }

    @Test
    fun division_isCorrect() {
        assertEquals(0.8, calculations.division())
    }

}