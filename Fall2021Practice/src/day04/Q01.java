package day04;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat    x
                         hoto   x
                         ghost  x
                         lem    x
		 */
       Scanner scan = new Scanner (System.in);
       System.out.println("bir kelime girin");
    	String a =scan.next();
    	
    	degistir(a);
    	degistir("ghost");
    	
    	

    	
    	scan.close();
    }

	public static void degistir(String a) {
		if (a.startsWith("g") && a.substring(1,2).equals("h")) {
			System.out.println(a);
		} else if(a.startsWith("g") && !a.substring(1,2).equals("h")) {
			System.out.println(a.charAt(0)+a.substring(2));
		}else if(!a.startsWith("g") && a.substring(1,2).equals("h")) {
		System.out.println(a.substring(1));
		}else {
			System.out.println(a.substring(2));
		}
	}
}
