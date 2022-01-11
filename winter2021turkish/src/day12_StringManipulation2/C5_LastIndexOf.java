package day12_StringManipulation2;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin ve asagidaki uc durumdan uygun olani yazdirin
		//1 cumle java iceriyor
		//2- cumle bir tane java iceriyor
		//cumle de birden fazla java var
	
		System.out.println("bir cumle yaziniz");
		Scanner scan = new Scanner(System.in);
		String cumle = scan.nextLine().toLowerCase();
		
		int sonuc = cumle.indexOf("java");
		int sonuc2 = cumle.lastIndexOf("java");
		
		
		if (sonuc==-1) {
			System.out.println("java yok");
		} else if(sonuc==sonuc2){
			System.out.println("bir tane java icerir");
		}else {
			System.out.println("birden fazla java iceriyor");
		}
	
	
	scan.close();
	}

}
