package day23Arrays;

import java.util.Arrays;


public class Arrays3 {

	public static void main(String[] args) {

		String isimler[]= new String[4];
		// Array'in elemanlarina ulasma ve update etme
		
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[1]="Elveda";
		isimler[3]="Fayda";
		
		isimler[0]="Derya";
		System.out.println(isimler[2]);
		// Array'in tum elemanlarini yazdirma
		
		System.out.println(Arrays.toString(isimler));
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		// method kullanmadan tum elemanlari yazdiralim //[Boss, Derya, Elveda, Fayda]
		
		for (int i = 0; i < isimler.length; i++) {
			String a =isimler[i];
			System.out.print(a+" ");
		}
		
	}

}
