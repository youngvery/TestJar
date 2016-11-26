package com.veryyoung.TestJar;

import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void TestCase_001() {
		App a = new App();
		double sum = a.jiafa(1, 4.9);
		Assert.assertEquals(5.9, sum);
	}

	@Test
	public void TestCase_002() {
		App a = new App();
		double discrepancy = a.jianfa(4, 1);
		Assert.assertEquals(3.0, discrepancy);
	}

	@Test
	public void TestCase_003() {
		App a = new App();
		double product = a.chengfa(1, 4.9);
		Assert.assertEquals(4.9, product);
	}

	@Test
	public void TestCase_004() {
		App a = new App();
		double quot = a.chengfa(4.9, 1);
		Assert.assertEquals(4.9, quot);
	}
}
