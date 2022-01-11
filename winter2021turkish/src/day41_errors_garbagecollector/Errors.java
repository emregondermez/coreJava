package day41_errors_garbagecollector;

public class Errors {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		//  Java'da Error dendiginde onune gecilemeyen, kod ile cozulemeyen 
		//sistemden kaynekli buyk hatlar kast edilir
		
		// Error'lar unchecked'dir ve Java ongoremez
		// ancak gerceklestiginde kodun calismasi durdurulur

		
		String str="";
		for (int i = 0; i < 10000000; i++) {
			str+=i;
		}
	
		
	}

}
