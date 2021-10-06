package labs;

import java.util.Scanner;

public class Lab01 {

	public static String name = "Robert";
	
	public static void main(String[] args) {
		
//		problem1();
//		problem2();
		problem3();
		
		
	}
	
	
	
	
	public static void problem1() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int input = inKey.nextInt();
		
		if (input == 6) {
			System.out.println("Five, six, pickup sticks!");
		}
		else if (input < 0) {
			System.out.println("That’s so negative of you!");
		}
		else if (input >= 13 && input <= 19) {
			System.out.println("Oh the teenage years...");
		}
		else if (input >= 20 && input % 2 == 0) {
			System.out.println("What about the odds?");
		}
		else {
			System.out.println("I haven't found that one yet.");
		}
		
		
	}
	
	
	
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Do you know my name? ");
		String name1 = inKey.nextLine();
		
		if (name.equals(name1)) {
			System.out.println("What can I do for you?");
		}
		else {
			System.out.println("You don't even know my name. We're THROUGH!!");
		}
		
		
	}
	
	
	
	
	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("How many boards did you get? ");
		int boards = inKey.nextInt();
		System.out.print("How many boxes of nails did you get? ");
		int nails = inKey.nextInt();
		
		int nailsNeeded = (int) Math.ceil(boards / 9.0);
		
		if (nails >= nailsNeeded) {
			System.out.println("You have enough nails.");
		}
		else {
			System.out.println("You need " + (nailsNeeded - nails) + " more nail boxes.");
		}
		
	
	}


	
	

	
	
}
