package day08_IfElseStatement;

import java.util.Scanner;

public class C03_Ifelse {

	public static void main(String[] args) {
		// 65 den buyukse emekli olabilirsin yazdir 

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int age = scan.nextInt();

		if (age >= 65) {
			System.out.println("Emekli olabilirsin");
		} else {
			System.out.println("Emekli olamazsin, calismalisin");
		}

		scan.close();
	}

}
