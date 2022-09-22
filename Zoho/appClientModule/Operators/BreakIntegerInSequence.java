package Operators;

public class BreakIntegerInSequence {

	public static void main(String[] args) {
		int x = 123423456;
		breakNum(x);
	}

	private static void breakNum(int x) {
		int noOfDigits = 0;
		
		if (x<0) {
			x = -1*x;
		}
		
		while (x>0) {
			noOfDigits++;
			x = x/10;
		}
		
		System.out.println("No of Digits :" + noOfDigits);
	}

}
