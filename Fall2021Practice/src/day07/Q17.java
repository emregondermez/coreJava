package day07;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       Seklini konsola yazdiriniz
 
    	
    		for (int i = 6; i >=1; i--) {
			
    		for (int j = i; j >=1; j--) {
				System.out.print(" ");
			}
			for (int number = 6 ; number >= i; number--) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
    	
    	for (int satir = 1; satir <=6; satir++) {
		
    		for (int bosluk =1; bosluk <= satir; bosluk++) {
				System.out.print(" ");
			}
			
    		for (int numara = satir; numara <=6 ; numara++) {
				System.out.print(numara+" ");
			}System.out.println();
		}
        

    	    
    	
    	    	
    	
    }
}


