import java.util.*; //imports
public class challenge2 {

	
	public static void main(String [] args) {
		System.out.println("Welcome to the TAMID Calculator!");
		String yesorno= intro(); 

		if (yesorno.equals("y")) { //if user wants will starts the caculator, else exits 
			startcalc();
		}
		else {
			System.out.println("Thanks for coming!");	

		}
	
	}
	
	static String intro() {			
		Scanner input = new Scanner(System.in); //user input
		System.out.print("Would you like to calculate somthing (y/n): ");
		String answer = input.next();

		while (!answer.equals("y") && !answer.equals("n")){ //check user errors!
				System.out.print("Please try again (y/n responses ONLY)");
			 answer = input.next();

		}					
		return answer;	
	}
	static void startcalc() {  //this method will obtain the information needed from user
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		boolean check= true;

		while (check) { //this while loop will check if the user is entering valid input
			
			if (input.hasNextDouble()) {
				check = false;
			}else {
			System.out.println("Invalid input: Please enter a number again: ");
			input.next();
		}
		}
		double number1=input.nextDouble();
		
	
		System.out.print("Please enter the second number: ");
		boolean check1= true;

		while (check1) { 
			
			if (input.hasNextDouble()) {
				check1 = false;
			}else {
			System.out.println("Invalid input: Please enter a number again: ");
			input.next();
			}
		}
		double number2=input.nextDouble();
		
		System.out.println("Please enter your function: ");
	
		String op = input.next();
		
		calculate(number1, number2,op);//call method to actually do calculation and send user input
		
	}
		
	
	static void calculate(double num1,double num2, String op) {
		double answer=0; 
	//if statements to check which operation the user entered, if none of these it will cause error, user must reenter correct info
		if (op.equals("+")) {
            answer = num1 + num2;
        } else if (op.equals("-")){
            answer = num1 - num2;
        } else if (op.equals("*")){
            answer = num1 * num2;
        } else if (op.equals("/")){
            answer = num1 / num2;
        } else if (op.equals("%")){
        	answer = num1 % num2;
        }else {
        	System.out.println("ERROR: invalid operand start again");
        	startcalc();
        	return; //in order for the rest of the print statements to not be executed twice 
        }

		System.out.println("Your result was: " + answer + "!");
		String yesorno=intro();//calls intro to see if user wants to do another calculation
		if (yesorno.equals("y")) {
			startcalc();
		}else { 
			System.out.println("Thanks for coming!");
			System.out.println();

		}
		
	}
}
