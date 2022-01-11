package day15_MedhodCreation;

public class C4_Forloop1 {

	public static void main(String[] args) {
		//5 defa  Hello World yaziralim
		
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");

		// bunun yerine loop kullaniyoruz
		//ne yapacagimizi ve kac kere yapacagimizi java'ya soyluyoruz
		
		//tum loop larda uc seyiz yazmak zorundayiz
		//1--> baslangic degeri
		//2-->bitis degeri
		//3-->artis degeri
		
		for (int i =100; i>3 ;  i-- ) {
			System.out.println(i +" Hello World");
		}
	
	// NOT: eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
	// NOT: loop da  artis pozitif oldugu gibi negatif de olabilir (i--)
	//NOT : artis degeri 1 olmak zorunda degil, farkli olabilir
	//NOT: eger loop un sarti hic dogru olmazsa loop body hic devreye girmez.
	
	}

}
