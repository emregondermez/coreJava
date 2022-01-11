package day16;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir sayi alin
		//bir den girdigi sayiya kadar olan tum tam sayilarin toplamini yazdirin

	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen pozitif bir tam sayi giriniz");
		int sayi1 = scan.nextInt();
	
		int toplam=0;
		
		

			for (int i = 1; i <=sayi1 ; i++) {
				
				toplam+=i;
			}
		System.out.println(toplam);
	
	
	
	
	
	
	
	
	
	scan.close();
	}

}
