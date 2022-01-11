package day23_MultuDimentionalArrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		// Kullanicidan bir cumle isteyin
		// ve cumledeki kelime sayisini yazdirin

		String cumle = "Her sey, Javayla kolay degil mi?";

		String kelimeler[] = cumle.split(" ");

		System.out.println(Arrays.toString(kelimeler));

		System.out.println("Girilen cumle de " + kelimeler.length + " adet kelime var");
	}

}
