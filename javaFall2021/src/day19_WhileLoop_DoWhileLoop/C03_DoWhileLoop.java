package day19_WhileLoop_DoWhileLoop;

public class C03_DoWhileLoop {

	public static void main(String[] args) {
		// While loop once kontrol eder sonra kodu calistirir
		// loop icinde artis yapilirsa kod bir sonraki kontrole kadar calismaya devam eder 
		// bu durum bazi durumlarda hatali sonuclara ulasmamiza neden olabilir
		 
		
		// do while loop ise once islemi yapar sonra sarti kontrol eder
		// ozellikle kullanicidan deger almlarda do while lopp tercih edilir
		
		
		// SORU : 'm' harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin
		
		char hrf ='m';

		do {
			
			System.out.print(hrf+" ");
			hrf--;
		}while(hrf>'c');
	}

}
