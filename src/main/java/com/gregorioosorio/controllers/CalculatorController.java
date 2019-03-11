package com.gregorioosorio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class CalculatorController.
 */
@RestController
public class CalculatorController {

	/**
	 * Sum two values.
	 *
	 * @param a the as
	 * @param b the b
	 * @return the a + b result
	 */
	@RequestMapping("/add")
	public int sum(
			@RequestParam(value = "a", defaultValue = "0") int a,
			@RequestParam(value = "b", defaultValue = "0") int b) {
		return a + b;
	}

	/**
	 * Subtract two values.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the a - b result
	 */
	@RequestMapping("/subtract")
	public int subtract(
			@RequestParam(value = "a", defaultValue = "0") int a,
			@RequestParam(value = "b", defaultValue = "0") int b) {
		return a - b;
	}

	/**
	 * Multiply.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the a * b result
	 */
	@RequestMapping("/multiply")
	public int multiply(
			@RequestParam(value = "a", defaultValue = "1") int a,
			@RequestParam(value = "b", defaultValue = "1") int b) {
		return a * b;
	}

	/**
	 * Divide.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the a / b result
	 */
	@RequestMapping("/divide")
	public int divide(
			@RequestParam(value = "a", defaultValue = "0") int a,
			@RequestParam(value = "b", defaultValue = "1") int b) {
		if (b == 0) {
			throw new IllegalArgumentException("divider can't be zero");
		}
		return a / b;
	}
}
