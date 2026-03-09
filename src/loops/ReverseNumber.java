package loops;

import java.util.Scanner;

class ReverseNumber {
	
	int reverseNumber(int number) {
		
		int num = number;
		
		int remainder = 0;
		
		int revNum = 0;
		
		do {
		remainder = num % 10;
		num /= 10;
		
		revNum = (revNum * 10 ) + remainder;
		
		
		
		}while(num != 0);
		
		return revNum;
	}

	
	
	public static void main(String[] args) {
		
		System.out.print("Please enter the number to reverse: ");
		Scanner input = new Scanner(System.in);
		
		ReverseNumber rNum = new ReverseNumber();
		
		int revNum = rNum.reverseNumber(input.nextInt());
		
		System.out.println("reversed Number is: " + revNum);
		
		input.close();
	}
}
