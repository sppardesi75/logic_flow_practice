package Approval_logic;

public class TransferMoney {
	
	public static void main(String[] args) {
		
		double transferAmount = 465;
		double dailyLimit = 100;
		double remainingTransferAmount = 0;
		double transferedPartialAmount = 0;
		
		int dayCount = 1;
		
		if(transferAmount < dailyLimit) {
			dailyLimit -= transferAmount;
			System.out.println("The amount of $" + transferAmount + "is approved");
			System.out.println("Your daily limit left is $" + dailyLimit);
			
		}
		else {
			System.out.println("dont have enough limit to approve. payment will be transfered partially.");
			remainingTransferAmount = transferAmount;
			System.out.println("Amount to be transfered : $"  + remainingTransferAmount + "\n");
			do {
				
				System.out.println("Day " + dayCount);
				if(remainingTransferAmount >= dailyLimit) {
					
//					System.out.println("if logic");
					System.out.println("Daily Limit Left before transfer: $" + dailyLimit );
					remainingTransferAmount -= dailyLimit;
					transferedPartialAmount = dailyLimit;
					System.out.println("Amount transfered: $" + transferedPartialAmount + " at day " + dayCount);
					dailyLimit = 0;
					System.out.println("Daily Limit Left after transfer: $" + dailyLimit );
					System.out.println("Remaining amount to transfer: $" + remainingTransferAmount + "\n");
				}
				else {
					System.out.println("Daily Limit Left before transfer: $" + dailyLimit );
					dailyLimit -= remainingTransferAmount;
					transferedPartialAmount = remainingTransferAmount;
					remainingTransferAmount = 0;
					System.out.println("Amount transfered: $" + transferedPartialAmount + " at day " + dayCount);
					System.out.println("Daily Limit Left after transfer: $" + dailyLimit + "\n");
				}
				
				dailyLimit = 100;
				dayCount++;
			}while(remainingTransferAmount > 0);
			
			System.out.println("\nAmount of $" + transferAmount + " was successfully transfered in " + (dayCount - 1)  + " days");
			
		}
		
	}

}
