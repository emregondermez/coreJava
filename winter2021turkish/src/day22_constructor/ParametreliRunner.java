package day22_constructor;

public class ParametreliRunner {

	public static void main(String[] args) {
		ParametreliConstructor oto1 = new ParametreliConstructor();
		System.out.println(oto1.marka + " " + oto1.model + " " + oto1.yil + " " + oto1.kazasiVarMi);
	
		ParametreliConstructor oto2 = new ParametreliConstructor(2015);
		System.out.println(oto2.marka + " " + oto2.model + " " + oto2.yil + " " + oto2.kazasiVarMi);
	
	
		ParametreliConstructor oto3 = new ParametreliConstructor("Toyota","Corolla",2018,false);
		System.out.println(oto3.marka + " " + oto3.model + " " + oto3.yil + " " + oto3.kazasiVarMi);
	
	
	
	
	
	}

	
	
	
}
