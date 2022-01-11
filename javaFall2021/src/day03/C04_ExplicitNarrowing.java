package day03;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		
		// eger buyuk data turundeki bir veriyi daha kucuk data turundeki 
		// variable'aatamak istersek java bunu otamatik olarak yapmaz
		
		int sayi1 =300;
	
		short sayi2= (short) sayi1;

		// esitligin sagi ile solundaki veri turleri farkli oldugundan 
		// java missmatch hatasi verir.
		// hatayi gidermek icin buyuk data turundeki degerin onune manuel onayinizi 
		// gosteren (short) yazilir 
	
		System.out.println("sayi2 = "+sayi2);
	
		
		byte sayi3= (byte) sayi2;
		System.out.println("sayi3 = "+sayi3);
		// deger byte'nin sinirlerinden daha buyuk oldugu icin java int 300'u kendi 
		// yontemine gore byte'a donustutur ve bu arada data degisir
		
		double sayi4= 87.3;
		int sayi5 = (int) sayi4;
		System.out.println("sayi5 = "+sayi5);
		// deger virgullu oldugundan ve int'da ondalik kisim olmadigindan 
		// ondalikli kismi keser ve data kaybi olusur
		
		int sayi6=27;
		int sayi7= 4;
		System.out.println(sayi6/sayi7); // bolme islemi yapilan iki sayi da int 
		// oldugu icin Java sonucu int olarak yazar ----> 6
		
		double sayi8=4;
		System.out.println(sayi6/ sayi8); // --->6.75   islem yapilan sayilardan daha
		// genis data turune sahip olan double oldugundan sonucu double yazdirir
		
		double sayi9= 17;
		
		System.out.println(sayi9/sayi7);//---->4.25
		
		
	}

}
