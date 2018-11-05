import java.util.ArrayList;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author ik013043z1
 *
 */
public class Ex_1_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define a boolean to have a way to finish the loop when is needed

		boolean finish = false;

		// Start the loop and execute it while the flag boolean is false

		while (!finish) {

			// Print a message to the user with the options

			System.out.println("What do you want to do?\n\n" + "Option 1: How many even digit has the number?\n"

					+ "Option 2: Given a positive number it gives us the inverted number.\n"
					+ "Option 3: Given a word it tells the user whether the word is a palindrome or it is not.\n"
					+ "Option 4: Finish the program.\n" + "Select an option:\n");

			// Create a Scanner object and take the selection of the user

			Scanner sc = new Scanner(System.in);

			int selection = sc.nextInt();

			// Depending on the selection do different things using switch structure

			switch (selection) {

			// Ask a number and say how many even (bikoitia) digits has it

			case 1:

				boolean continueFlag = true;

				while (continueFlag) {

					// Take a number and see if it is positive, if not finish the program.

					System.out.println("Enter a number.\n");

					Integer num = sc.nextInt();

					if (num < 0) {

						System.out.println("This is not a POSITIVE number.\n");

						break;

					}

					// Convert the int into a string and then into an character array to compare
					// each value apart

					String number = num.toString();

					char numbers[] = number.toCharArray();

					ArrayList<Character> numbersList = new ArrayList<Character>();
					for (int a = 0; numbers.length - 1 > a; a++) {

						numbersList.add(numbers[a]);

					}

					int counter = 0;

					// Compare each digit of a number to digits between 1-9 to know if they are even
					// or not

					for (int i = 0; numbersList.size() > i; i++) {

						switch (numbersList.get(i)) {

						case '0':
						case '1':
						case '3':
						case '5':
						case '7':
						case '9':
							break;

						case '2':
						case '4':
						case '6':
						case '8':
							counter++;
							break;
						}

					}

					// Print the results

					System.out.println("There are " + counter + " even digits\n");

					System.out.println("Do you want to continue this ? [y/n]\n");

					String otherLoop = sc.next();

					while (otherLoop.charAt(0) != 'y' && otherLoop.charAt(0) != 'n') {

						System.out.println("You have entered and incorrect value, please try again");
						otherLoop = sc.next();

					}

					if (otherLoop.charAt(0) == 'n') {

						continueFlag = false;

					}

				}

				break;

			// Ask for a positive number and print the inverted

			case 2:

				// Ask for a number and see if it is positive

				System.out.println("Enter a number:\n");

				Integer num = sc.nextInt();

				boolean flagPositive2 = true;

				// If the number is negative put the flag in false

				if (num < 0) {

					System.out.println("Please enter a POSITIVE number.\n");

					flagPositive2 = false;

					break;

				}

				// If the flag is positive go on

				if (flagPositive2) {

					// Convert the number into a string a measure it

					String number = num.toString();

					ArrayList<String> toInvert = new ArrayList<String>();

					for (int b = number.length() - 1; b >= 0; b--) {

						toInvert.add(number.substring(b, b + 1));

					}

					// Print it in inverted

					for (int c = 0; toInvert.size() - 1 >= c; c++) {

						System.out.print(toInvert.get(c));
					}

				}

				System.out.print("\n");

				break;

			case 3:

				// Ask for a word and quit the blank spaces

				System.out.println("Enter a word:\n");

				String sentence = sc.next();

				sentence = sentence.trim();

				// Check if the word has any number, if it has finish the loop

				boolean flag = true;

				check: for (int o = 0; sentence.length() - 1 > o; o++) {

					if (Character.isDigit(sentence.charAt(o))) {

						System.out.println("Enter only letters!!\n");

						flag = false;

						break check;

					}

				}

				// If the flag is true execute the loop

				ArrayList<Character> ordered = new ArrayList<Character>();
				ArrayList<Character> inverted = new ArrayList<Character>();

				if (flag) {

					for (int d = 0; sentence.length() - 1 >= d; d++) {

						ordered.add(sentence.charAt(d));
						inverted.add(sentence.charAt(sentence.length() - 1 - d));

					}

					boolean answer = ordered.equals(inverted);

					if (answer) {

						System.out.println(sentence + " is a palindrome word\n");

					}

					// If not...

					else {

						System.out.println(sentence + " is not a palindrome word\n");

					}
				}

				break;

			// Finish the program

			case 4:

				finish = true;

				break;

			}
		}

	}

}
