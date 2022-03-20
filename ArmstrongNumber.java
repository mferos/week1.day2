package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 
		int input = 123;
		
		int calculated = 0;
		int remainder;
		int original = input;
		
		while (input > 0) {
			remainder = input % 10;
			calculated = calculated + (remainder * remainder * remainder);
			input = input/10;
		}
		
		if (calculated == original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		 
	}

}
