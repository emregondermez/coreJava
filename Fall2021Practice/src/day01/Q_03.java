package day01;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		// kullanicinin ad soyad yas boy kilosunu alt alta yazidiriniz

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen adinizi yaziniz");
		String isim = scan.next();

		System.out.println("lutfen soyadinizi yaziniz");
		String soyisim = scan.next();

		System.out.println("lutfen yasinizi yaziniz");
		int yas = scan.nextInt();

		System.out.println("lutfen boyuzu yaziniz (cm)");
		int boy = scan.nextInt();

		System.out.println("lutfen kilonuzu yaziniz");
		double kilo = scan.nextDouble();

		System.out.println("isminiz : " + isim + "\n" 
				+ "Soyadiniz : " + soyisim + "\n" 
				+ "yasiniz :" + yas + "\n"
				+ "Boyunuz :" + boy + "cm" + "\n" 
				+ "Kilonuz :" + kilo + "kg");
		
		scan.close();

	}

}
