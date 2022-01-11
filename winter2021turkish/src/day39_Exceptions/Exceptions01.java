package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		// Java "ya dosyayi bulamazsam" der ve bizim cozum uretmemizi bekler
		// dosya bulma ile ilgili exception turu: FileNotFountException
		// Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exception lar a Checked Exceptions denir
	
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\winter2021turkish\\src\\day39_Exceptions\\File");
		} catch (FileNotFoundException e) {
		
		
			System.out.println(e.getMessage());
		}
			System.out.println("kod bloke olmamiss");
		
	}

	}


