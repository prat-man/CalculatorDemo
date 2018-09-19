package com.cg.bean;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator
{
	private static Calculator calculator;
	
	@BeforeClass
	public static void init()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd()
	{
		Assert.assertEquals(10, calculator.add(4, 6));
	}
	
	@Test
	public void testSubtract()
	{
		Assert.assertEquals(2, calculator.subtract(6, 4));
	}
	
	@Test
	public void testMultiply()
	{
		Assert.assertEquals(6, calculator.multiply(2, 3));
	}
	
	@Test
	public void testSquare()
	{
		Assert.assertEquals(4, calculator.square(2));
	}
}
