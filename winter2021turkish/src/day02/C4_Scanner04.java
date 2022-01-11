package day02;

import java.util.Scanner;

public class C4_Scanner04 {

	public static void main(String[] args) {
		
		//kullanicidan ismini isteyip ilk harfini buyuk harf olarak yazdirin
		// mehmet==> basharfiniz : M
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutden isminizi yaziniz");
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		// String de harflerin indexleri 0'dan baslar
		// biz ilk harf istedigimiz icin index olarak 0 girmeliyiz
		// eger charAt(0) yazdiktan sonra nokta koyarsak methodlar gelmez
		// cunku charAt(0) methodu kullaninca variable imizi char yapmis oluruz
		// char primitive oldugu icin method kullanamayiz
		
		System.out.println("bas harfiniz : " + ilkHarf);
		
		scan.close();
		
	}

}
