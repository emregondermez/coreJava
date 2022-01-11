package geometri2;

import java.util.Scanner;

public class Sekil extends Cember {
	
	/* 1-asagidaki hiyarasiye gore class creat ediniz...
    sekil <--Cember
    sekil <--Dikdortgen<--Kare
   2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz.
   3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
   */
	
	static Scanner scan = new Scanner(System.in);
	static int secim;
	public static void main(String[] args) {
	
		anaMenu();
	}

	public static void anaMenu() {
		System.out.print("\n\n\t---ANA MENU---\n\nCemberin; \n\tAlanini hesaplamak icin 1'e\n\tCevresini hesaplamak icin 2'ye"
				+ "\nDikdortgenin;\n\tAlanini hesaplamak icin 3'e\n\tCevresini hesaplamak icin 4'e"
				+ "\nKarenin;\n\tAlanini hesaplamak icin 5'e\n\tCevresini Hesaplamak icin 6'ya\nCikis yapmak icin 0'a basin\n\nSeciminiz : ");
	secim = scan.nextInt();
		
		switch(secim) {
		case 1:
			Cember.daireAlan();
			anaMenu();
			break;
		case 2:
			Cember.cemberCevre();
			anaMenu();
			break;
		case 3:
			Dikdortgen.alanDik();
			anaMenu();
			break;
		case 4:
			Dikdortgen.cevreDik();
			anaMenu();
			break;
		case 5:
			Kare.alanKare();
			anaMenu();
			break;
		case 6:
			Kare.cevreKare();
			anaMenu();
			break;
		case 0:
			System.out.println("\n\n\t>>>>Cikis Yapildi<<<<,");
			break;
			
		}
		
	}

}
