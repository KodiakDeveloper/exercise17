package selectionStructures;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		int userInput;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input number: ");

		userInput = scan.nextInt();

		if (userInput <= 0) {

			System.out.println("Only positive numbers and greater than zero are available!!");

		} else {

			scan.close();

			if (userInput % 3 == 0 && userInput % 7 == 0) {

				System.out.println("User input = " + userInput + " multiple by 3 and 7");

			} else if (userInput % 3 == 0) {

				System.out.println("User input: " + userInput + " multiple by 3");

			} else if (userInput % 7 == 0) {

				System.out.println("User input: " + userInput + " multiple by 7");

			}

			else {

				System.out.println("This numbers isn't multiple by 3 or 7");
			}

		}

	}

}
