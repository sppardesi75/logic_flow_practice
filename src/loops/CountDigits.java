package loops;

import java.util.Scanner;

class CountDigits {
	
int countDigits(int number) {
	
	
	int num = number;
	int numCount = 0;
	
	while(num != 0) {
		num /= 10;
		numCount++;
	};
	
	
	
	
	return numCount;
}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter number to count: ");
	CountDigits cd = new CountDigits();
	
	int numOfDigits = cd.countDigits(input.nextInt());
	System.out.println("The number of digits: " + numOfDigits);
	
	input.close();
	}

}
