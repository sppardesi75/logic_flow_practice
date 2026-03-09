package Nested_If_Else;

import java.util.Scanner;

public class ATMValidator{
	
	
	boolean isCardInserted;
	int storedPin;
	double currentBalance;
	
	public ATMValidator(boolean isCardInserted) {
		
		this.isCardInserted = isCardInserted;
		this.storedPin = 1234;
		this.currentBalance = 50000.65;
		
		
	}
	
	public ATMValidator() {
		
		
		this(false);
		
	}
	
	
	public void withdrawMoney(Scanner input) {
		
//		Scanner input = new Scanner(System.in);
		
		
		if(isCardInserted) {
			
			System.out.print("Please enter your pin:");
			int inputPin = input.nextInt();
			
			if (inputPin == storedPin) {
				
				System.out.println("Pin Verified");
				System.out.println("Current Balance: " + currentBalance);
				System.out.print("Please Enter Amount to Withdraw:");
				double withdrawAmount = input.nextDouble();
				
				if(withdrawAmount <= currentBalance) {
					
					
					currentBalance -= withdrawAmount;
					System.out.println("Successfully Withdrawn $" + withdrawAmount);
					System.out.println("Current balance is $" + currentBalance);
					
				}
				else {
					System.out.println("Insufficient Balance!");
				}
				
			}
			else {
				System.out.println("Error: Incorrect Pin. Access Denied");
			}
			
			
			
			
		}
		else {
			System.out.println("Error, no card detected");
		}
		
		
//		input.close();
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		ATMValidator atm = new ATMValidator();
		atm.withdrawMoney(input);
		ATMValidator atm2 = new ATMValidator(true);
		atm2.withdrawMoney(input);
		
		
		input.close();
	}
	
	
}
