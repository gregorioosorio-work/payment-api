package com.gregorioosorio.service.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gregorioosorio.controllers.CalculatorController;

/**
 * The Class CalculatorTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CalculatorTest {

	/**
	 * Test add two positive numbers.
	 */
	@Test
	public void addTestWithTwoPositiveNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(6, calculator.sum(4, 2));
	}

	/**
	 * Test add two negative numbers.
	 */
	@Test
	public void addTestWithTwoNegativeNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(-6, calculator.sum(-4, -2));
	}

	/**
	 * Test subtract two positive numbers.
	 */
	@Test
	public void subtractTestWithTwoPositiveNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(2, calculator.subtract(4, 2));
	}

	/**
	 * Test subtract two negative numbers.
	 */
	@Test
	public void subtractTestWithTwoNegativeNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(-2, calculator.subtract(-4, -2));
	}

	/**
	 * Test multiply two positive numbers.
	 */
	@Test
	public void multiplyTestWithTwoPositiveNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(8, calculator.multiply(4, 2));
	}

	/**
	 * Test divide two positive numbers.
	 */
	@Test
	public void divideTestWithTwoPositiveNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(2, calculator.divide(4, 2));
	}

	/**
	 * Test divide by zero.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void divideTestWithZeroDividerNumbers() {
		CalculatorController calculator = new CalculatorController();
		assertEquals(2, calculator.divide(4, 0));
	}
}
