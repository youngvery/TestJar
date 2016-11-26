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
	public void TestCase_1_001() {
		App a = new App();
		double sum = a.jiafa(1,4);
		Assert.assertEquals(5.0, sum);
	}
	@Test
	public void TestCase_1_002() {
		App a = new App();
		double sum = a.jiafa(1,1);
		Assert.assertEquals(2.0, sum);
	}
	@Test
	public void TestCase_1_003() {
		App a = new App();
		double sum = a.jiafa(1,100);
		Assert.assertEquals(101.0, sum);
	}
	@Test
	public void TestCase_1_004() {
		App a = new App();
		double sum = a.jiafa(-1,-2);
		Assert.assertEquals(-3.0, sum);
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
	@Test
	public void TestCase_005() {
		App a = new App();
		String str = a.printsysout();
		Assert.assertEquals("https://github.com/youngvery/TestJar.git", str);
	}
}
