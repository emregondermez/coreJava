package day02;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * 1.Kullanıcıya "Vize sınav sonucunuzu giriniz :" 2.vize notu double değerinde
		 * girilecek. ​ 3. Kullanıcıya "Vize sınavı yüzdesini giriniz". ->> double
		 * olmalı ->> 0,40 etkiliyor !!Yüzde kaç etkilediğini Sisteme siz
		 * giriyorsunuz.!! ​ 4.Kullanıcıya "Final sınav sonucunuzu giriniz. ​ 5. final
		 * notu double değerinde olmalı. (örn: 65,5) ​ 6.Kullanıcıya
		 * "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor. ​ 7.
		 * Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı
		 * alınmalı ve çıkan sonuçlar toplanmalıdır. ​ 8. Çıkan sonucu (dersin not
		 * ortalamasını) double toplam ' a eşitleyebilirsiniz. ​ todo : Koşul kısmı eğer
		 * ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA, 80(80dahil) ile
		 * 90 arasında ise BA, 70(70 dahil) ile 80 arasında ise BB, 60(60dahil) ile 70
		 * arasında ise CB, 50(50 dahil) ile 60 arasında ise CC, 40(40 dahil) ile 50
		 * arasında ise DC, 30(30 dahil) ile 40 arasında ise DD, 30 'dan düşük ise FF
		 * gelmeli.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Vize sınav sonucunuzu giriniz :");
		String ankara = scan.nextLine();
		String b = scan.nextLine();
		
		
		if (ankara.contains(b)) {
			System.out.println("asdas");
		}
		
		
		
//		
//		double vize = scan.nextDouble();
//
//		System.out.print("Vize sınavi yuzdesi giriniz : ");
//		double vizeYuzdesi = scan.nextDouble();
//
//		System.out.print("Final sınav sonucunuzu giriniz :");
//		double finalN = scan.nextDouble();
//
//		System.out.print("Final sınavi yuzdesi giriniz : ");
//		double finalYuzdesi = scan.nextDouble();
//
//		double sonuc = (vize * vizeYuzdesi / 100) + (finalN * finalYuzdesi / 100);
//
//		if (sonuc < 0 || sonuc > 100 || vize<0 || vize>100 
//				||finalN<0 ||finalN>100) {
//			System.out.println("gecerli bir not giriniz");
//		} else if (sonuc < 30) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : FF");
//
//		} else if (sonuc < 40) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : DD");
//
//		} else if (sonuc < 50) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : DC");
//
//		} else if (sonuc < 60) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : CC");
//
//		} else if (sonuc < 70) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : CB");
//
//		} else if (sonuc < 80) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : BB");
//
//		} else if (sonuc < 90) {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : BA");
//
//		} else  {
//			System.out.println("Ortalamaniz :"+sonuc +" Notunuz : AA");
//
//		} 
//		
//		scan.close();
	}

}
