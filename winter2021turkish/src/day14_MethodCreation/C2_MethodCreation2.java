package day14_MethodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		// bir methodu calistirmak icin main methodun icinden cagirmamiz gerekir
		// bir methodu cagirmak icin ise medhod adini ve parametrelere uygun argumentleri yazmaliyiz
		
		ortalama(10,90);
		
	

	}//main medhod sonu
	
	 // bir method olusturmak istedigimizde Class in icinde ama main method un disinda 
	 //bi alanda ollusturmaliyiz. genel kullanim methodlar main medhod dan sonra olur
	
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi: "+ (sayi1+sayi2)/2);
		// bir methodu olusturmak o methodu calistirmak icin yeterli degildir.
	}



}//Class sonu
