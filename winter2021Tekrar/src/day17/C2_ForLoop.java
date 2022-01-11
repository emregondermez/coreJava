package day17;


import java.util.Scanner;

public class C2_ForLoop {

	public static void main(String[] args) {
		// // Kullanicidan bir String isteyin ve String i tersine ceviren bir program
		// yazin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersine cevirmek istediginiz yaziyi yazin");
		String str = scan.nextLine();

		String tersYaz = "";
		for (int i =str.length()-1; i >=0; i--) {
			tersYaz+=str.charAt(i);
		}System.out.println("variable olusturarak sonuc: "+tersYaz);

		//2. yol tersYaz'i sadece yazdiracakasak variable olusturmadan da yapabilirz
		System.out.print("variale olusturmadan sonuc: ");
	for (int i =str.length()-1; i >=0; i--) {
		System.out.print(str.charAt(i));
	}
		System.out.println("");
		//3. yol method olusturarak sonuc
		
		terstenYazdiranMethod(str);	
		
		scan.close();
	}

	public static void terstenYazdiranMethod(String str) {
		String a="";
		for (int i =str.length()-1  ; i >=0; i--) {
			a+=str.charAt(i);
		}
		System.out.print("method ile sonuc: "+a);
	
	}

	
		
	}


