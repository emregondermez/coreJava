package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\winter2021turkish\\src\\day39_Exceptions\\File");

		// try-catch blogu exception ile handle etmekde kullanilir
		// throw keyword'u ise sadece declaration'dir.
		// dolayisiyla throws kullanilan bir metod da exception olusursa Kod Bloke olur.
				
	int k=0;
	
	while((k=fis.read())!=-1) {
		System.out.print((char)k);
	}
	/*
	 Eger birden fazla exception icin throws keyword'u kullancaksak
	 yazacagimiz exception'larin arasindaksi iliski ve siralama onemli olur
	 eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa
	 once child exception yazilmalidir, akis taktirde child exception erisilmez olur
	 */
	
	}

}
