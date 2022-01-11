package day12;

import java.util.Scanner;

public class C5_NestedIf2 {

	public static void main(String[] args) {
		/*
		 * Type a java code by using nested if() statement ask user to enter a password
		 * if the initial of password is upper case then check if it is 'A' or not if it
		 * is 'A' the output will be "Valid Password" otherwise the output will be
		 * "Invalid Password" For example : Ali==> valid password - ali==> invalid -
		 * Mark==> invalid
		 * 
		 * If the initial of the password is lowercase then check if it is 'z' or not.
		 * if it is 'z' the output will be "Valid Password' otherwise the output will be
		 * "Invalid Password" For example : zoe==> Valid Password - Zoe==> invalid -
		 * john==> invalid
		 */

		System.out.println("Please enter a password");
		Scanner scan = new Scanner(System.in);
		String psw = scan.nextLine();

		// if (psw.charAt(0) >= 'A' && psw.charAt(0) <= 'Z') {
		// if (psw.charAt(0) == 'A') {
		// System.out.println(psw + " is a valid password");
		// } else {
		// System.out.println(psw + " is invalid password");
		// }

		// } else if (psw.charAt(0) >= 'a' && psw.charAt(0) <= 'z') {
		// if (psw.charAt(0) == 'z') {
		// System.out.println(psw + " is a valid password");
		// } else {
		// System.out.println(psw + " is invalid password");
		// }
		// } else {
		// System.out.println(psw + " is invalid password");
		// }

		// my way:

		if (psw.charAt(0)>= 'A' && psw.charAt(0)<= 'Z') {
			if (psw.charAt(0) == 'A') {
				System.out.println(psw + " is a valid password");
			} else {
				System.out.println(psw + " is a invalid password");
			}

		} else if (psw.charAt(0)>= 'a' && psw.charAt(0) >= 'z') {
			if (psw.charAt(0) == 'z') {
				System.out.println(psw + " is a valid password");
			} else {
				System.out.println(psw + " is a invalid password");
			}

		} else {
			System.out.println(psw + " is a invalid password");
		}

		scan.close();
	}

}
