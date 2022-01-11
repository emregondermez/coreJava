package day22_constructor;

public class CarUretRunner {
	
	public static void main(String[] args) {
		CarUret car1 =new CarUret();
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2011;
		car1.kazasiVarMi=true;
		car1.yakit("Benzin");
		car1.vites("duz");
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
	}

}
