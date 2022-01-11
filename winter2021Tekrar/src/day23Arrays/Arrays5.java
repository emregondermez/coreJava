package day23Arrays;

import java.util.Arrays;

public class Arrays5 {

	public static void main(String[] args) {
		// Verilen bir String'i array'e nasil ceviririz?
		// verilen bir cumlede kac kelime oldugunu bulunuz
		// Verilen cumlede her kelimenin ilk harfini buyuk yapiniz
		
		String str= "Herkes Javayi tanisa severdi";
		// bu String'i kelimelere ayiralim
		// split metodu ile
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String arr2[]=str.split("");
		System.out.println(Arrays.toString(arr2));
	}

}
