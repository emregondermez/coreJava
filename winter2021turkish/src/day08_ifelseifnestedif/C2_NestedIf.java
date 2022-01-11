package day08_ifelseifnestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		// nested: ic ice
	
		// verilen cinsiyet ve yas icin kisinin emekli olup olamayacagini yazdirian bir 
		// java programi yaziniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		//alisan erkekse 65 yasindan buyukse emekli olabilir.
	
		String cinsiyet="erkek";
		int yas = -9;
		
		if(cinsiyet.equalsIgnoreCase("erkek")&& yas>=65) {
			System.out.println("emekli olabilirsin");
		}else if(cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("emekli olamazsin");
		}else if(cinsiyet.equalsIgnoreCase("kadin")&& yas>=60) {
			System.out.println("emekli olabilirsin");
		}else if(cinsiyet.equalsIgnoreCase("kadin")&& yas<60) {
			System.out.println("emekli olamazsin");
		}else if(yas<0) {
			System.out.println("yas 0'dan kucuk olamaz");
		}else {
			System.out.println("lutfen gecerli bir yas giriniz");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
