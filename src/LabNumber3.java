import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {
		// declare a variable int
		// ask user for input
		// assign the input to the int variable
		// check the input to the status
		// do a while loop to reiterate if they enter something over 100 or less than 1
		Scanner scan = new Scanner(System.in);
		int x;
		boolean check = true;
		String str1;

		System.out.println("Enter a number between 1 and 100: ");
		x = scan.nextInt();
		while (check) {
			if (x >= 1 && x <= 100) {
				if (x % 2 != 0 && x < 60) {
					System.out.println(x + " and odd");
					check = false;
		}
				else if (x % 2 == 0 && x >= 2 && x <= 25) {
					System.out.println(x + ": even and less than 25");
					check = false;
		}
				else if (x % 2 == 0 && x >= 26 && x <= 60) {
					System.out.println("Even");
					check = false;
				} else if (x % 2 == 0 && x > 60) {
					System.out.println(x + ": Even");
					check = false;
				} else if (x % 2 != 0 && x > 60) {
					System.out.println(x + ": Odd and over 60");
					check = false;

				}
			}
			else {
				System.out.println("please enter a valid whole number between 1 and 100 ");
				x = scan.nextInt();
				check = true;
				continue;

			}
			System.out.println("continue? Y/N");
			str1 = scan.next();
			if (str1.equals("y") || str1.equals("Y")) {
				System.out.println("please enter a whole number between 1 and 100");
				x = scan.nextInt();
				check = true;
			
			}
			else if (str1.equals("n") || str1.equals("N")) {
				System.out.println("no problem ");
				check = false;
			} else {
				System.out.println("try again");
				str1 = scan.next();
				check = true;
			}

		}
		System.out.println("Goodbye!");
		scan.close();

	}
}


