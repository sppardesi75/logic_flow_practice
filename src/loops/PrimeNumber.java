package loops;

import java.util.Scanner;

public class PrimeNumber {
	
	boolean primeNumber(int number) {
		
		int num = number;
		
		int sqaureRoot = (int)Math.sqrt(num);
		
		if (num == 2 || num == 3) {
			
			return true;
		
			
		}
		else if (num % 2 == 0 || num <= 1) {
			return false;
		}
		else {
			
			
		for(int i = sqaureRoot; i >= 3; i--) {
			if(num % i == 0) {
				return false;
			}
			
		}
			
		return true;
			
		}
		
			}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		PrimeNumber pn = new PrimeNumber();
		
		System.out.print("Please enter the number: ");
		boolean prime = pn.primeNumber(input.nextInt());
		
		System.out.println("The number is prime or not: " + prime);
		
		input.close();
		
	}

}
