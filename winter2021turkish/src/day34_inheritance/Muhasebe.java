package day34_inheritance;

public class Muhasebe extends Personel {
	// muhasebe Class'innin personel Class'inin child class'i oldugunu declare etmek
	// icin clas ismine
	// extends keyword ile parent class i yazariz

	public int saatUcreti;
	public String statu;
	public int maas;
	public boolean izindeMi;
	
	
	public int maasHesapla() {
		maas = 30 * 8 * saatUcreti; 
		return maas;
	}

}
