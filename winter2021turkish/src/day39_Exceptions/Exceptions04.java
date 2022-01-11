package day39_Exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class Exceptions04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 Eger handle edilecek exceptin'lar arasinda parent child iliskisi varsa 
		 bu durumda child exception icin catch blogu yazmasak da kodumuz calisir
		 Child exception u silmenin ;
		 pozitif yani : tek catch blogu ile tum exception lar handle edilebilir
		 negatif yani : bir sorunla karsilastigimizda bunun hangi sebepten oldugu anlasilmaz 
		 */
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\USER\\eclipse-workspace\\winter2021turkish\\src\\day39_Exceptions\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
					System.out.print((char)k);
				}
			} catch (IOException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("" );
		System.out.println("kod bloke olmamiss");

	}

}
