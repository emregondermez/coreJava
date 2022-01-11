package day27_Constructor;

public class C02_ParametreliConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java'nin olustrudugu default cantructor ile obje olusturabiliyiruz
		// ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		// istersek parametreli constructorlar olusturp
		// daha obje  olusurken istedimiz ozellikleri atayabiliriz
		
		Car1 car1 = new Car1(50000,"Opel","Beyaz",2015,true);
							// int km, String model,String renk,int yil
		
		
		Car1 car2 = new Car1(35000);
		
		System.out.println(car2.km);
		
		Car1 car3= new Car1();
		car3.model="Mercedes";
	
	
	
	}

}
