package day18;

public class C3_WhileLoop {

	public static void main(String[] args) {
		// 10'dan 30'a kadar olan sayilardan 4 ile bolunebilneleri yan yana aralarinda bir 
		//bosluk birakrak yazdirin
		
	//for loop ile
		System.out.print("for loop ile   ==> ");
		for (int i = 10; i <=30; i++) {
			if (i%4==0) {
				System.out.print(i+" ");
			}
		}
	
	System.out.println("");
	// while loop ile 
		System.out.print("while loop ile ==> ");
		int baslangic =10;
		while(baslangic<=30) {
			if (baslangic%4==0) {
				System.out.print(baslangic+" ");
			}
			baslangic++;
		}
	
	}

}
