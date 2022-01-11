package day06;

import java.util.Scanner;

public class C2_IfStatement3 {

	public static void main(String[] args) {
		// If statement örneği yapmak isteyen arkadaşlar için ; eger not değeri;
		//100 ile 85 arasındaysa Başarılı.
		//84 ile 50 arasındaysa İyi.
		//49 ile 0 arasındaysa Başarısız!
		//0 ile 100 aralığı dışında (negatif veya 100'den büyük) bir değer ise Hatalı Giriş!

	
		System.out.println("Sinav notunuzu giriniz");
		Scanner scan = new Scanner(System.in);
		double note1 = scan.nextDouble();
		
		
		if( note1>=85 && note1<100) {
			System.out.println("BASARILI");
		}
		if(note1<85 && note1>=50) {
			System.out.println("GECER");
		
		}
		
		if(note1<50 && note1>=0) {
			System.out.println("BASARISIZ");
		}
	
		if(note1>100 || note1<0) {
			System.out.println("LUTFEN GECERLI BIR SINAV NOTU GIRINIZ");
		}
		if(note1==-0) {
			System.out.println("LUTFEN GECERLI BIR SINAV NOTU GIRINIZ");
		}
	
	
	scan.close();
	
	}
	
}
