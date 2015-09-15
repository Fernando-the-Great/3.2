
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the height: ");
		int height = keyboard.nextInt();
		System.out.println("Enter the width: ");
		int width = keyboard.nextInt();
		System.out.println("Hello your perimeter is " + (height + height + width + width));
		System.out.println("Your area is: " + height*width ); 
	}
}
