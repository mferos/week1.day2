package week1.day2;

public class Calculator {

	public int getAdd(int a, int b) {
		return a+b;
	}
	
	public double getSub(double a, double b) {
		return a-b;
	}
	
	public double getMultiply(double a, double b) {
		return a*b;
	}
	
	public double getDivide(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.getAdd(1, 2));
		System.out.println(calculator.getSub(20.5, 10.2));
		System.out.println(calculator.getMultiply(2.5, 4.5));
		System.out.println(calculator.getDivide(6, 3));

	}

}
