// Created by Virginia Cordero on July 2018
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variables
		Scanner scanner = new Scanner(System.in);
		String firstNumber = "";
		String secondNumber = "";

		// User introduction to the program
		System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-");
		System.out.println(
				"For the next exercise, you will be asked to enter two numbers (one at a time).\n"
						+ "Please consider that both numbers should:\n"
						+ "- Be integers (whole numbers, no fractions).\n" + "- Have the same amount of digits.\n"
						+ 
						"Let's begin!\n");

		// First prompt
		System.out.println("Go ahead, type your first number:");
		firstNumber = scanner.nextLine();

		// Second prompt
		System.out.println("Type your second number:");
		secondNumber = scanner.nextLine();

		// Closing scanner
		scanner.close();

		// Evaluating length
		if (firstNumber.length() == secondNumber.length()) {

			int firstSum = 0;
			boolean result = true;
			// Where the magic happens ;)
			for (int i = 0; i < firstNumber.length(); i++) {
				char char1 = firstNumber.charAt(i);
				char char2 = secondNumber.charAt(i);
				int number1 = Character.getNumericValue(char1);
				int number2 = Character.getNumericValue(char2);

				// First iteration - saving the first sum
				if (i == 0) {
					firstSum = number1 + number2;
				}

				// Comparing current sum with previous one, if different the result is false
				int sumOfTwoNumbers = number1 + number2;
				if (sumOfTwoNumbers != firstSum) {
					result = false;
				}

				// Instructing to terminate loop if result is false
				if (result == false) {
					break;
				}
			}

			System.out.println("" + result);

		} else {
			System.out.println("Numbers do not have the same length. Please start over");
		}
	}
}
