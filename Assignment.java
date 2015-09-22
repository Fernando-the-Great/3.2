
import java.util.Scanner;
		public class Assignment {
/**
 * Authentication			
 * @param args
 */
			public static void main(String[] args){	
				Scanner keyboard = new Scanner(System.in); 
				String username="RandyMarsh";
				String password="IamLorde";
				/**
				 * Sets username and password
				 */
				
				System.out.println("Enter your username: ");
				String uinput = keyboard.next();
				System.out.println("Enter your password: ");
				String pinput = keyboard.next();
				if (uinput.equals(username) && pinput.equals(password)) {
					System.out.println("Correct username and password");
					System.out.println("Welcome " + username); 
				} 
				/**
				 * checks to see if entered data is corect
				 */
				else {
					System.out.println("WRONG");
				}
				
	}

			private static void and(boolean b) {
				// TODO Auto-generated method stub
				
			}
}
