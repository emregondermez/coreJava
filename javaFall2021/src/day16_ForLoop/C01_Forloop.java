package day16_ForLoop;

public class C01_Forloop {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			System.out.print(i+" ");
		}
	
		// for loop baslangic ve bitis sarti bir sayinin degerine bagli olan 
		// durumlarda tercih edilir
		
		
		/*
		for (int i = 0; i < 10; i--) {
			System.out.println(i+" ");
		}
		 */
		System.out.println();
		// eger baslangic sayisi azalis/artis ile bitis degerine yaklasmiyor, uzaklasiyorsa
		// buna sonsuz dongu denir ve durumun gerceklesmesini istemeyiz
		
		for (int i = 0; i >10 ; i++) {  // Calismaz
			System.out.println(i+" ");
		}
		// eger ilk deger icin bitis sarti true olmazsa
		// daha ilk adimda loop broken olur
		// dolayisiyla loop body hic calismadan
		// loop dan cikar
		// Loop CALISIR ama ISLEM YAPMAZ
		
		
	}

}
