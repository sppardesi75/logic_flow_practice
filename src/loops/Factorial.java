package loops;

import java.util.Scanner;

public class Factorial {
	

	
	int factorial(int number) {
		
	
		int factorial = number;
		
		for(int i = factorial - 1 ; i > 0; i--) {
			
			factorial *= i;
			
		}
		
		return factorial;
	}



public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	Factorial f = new Factorial();
	System.out.print("Please enter the number: ");
	int factorial = f.factorial(input.nextInt());
	System.out.println("The factorial is: " + factorial);
	
	input.close();
	
	}
	
}
