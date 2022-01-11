package day03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //KullanΔ±cΔ±dan alacaΔ�Δ±nΔ±z, 3 kelimeden oluΕ�an ismi
        //orn. Ahmet Emin Yilmaz -> A.E.Y.  formatmatiyla yazdiriniz

    	Scanner scan = new Scanner(System.in);
		System.out.println("adinizi soy adinizi gitiniz");
		String str = scan.nextLine().toUpperCase();
		
		System.out.println(str.charAt(0)+"."+str.charAt(str.indexOf(" ")+1)
					+"."+str.charAt(str.lastIndexOf(" ")+1));
	    
	 scan.close();   	
    }       
}
