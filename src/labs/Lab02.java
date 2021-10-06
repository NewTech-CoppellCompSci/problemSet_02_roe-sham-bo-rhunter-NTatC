package labs;

import java.util.Scanner;

public class Lab02 {

	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
	}
	
	
	
	public static void problem1() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a number from 0 to 100: ");
		int num = inKey.nextInt();
		
		if (num >= 90) {
			System.out.println("That's an A");
		}
		else if (num >= 80) {
			System.out.println("That's a B");
		} 
		else if (num >= 70) {
			System.out.println("That's a C");
		} 
		else if (num >= 60) {
			System.out.println("That's a D");
		} 
		else{
			System.out.println("That's a F");
		}
		
	}
	
	
	

	public static void problem2() {

		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter 3 angles.");
		System.out.print("Angle #1: ");
		int angle1 = inKey.nextInt();
		System.out.print("Angle #2: ");
		int angle2 = inKey.nextInt();
		System.out.print("Angle #3: ");
		int angle3 = inKey.nextInt();
		
		
		
		if (angle1 + angle2 + angle3 != 180) {
			System.out.println("Those don't make a triangle.");
		}
		else if (angle1 == angle2 && angle1 == angle3) {
			System.out.println("That's an equilateral triangle.");
		}
		else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
			System.out.println("That's an isosceles triangle.");
		}
		else {
			System.out.println("That's a scalene triangle.");
		}
		
		
		
	}


	
	
	public static void problem3() {

		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter the psi for each tire.");
		System.out.print("Driver's Front Tire: ");
		double driverFront = inKey.nextDouble();
		System.out.print("Driver's Rear Tire: ");
		double driverRear = inKey.nextDouble();
		System.out.print("Passenger's Front Tire: ");
		double passengerFront = inKey.nextDouble();
		System.out.print("Passenger's Rear Tire: ");
		double passengerRear = inKey.nextDouble();
		
		boolean tiresFine = true;
		
		if (driverFront < 32) {
			System.out.println("Warning: Driver's Front Tire Low!!");
			tiresFine = false;
		}
		
		if (driverRear < 32) {
			System.out.println("Warning: Driver's Rear Tire Low!!");
			tiresFine = false;
		}
		
		if (passengerFront < 32) {
			System.out.println("Warning: Passenger's Front Tire Low!!");
			tiresFine = false;
		}	
		
		if (passengerRear < 32) {
			System.out.println("Warning: Passenger's Rear Tire Low!!");
			tiresFine = false;
		}
		
		if (Math.abs(driverFront - driverRear) > 4
				|| Math.abs(driverFront - passengerFront) > 4
				|| Math.abs(driverFront - passengerRear) > 4
				|| Math.abs(driverRear - passengerFront) > 4
				|| Math.abs(driverRear - passengerFront) > 4
				|| Math.abs(passengerFront - passengerRear) > 4) {
			System.out.println("Warning: Tire Pressure Unever!!");
			tiresFine = false;
		}
		
		if (tiresFine) {
			System.out.println("Tires are fine");
		}
		
		
	}

	
	

	public static void problem4() {

		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num = inKey.nextInt();
		
		int onesPlace = num % 10;
		
		num -= onesPlace;
		
		if (onesPlace >= 5) {
			num += 10;
		}
		
		System.out.println("Rounded to the nearest 10: " + num);
		
	}
	
	
	
}
