import java.util.Scanner;

public class NumericLoop {

	//Need these in both methods so make it a class data field
	public static String numberInput;
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get User Input
		System.out.println("Type a number between 50 and 300");
		numberInput = input.nextLine();
		
		//Set local variable equal to returned Integer from set method
		Integer convertInput = setNumericInput();
		
		//Print out result
		System.out.println("The number you typed in was: " + convertInput);
		
	}
	
	//Integer return type method that loops until a valid number is input
	public static Integer setNumericInput() {
		
		//Convert the string numberInput to an Integer using parseInt
		//on a local variable
		Integer convertedInput = Integer.parseInt(numberInput);
		
		//Don't return null when a valid input is received, continuously loop instead
		while (convertedInput < 50 || convertedInput >300) {
			
			System.out.println("Oops, that number wasn't between 50 and 300, try again: ");
			numberInput = input.nextLine();
			
			convertedInput = Integer.parseInt(numberInput);
			
		}
		
		return convertedInput;
	}
}