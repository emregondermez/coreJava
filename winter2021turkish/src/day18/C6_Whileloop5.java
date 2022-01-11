package day18;

public class C6_Whileloop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulan bir proram yazin
		
		
		int sayi=31;
		
		String flag="asal"; // bizim istedigimiz sartin gerceklesip gercekles,ediginikontrol eder
		
		int bolen=2;
		while(bolen<sayi) {
			if (sayi%bolen==0) {
				flag="asal sayi degil";
			}
			bolen++;
		}System.out.println(flag);

	}

}
