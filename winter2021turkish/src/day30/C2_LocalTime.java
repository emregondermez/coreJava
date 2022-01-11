package day30;

import java.time.LocalTime;

public class C2_LocalTime {

	public static void main(String[] args) {
		// java da Saat islem yapmak icin
		// LocalTime Class'indan obje kullaniriz

		LocalTime saat = LocalTime.now();
		System.out.println(saat);
		for (int i = 0; i < 1000000; i++) {
			i+=1;
			
		}
		LocalTime saat2=LocalTime.now();
		System.out.println(saat2);

		
	}

}
