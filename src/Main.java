//Author Mark Lyon
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the simple calculator. Perform your operations one at a time and with spaces. Decimals are allowed.");
    	calculator();
    }
    private static void calculator(){
    	Scanner sc = new Scanner(System.in);
    	float num1, num2, answer;
    	String equation = "";
    	boolean exit = false;
    	while (exit == false){
    		System.out.println("Enter your equation.");
    		equation = sc.nextLine();
    		String[] parts = equation.split(" ");
    		num1 = Float.parseFloat(parts[0]);
    		num2 = Float.parseFloat(parts[2]);
    		if (parts[1].equals("+")) {
    			answer = num1 + num2;
    			System.out.printf("Answer: %f \n", answer);
    		}
    		else if (parts[1].equals("-")) {
    			answer = num1 - num2;
    			System.out.printf("Answer: %f \n", answer);
    		}
    		else if (parts[1].equals("*")) {
    			answer = num1 * num2;
    			System.out.printf("Answer: %f \n", answer);
    		}
    		else if (parts[1].equals("/")) {
    			if (num2 == 0.0) {
    				System.out.println("Invalid operation");
    			}
    			else {
    				answer = num1 / num2;
    				System.out.printf("Answer: %f \n", answer);
    			}
    		}
    		else {
    			System.out.println("Invalid operation");
    		}
    		System.out.println("Exit? Y/N");
    		String reply = sc.nextLine();
    		if (reply.equals("Y")) {
    			exit = true;
    		}
    	}
    	sc.close();
    }
}
