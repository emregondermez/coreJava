package day07;



public class Q03 {
	public static void main(String[] args) {

		/*
		 * Girilen bir stringdeki a harfi sayisini bulunuz. ama c harfine gelirse
		 * donguden cikilsin
		 * 
		 * Bugun hava oldukca guzel -> 2
		 */

		String str = "Bugun hava oldukca guzel";

		int sayac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c') {
				break;
			}else if(str.charAt(i) == 'a') {
				sayac++;
			}
		}System.out.println(sayac);

	}

}
