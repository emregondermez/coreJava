package day10_Ternary_SwichCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. Sayi pozitifse "Soyu pozitif" yazdirin
		// negatifsse sayinin karesini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giririniz");

		double sayi = scan.nextDouble();

		System.out.println(sayi >= 0 ? "sayi pozitif" : sayi * sayi);

		scan.close();

	}

}
