package day35_Encapsulation_Inheritance;

public class Muhasebe extends Personel{
	
	protected int saatUcreti;
	protected String statu;
	protected int maas;

	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constructor calisti");
	}
	protected  int maasHesapla() {
		int maas=8*25*saatUcreti;
		
		return maas;
	}
	public static void main(String[] args) {
		
		Muhasebe clsn1 = new Muhasebe();
		clsn1.isim="Ali";
		
	}
}
