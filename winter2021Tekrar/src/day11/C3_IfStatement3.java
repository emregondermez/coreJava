package day11;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// ask user to enter his/her age
		// if the age is between 18 and 65 then output will be "you should work "
		// else output will be "no need to work"

		System.out.println("Please enter your  age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();

		if (age<0) {
			System.out.println("you can not work before you  are born :)");
		}else if(age <= 65 && age >= 18) {
			System.out.println("you should work");
		
		} else {
			System.out.println("no need to work");
		}

		
		scan.close();
	}

}
