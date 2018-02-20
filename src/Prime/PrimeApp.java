package Prime;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String getCont;
		// app starts 
		System.out.println("This application will find you any prime number, in" 
		+ " order, from the first prime number on.");
		do {
			// gets user input
			System.out.println("Which prime number are you looking for?");
			int userNum = scan.nextInt();
			int primeNum = primeFinder(userNum);
			System.out.println("The number " + userNum + " prime is " + primeNum + ".");
			System.out.println("\nDo you want to find another prime number? (y/n)");
			getCont = scan.next();
		} while (getCont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");

	}
	// method that adds prime numbers to an arraylist and returns the number at the index userNum -1
	public static int primeFinder(int userNum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);

		for (int i = 3; i <= 5000; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					if (i % 5 != 0) {
						if (i % 7 != 0) {
							list.add(i);
						}
					}
				}
			}
		}
		return list.get(userNum - 1);
	}

}
