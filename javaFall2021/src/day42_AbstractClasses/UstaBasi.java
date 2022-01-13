package day42_AbstractClasses;

public class UstaBasi extends Isci {

	public void statu() {
		System.out.println("Statu -> Ustabasi");
	}

	public void maas() {
		System.out.println("Ustabasi maasi --> 4500 ");
	}

	public void mesai() {
		System.out.println("ustabasi mesai yapar");
	}
	public static void main(String[] args) {
		UstaBasi usb1 = new UstaBasi();

		usb1.statu();
		usb1.maas();
		usb1.mesai();
		
		// Obje olusturdugumuz en alttaki class parent class daki metotlari
		// override edince, class dan olusturulan objjeler en dogru ozelliklere 
		// kavustu
		
		// Ama klasik parent-child iliskisinde tum metodlari override etme zorunlulugu 
		// yoktur
		
		// **> Java parent class lardaki tum metodlari override etme mecburiyeti kazandirmak
		// icin abstract class yapisini olusturmustur
		
		// Yani bir class i abstract olarak tanimlarsak child class'lar tum metodlari 
		// override etmek zorunda kalir
		
		
	}
}
