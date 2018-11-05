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
							+ "Option 2: Give a positive number and a digit, tell whether the digit appears in the number or not and how many times.\n"
							+ "Option 3: Given a positive number it gives us the inverted number.\n");
					
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

			int counter = 0;

			// Compare each digit of a number to digits between 1-9 to know if they are even
			// or not

			for (int i = 0; number.length() > i; i++) {

				switch (numbers[i]) {

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

	// Ask for a POSITIVE number and a digit, then say how many times appears the
	// digit in the number
		
		
					}
	}

}
