package geometri2;

import java.util.Scanner;

public class Cember {

	static double yariCap;
	static double pi =3.14;
	static Scanner scan = new Scanner(System.in);
	static double daireAlan;
	static double cemberCevre;
	public static void main(String[] args) {
	
		daireAlan();
		cemberCevre();
		
	}

	public static void cemberCevre() {
		System.out.println("Cemberin cevresini bulmak icin yari cap giriniz");
		yariCap=scan.nextDouble();
		cemberCevre=2*pi*yariCap;
		System.out.println("Girdifiniz cemberin cevresi = "+cemberCevre);
	}

	public static void daireAlan() {
		System.out.println("Dairenin alanini hesaplamak icin yari cap giriniz. . ");
		yariCap=scan.nextDouble();
		daireAlan=pi*yariCap*yariCap;
		System.out.println("Girdiginiz dairenin alani = "+daireAlan);
	}

}
