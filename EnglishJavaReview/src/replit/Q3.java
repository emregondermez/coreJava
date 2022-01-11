package replit;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Kullanicidan 3 basamakli bir sayi alin yazi olarak yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int yuzler= (sayi/100)%10;;
		switch(yuzler) {
		case 1:
			System.out.print("yuz ");
			break;
		case 2:
			System.out.print("iki yuz ");
			break;
		case 3:
			System.out.print("uc yuz ");
			break;
		case 4:
			System.out.print("dort yuz ");
			break;
		case 5:
			System.out.print("bes yuz ");
			break;
		case 6:
			System.out.print("alti yuz ");
			break;
		case 7:
			System.out.print("yedi yuz ");
			break;
		case 8:
			System.out.print("sekiz yuz ");
			break;
		case 9:
			System.out.print("dokuz yuz ");
			break;
		}
		
		int onlar =(sayi/10)%10;;
		switch(onlar) {
		case 1:
			System.out.print("on ");
			break;
		case 2:
			System.out.print("yirmi ");
			break;
		case 3:
			System.out.print("otuz ");
			break;
		case 4:
			System.out.print("kirk ");
			break;
		case 5:
			System.out.print("elli ");
			break;
		case 6:
			System.out.print("atmis ");
			break;
		case 7:
			System.out.print("yetmis ");
			break;
		case 8:
			System.out.print("seksen ");
			break;
		case 9:
			System.out.print("doksan ");
			break;
			default:
				System.out.println();
		}
		
		
		int birler=sayi%10;
		switch(birler) {
		case 1:
			System.out.print("bir");
			break;
		case 2:
			System.out.print("iki");
			break;
		case 3:
			System.out.print("uc");
			break;
		case 4:
			System.out.print("dort");
			break;
		case 5:
			System.out.print("bes ");
			break;
		case 6:
			System.out.print("alti");
			break;
		case 7:
			System.out.print("yedi");
			break;
		case 8:
			System.out.print("sekiz");
			break;
		case 9:
			System.out.print("dokuz");
			break;
		}
		
		
		
		scan.close();
		}
		
	}


