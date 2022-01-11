package day03;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		// atama varsa olursa sayinin degeri kalici oarak degisir 
		// atama islemi olmadan yapilan islemler sadece o satirda yapilir
		// sayinin degeri kalici olark degismez
		
		int sayi1=10;
		System.out.println(sayi1+=5);
		// bu islem sayi1'in degerini 5 arttirip sayi1'e assign ediyor
		// dolayisiyla sayi1'in degeri kalici olarak degisir
		System.out.println(sayi1);

		System.out.println(sayi1+12); //27
		System.out.println(sayi1); //15
		
		sayi1++;
		// her ne kadar = isareti gorunmese de sayi1++ isleminde assing vardir
		// dolayisyla deger kalici olarak degisir
		System.out.println(sayi1); //16
	}

}
