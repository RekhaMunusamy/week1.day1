package week1.day2;

import org.apache.commons.math3.analysis.function.Divide;

public class Ass2Calculator{
	
	public void add() {
		int num1 = 10; int num2 = 20; int num3=30;
		int sum = num1 + num2 + num3;
		System.out.println("sum of num1+num2+num3 is : "+sum);
}
	
	public void sub() {
		int num1 = 50;
		int num2 = 30;
		int sub =num1 - num2;
		System.out.println("subtraction of of num1-num2 is : "+sub);

	}
	public void mul() {
		double num1 = 452;
		double num2 = 12;
		double mul = num1 * num2;
		System.out.println("product of num1 * num2 is : "+mul);
	}
	
	public void divide() {
		float num1 = 15;
		float num2 = 25;
		float divide = num1 / num2;
		System.out.println("division of num1 / num2 is : "+divide);
	}

	public static void main(String[] args) {
		/*
		 * Ass2Calculator calc = new Ass2Calculator(); calc.add(); calc.sub();
		 * calc.mul(); calc.divide();
		 */
	}

}
