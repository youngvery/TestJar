package com.veryyoung.TestJar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "https://github.com/youngvery/TestJar.git" );
    }
    
    public double jiafa(double a, double b) {
		double sum = 0;
		sum = a + b;
		return sum;
	}

	public double jianfa(double a, double b) {
		double discrepancy = 0;
		discrepancy = a - b;
		return discrepancy;
	}

	public double chengfa(double a, double b) {
		double product = 0;
		product = a * b;
		return product;
	}

	public double chufa(double a, double b) {
		double quot = 0;
		try {
			quot = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return quot;
	}
}
