import java.util.Scanner;

public class challenge4 {

	public static void main (String []args) {
		isPalindrome();
	}
	
	static void isPalindrome(){
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter a string: ");//user input to enter string to be tested 
		String word = input.nextLine();
		String sameword = word.toLowerCase();//convert to lower case 
		String reverse = "";
		char[] letters = sameword.toCharArray(); //convert word to arry of characters 
		
		for (char letter : letters ) { //for each loop to add each letter in the reverse 
			reverse = letter + reverse;
		}
		if (sameword.equals(reverse)) { //compare the reverse and the word 
			System.out.println("\"" +word + "\"" + "is a palindrome!");
		}else {
			System.out.println("\"" +word + "\"" + " is not a palindrome!");
		}
		}
}

