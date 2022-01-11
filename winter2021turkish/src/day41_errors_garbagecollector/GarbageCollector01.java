package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;

			/* bu kod calistiginda 1001 tane obje olusur
			ilk basta 1 tane olusturduk 
			sonra her dongude str'a concatiation yapacak
			ama String Class'i immutable oldugu icin her yeni degeri koymak icin 
			yeni bir String objesi olusturur ve eski obbje'den pointer silinir 
			
			dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje 
			1000 tane de hic bir pointer'in isaret etmedigi obje heap memory de bulunur
			*/

			List<String> list= new ArrayList<>();
			/*
			 bu satir Java'ya yeni bir obje olusturmasini soyluyor
			 Java yeni bir obje icin yer var mi diye momory'i kontrol eder ve momory kritik seviyede ise
			 Garbage Collector'u devreyee sokar
			 */
			
			/*
			 Garbage Collector finalize() methodunu calistirir
			 finalize method'u silinecek objeleri isaretler ve 
			 sonra Garbage Collector finalized olan objeleri siler
			 */
			
			
		}

	}

}
