package day03;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
		StringMethods:
		kullanicidan alinan
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin
		 bir Java programi yaziniz.
	    ORNEK:
		INPUT      :  Python
		OUTPUT :   Pyt
	    */
       
    	Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen harf sayisi cift olanbir kelime yaziniz");
		String klm = scan.nextLine().toLowerCase();
   
		if (klm.length()%2==0) {
			System.out.println("girilen String'in ilk yarisi : "
							+klm.substring(0,klm.length()/2));
		}else {
			System.out.println("harf sayisi cift degil");
		}
    
    
		
		scan.close();
    }
}
