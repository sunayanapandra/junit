package com.sunaina;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestNumbers {
	@Test
	public void testOddNumber() {
		assertTrue(Numbers.isOdd(3));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15}) 
	public void isOdd_ShouldReturnTrueForOddNumbers(int number) {
	    assertTrue(Numbers.isOdd(number));
	}

}



