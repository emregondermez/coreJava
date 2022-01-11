package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
	
			// java'da bir den fazla elamani koyabileceginiz (strore) object'ler vardir.
			//bugun bunlardan ilki olan array leri ogrencegiz
		
		
		int arr[] = {10,20,30}; // int[] arr seklinde de kullanilir
								// bu orenkte Array'in elemanlarini idrek yazdigimiz icin 
								// uzunluk belirtmeye gerek kalmadi
								// bu kullanimda max eleman sayisi (length) yazdigimiz elaman sayisidir.
		
		System.out.println(arr);// Array bir objedir eger direk olarak Array'i yazdirmak istersek Java referansini calistirir
		
		System.out.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim[]= new String[3]; //[null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));//[Ali, null, null]
		takim[1]="Veli";
		takim[2]="Hasan";
		System.out.println(Arrays.toString(takim));
		
		 
		//takim[3]="Mehmet"; // Java Run Time programdir. Dolayisiyla Array programi calistirinca oluesturulur.
						  // 36. satirda syntax olarak hata olmadigindan CTE olmaz.
						 // program calistiginda 3.index olmadigi icin RTE verir.
		
		// Array'daki bir elemani update etme:
		// veli'nin  yerine kemal gelsin
		takim[1]="Kemal";		
		System.out.println(Arrays.toString(takim));
		
		// Bir Array'in uzunlugunu nasil buluruz?
		System.out.println(takim.length);//3
										// String deki length() Array'da length
		
		//Array'deki son elemani Mehmet yapin
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim ));
		
		// eger Array'in eleman sayisi tek ise ortadaki elemani Can yapalim
		
		if (takim.length%2==1) {
			takim[(takim.length-1)/2]="Can";
		}
		System.out.println(Arrays.toString(takim ));
		
	}

}
