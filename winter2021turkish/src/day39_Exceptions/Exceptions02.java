package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 Eger kodumuzu yazdigimizda birden fazla exception ile iliskili durum olusuyorsa 
		 icice try catch bloklari olusturabiliriz
		 
		 Bu ornekte ilk once dosyayi okutmak istedik
		 Java "ya dosyayi bulamazsam" diye yardim istedi
		 Biz de try catch blogu ile FileNotFoundExceptions ile handle etmesine yardimci olduk
		 Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya okuyamazsam" diye yardim istedi
		 Biz de try catch blogu ile IOException ile handle etmesini sagladik
		 */
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\USER\\eclipse-workspace\\winter2021turkish\\src\\day39_Exceptions\\File");
			int k = 0;
			try {
				while ((k = fis.read()) != -1) {
					System.out.print((char)k);
				}
			} catch (IOException e) {
				 
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("" );
		System.out.println("kod bloke olmamiss");
	}

}
