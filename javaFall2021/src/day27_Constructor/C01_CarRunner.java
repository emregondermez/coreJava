package day27_Constructor;

public class C01_CarRunner {

	public static void main(String[] args) {

		Car1 car1 = new Car1();
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);

		car1.km = 75000;
		car1.model = "Corolla";
		car1.renk = "Kirmizi";
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil + " " + car1.satilikMi);

		

	}

}
