package day08_IfElseStatement;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		// eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen"
		// diger durumlarda ekrana "Eskenar ucgen degil" yazdir

		Scanner scan = new Scanner(System.in);
		System.out.println("eskenar ucgen olup olmadigini " + "\nbulmak icin keanar uzunluklarini giriniz");

		System.out.print("\nKenar 1 : ");
		double kenar1 = scan.nextDouble();

		System.out.print("Kenar 2 : ");
		double kenar2 = scan.nextDouble();

		System.out.print("Kenar 3 : ");
		double kenar3 = scan.nextDouble();

		if (kenar1 == kenar2 && kenar1 == kenar3) {
			System.out.println("eskenar ucgendir");
		} else {
			System.out.println("eskenar ucgen degil");
		}

		scan.close();
	}

}
