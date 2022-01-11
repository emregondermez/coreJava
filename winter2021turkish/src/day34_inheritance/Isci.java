package day34_inheritance;

public class Isci extends Muhasebe{

	public static void main(String[] args) {
	
		Isci isci1 = new Isci();
		isci1.isim="Omer";
		isci1.soyIsim="Aykiri";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=10;
		isci1.statu="isci";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.isim+" "+isci1.soyIsim+" "+isci1.id+" "+isci1.izindeMi
				+" "+isci1.statu+" "+isci1.maas+"TL");
	
	}

}
