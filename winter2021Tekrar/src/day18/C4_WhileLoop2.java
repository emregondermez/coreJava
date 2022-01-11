package day18;

public class C4_WhileLoop2 {

	public static void main(String[] args) {
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na
		//tam bolunebilen sayilari yazdirin.
		
		int count=0;
		for (int i = 100; i <=999 ; i++) {
			if (i%90==0 && i%20==0 && i%15==0) {
				System.out.print(i+" ");
				count++;
			} 			
		}System.out.println("");
		System.out.println("bu sayilara bolunebilen "+count+" adet sayi vardir");
	
		//while loop ile 
		
		int baslangic=100;
		while(baslangic<999) {
			if (baslangic%90==0 && baslangic%20==0 && baslangic%15==0 ) {
				
				System.out.print(baslangic+" ");
			}
			baslangic++;
		}
	
	
	}

}
