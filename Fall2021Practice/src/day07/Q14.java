package day07;



public class Q14 {

    /*  Problem TanΔ±mΔ±
        Girilen bir sayΔ± kadar satΔ±r ve sΓΌtΓΌnu olan ve
        saΔ? kenara dayalΔ± ΓΌΓ§geni basan kodu yazΔ±nΔ±z.

        Ekran Γ‡Δ±ktΔ±sΔ±
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {

    	int sayi=5;
    	
    	for (int satir = 1; satir <= sayi; satir++) {
			for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {
				 System.out.print(" ");
			}
			for (int y = 1; y <= satir; y++) {
				System.out.print("*");
			
			}
    	System.out.println();
    	}
    	

       System.out.println("\n\n\n");
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                   Seklini yazdiriniz
             */

    for (int i = 1; i <= sayi; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}System.out.println();
	}
        
    }
}
