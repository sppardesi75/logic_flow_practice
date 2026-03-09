package loops;

import java.util.Scanner;

public class FibonacciSeries {
	
	void fibonacci(int num) {
		int number = num;
		int fNum = 0;
		int num1 = 0;
		int num2 = 1;
		
		int counter = 1;
		
		
		
		
		while(counter <= number) {
			
			
			String punctuation = (counter < number) ? ", " : ".";
			

			System.out.print(num1 + punctuation);
		
			
			fNum = num1 + num2;
			
			num1 = num2;
			num2 = fNum;
			
			
//			num1 += num2;
//			num2 += num1;
			
			counter++;
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		FibonacciSeries fs = new FibonacciSeries();
		fs.fibonacci(input.nextInt());
		input.close();
	}

}
