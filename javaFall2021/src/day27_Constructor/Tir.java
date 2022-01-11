package day27_Constructor;

public class Tir {

	int yil=2000;
    String renk;
    String model;
    int km;
    boolean satilikMi;
    
	public Tir(int i, String string, String string2, int j, boolean b) {
		// Tir runner class'indan yolladigimiz degerlerin instance variable'lar 
		// ile eslesmesi icin atamlari yapmak lazim
		
		km=i;
		model=string;
		renk=string2;
		yil=j;
		satilikMi=b;
	}

	public Tir(int km, String model, String renk) {
		// i, string ve string2 guzel isimler degil kodumuzu sonradan incelerken 
		// anlasilir degil
		// daha anlasilir olmasi icin variable isimlerini anlamli yapalim
		this.km=km;
		this.model=model;
		this.renk=renk;
		 // basina this. yazzdigimizda Java bu variable'nin class level de oldugunu anlar
	}
    
    
    
    
}
