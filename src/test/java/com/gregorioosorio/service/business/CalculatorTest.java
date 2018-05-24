package com.gregorioosorio.service.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CalculatorTest {

	@Test
	public void addTestWithTwoPositiveNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.sum(4, 2));
	}
}

