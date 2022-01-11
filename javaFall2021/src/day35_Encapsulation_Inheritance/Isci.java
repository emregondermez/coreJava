package day35_Encapsulation_Inheritance;

public class Isci extends Muhasebe {

	protected String statu;
	protected String meslegi;
	protected String sendika;
	
	public Isci(){
		System.out.println("Isci parametresiz constructor calisti");
	}
	
	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.meslegi="Kaynakci";
		isci1.isim="Emine";
		isci1.saatUcreti=20;
		System.out.println(isci1.maasHesapla());
	}

}
