package day10_SwichCase;

import java.util.Scanner;

public class C1_SwichCase {

	public static void main(String[] args) {
	
			// kullanicidan bir rakam isteyin
			//girilen rakami yazi ile yazin
		System.out.println("bir rakam giriniz");
		Scanner scan = new Scanner(System.in);
		int rakam = scan.nextInt();
		
		
		switch(rakam) {
		case 0 : 
			System.out.println("sifir");
			break;
		case 1 : 
			System.out.println("bir");
			break;
		case 2 : 
			System.out.println("iki");
			break;
		case 3 : 
			System.out.println("uc");
			break;
		case 4 : 
			System.out.println("dort");
			break;
		case 5 : 
			System.out.println("bes");
			break;
		case 6 : 
			System.out.println("alti");
			break;
		case 7 : 
			System.out.println("yedi");
			break;
		case 8 : 
			System.out.println("sekiz");
			break;
		case 9 : 
			System.out.println("dokuz");
			break;
		default:							//else gibi geriye kalan hersey icin gecerlidir.
			System.out.println("Lutfen bir rakam giriniz");
		}

	
	
		
	
	
	scan.close();
	}

}
