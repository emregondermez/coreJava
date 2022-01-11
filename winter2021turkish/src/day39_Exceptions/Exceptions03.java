package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ic ice try catch blogu yerine 
		// 1 tane try ve multiple catch blogu kullanabiliriz
		// once Child class i yazmaliyiz
		//Aksi takdirde child'a is kalmaz
		// Java  erisilmez catch blogu diyerek CTE verir
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\USER\\eclipse-workspace\\winter2021turkish\\src\\day39_Exceptions\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
					System.out.print((char)k);
				}
			} catch (FileNotFoundException e) {
				 
				e.printStackTrace();
			

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("" );
		System.out.println("kod bloke olmamiss");
	
	}
}
