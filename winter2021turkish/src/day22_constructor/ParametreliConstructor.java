package day22_constructor;

public class ParametreliConstructor {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public ParametreliConstructor(int yil) {
		 this.yil=yil;
	}

	public ParametreliConstructor() {

	}

	public ParametreliConstructor(String Marka, String Model) {
		this.marka=Marka;
		this.model=Model;
		
	}

	public ParametreliConstructor(String Marka, String Model, int yil, boolean kazasiVarMi) {
		this.marka=Marka;
		this.yil=yil;
		this.model=Model;
		this.kazasiVarMi=kazasiVarMi;
	}

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}