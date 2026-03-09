package For_Loop;

import java.util.Scanner;

public class StringReverser {
	
	String word;
	
	public StringReverser(String word) {
		
		this.word = word;
		
	}
	
	public StringReverser() {
		this("default");
	}
	
	public String reverse() {
		char[] wordArray = word.toCharArray();
		int lengthOfWordArray = wordArray.length;
		char[] reversedWordArray = new char[lengthOfWordArray];
		for (int i  = lengthOfWordArray, j = 0; i > 0 ; i--, j++) {
			reversedWordArray[j] = wordArray[i -1 ];
		}
		String reversedString = new String(reversedWordArray);
		return reversedString;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the string to reverse: ");
		StringReverser reverseString = new StringReverser(input.nextLine());
		String reversedString = reverseString.reverse();
		System.out.println(reversedString);
		
		input.close();
				
	}

}
