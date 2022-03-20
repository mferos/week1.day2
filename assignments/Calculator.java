package week1.day2.assignments;

public class Calculator {
	
	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();
		System.out.println(calculator.add(3, 5, 7));
		System.out.println(calculator.sub(20, 10));
		System.out.println(calculator.mul(2.5, 4.5));
		System.out.println(calculator.divide(6, 3));
	}
}

class MyCalculator {
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public double mul(double num1, double num2) {
		return num1*num2;
	}
	
	public float divide(float num1, float num2) {
		return num1/num2;
	}
}
