package proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapMetod {
	static List<Kitap> kitapListe = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;
	
	public static void menu(List<Kitap> liste) {
		
		System.out.println("\n\t========= KİTAP PROGRAMI =============");
		System.out.println("1: Kitap ekle\n" + "2: Numara ile kitap sil\n" + "3: Tum kitapları listele\n" + "4: Bitir");
		System.out.print("isleminizi seciniz : ");
		int tercih = scan.nextInt();
		
		switch (tercih) {
		case 1:
			kitapEkle(liste);
			break;
		case 2:
			noIleSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;
		default:
			System.out.println("yanlis giris yapildi");
			menu(liste);
			break;

		}
		

	}

	public static void listele(List<Kitap> liste) {
		for (Kitap k : liste) {
			System.out.println(k.toString());
		}
		menu(liste);
		
	}

	public static void noIleSil(List<Kitap> liste) {
		System.out.print("Silinecek kitap no giriniz : ");
		int no = scan.nextInt();
		for (Kitap k : liste) {
			if (k.getNo()==no) {
				liste.remove(k);
				menu(liste);
			}
		}
	System.out.println("kitap bulunamadi");
	menu(liste);
	}

	public static void kitapEkle(List<Kitap> liste) {
		scan.nextLine();
		System.out.println("Kitap ismi giriniz : ");
		String kitapAdi=scan.nextLine();
		System.out.println("Yazar ismi giriniz : ");
		String yazarAdi=scan.nextLine();
		System.out.println("Yayin yilini giriniz : ");
		int yayinYili=scan.nextInt();
		System.out.println("Fiyat giriniz : ");
		double fiyat= scan.nextDouble();
		Kitap kitap = new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);
		liste.add(kitap);
		System.out.println(kitap.toString());
		
		menu(liste);
	}

	public static void bitir() {
		System.out.println("Yine Bekleriz");
		
	}

}
