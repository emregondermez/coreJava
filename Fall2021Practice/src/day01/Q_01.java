package day01;

public class Q_01 {

	public static void main(String[] args) {
		// Write a Java program to break an integer into a sequence
		// of individual digits.
		// Hint: use / and %
		// ex: input: 12345
//		    output: 1
//		            2
//		            3
//		            4
//		            5

		int sayi = 12345;

		int birler = sayi % 10;
		int onlar = sayi % 100 / 10;
		int yuzler = sayi % 1000 / 100;
		int binler = sayi % 10000 / 1000;
		int onBinler = sayi / 10000;

	
	
		
	// consaolda alt satiri yazdirmak icin "\n" kullanilir

	System.out.println(onBinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);


		
		
		//		HOCANIN COZUMU
		
		
		
//		public static void main(String[] args) {
//			// verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
//			// ex: input: 
////			    output: 1
////			            2
////			            3
////			            4
////			            5
//			
//			int sayi=12345;
//			int birler= sayi%10; //birler basamagi sayinin 10 a bolumunden kalanıdır.-->5
//			int onlar=(sayi/=10)%10;
//			int yuzler=(sayi/=10)%10;
//			int binler=(sayi/=10)%10;
//			int onBinler=(sayi/=10);
//			
//			/*
//		    System.out.println(binler);
//			System.out.println(yuzler);
//			System.out.println(onlar);
//			System.out.println(birler);
//			 */
//			
//			// consolda alt satira yazdırmak için "\n"  komutu kullanılır.
//			
//			System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
//			
//			
//		}
	}

}
