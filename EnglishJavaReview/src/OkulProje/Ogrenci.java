package OkulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci {

	static int ogrenciNo = 100;
	static Scanner scan = new Scanner(System.in);

	static List<OgrenciFields> ogrenci = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("\n\t\t****Hos Geldiniz*****");
		anaMenu(ogrenci);

	}

	public static void anaMenu(List<OgrenciFields> ogrenci) {
		System.out.print(
				"\n\t===Ana Menu===\n1->Ogrenci Kayit\n2->Ogrencileri Listele\n3->Kayit sil\n4->cikis\nSeciminiz : ");
		int secim = scan.nextInt();
		switch (secim) {
		case 1:
			ogrenciKayit(ogrenci);
			break;
		case 2:
			listele(ogrenci);
		case 3:
			kayitSil(ogrenci);
		case 4:
			cikis();
			break;
		default:
			System.out.println("Lutfen gecerli bir islem giriniz");
			break;
		}
	}

	public static void cikis() {
		System.out.println("\n\t----Yine Bekleriz----");
		
	}

	public static void kayitSil(List<OgrenciFields> ogrenci) {
		System.out.println("Silmek isteginiz ogrenci nosunu giriniz");
		int silinecekNo = scan.nextInt();
		int sayac=0;
		for (OgrenciFields o : ogrenci) {
			if (silinecekNo == o.getOgrenciNo()) {
				ogrenci.remove(o);
				System.out.println(o.getOgrenciAdi() + " adli ogrencinin kaydi silindi");
				sayac++;
				anaMenu(ogrenci);
			}
		}
		if (sayac==0) {
			System.out.println("**Ogrenci bulunamadi**");
		}
		anaMenu(ogrenci);
	}

	public static void listele(List<OgrenciFields> ogrenci2) {
		System.out.println("Ogrenci No\t Ogrenci Adi\t Ortalamasi");
		System.out.println("----------\t-----------\t---------------");
		for (OgrenciFields each : ogrenci) {
			System.out.println(each.toString());
		}
		anaMenu(ogrenci);
	}

	public static void ogrenciKayit(List<OgrenciFields> ogrenci) {
		scan.nextLine();
		System.out.println("ogrenci adi giriniz");
		String ogrenciAdi = scan.nextLine();
		System.out.println("ogrenci not ortalamasi giriniz");
		double notOrtalamasi = scan.nextInt();
		OgrenciFields obj = new OgrenciFields(++ogrenciNo, ogrenciAdi, notOrtalamasi);
		ogrenci.add(obj);
		System.out.println(ogrenciAdi+" adli ogrenci kaydedildi ");
		anaMenu(ogrenci);
	}

}
