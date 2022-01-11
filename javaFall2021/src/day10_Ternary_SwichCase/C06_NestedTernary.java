package day10_Ternary_SwichCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// Kullanicidan bir harf isteyin buyukse buyuk kucukse kucuk 
		// harf degilse harf degil yazdir
		
		char harf ='?';
		
		
		String sonuc =(harf>='a' && harf <='z') ? "Kucuk harf":
			(harf>='A' && harf <='Z' ? "buyuk harf" : "girilen karakter harf degil");
		
		System.out.println(sonuc);
		
	}

}
