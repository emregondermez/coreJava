package day02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("VKI hesaplamak icin boyunuzu giriniz : ");
		double boy = scan.nextDouble();
		System.out.print("VKI hesaplamak icin kilonuzu giriniz : ");
		double kilo = scan.nextDouble();
		
		double vki =kilo/(boy/100*boy/100);
		
		if (vki<0) {
			System.out.println("Gecerli veriler giriniz");
		} else if (vki<=20) {
			System.out.println("oldukca zayifsiniz");
		} else if (vki<=25) {
			System.out.println("Normal sinirlardasiniz");
		} else if (vki<=30) {
			System.out.println("Sisman kategorisindesiniz");
		}  else {
			System.out.println("Obez grubundasiniz");
		}

	scan.close();
	}

}
