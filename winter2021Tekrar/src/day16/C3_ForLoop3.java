package day16;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		//kullanicidan 2 tam sayi alin ikinci sayiya kadar tum tam sayilari aralarinda bir bosluk birakarak yazirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a<b) {
			for (int i = a; i <=b; i++) {
			System.out.print(i+" ");	
			}
		} else {
			for (int i = a; i >=b; i--) {
			System.out.print(i+" ");
			}
		}

	
	scan.close();
	}

}
