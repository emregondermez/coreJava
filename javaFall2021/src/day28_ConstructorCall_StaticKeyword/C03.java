package day28_ConstructorCall_StaticKeyword;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
// 3 tane obje olusturalim ve degisimleri gozlemleyelim
        
        C02 obje1= new C02();
        System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + obje1.y);
        
        obje1.x++;
        obje1.y++;
        System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + obje1.y);
        
        
        C02 obje2= new C02();
        System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y);
        
        obje2.x++;
        obje2.y++;
        
        System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y);
        
        System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in "
                           + " x : " + obje1.x + " y : " + obje1.y);
        
        
        
        C02 obje3 = new C02();
        
        obje3.x=20;
        obje3.y=40;
        
        
        System.out.println("obje3'den sonra obje1'in x :" + obje1.x);//6
        System.out.println("obje3'den sonra obje2'in x :" + obje2.x);//6
        System.out.println("obje3'den sonra obje3'in x :" + obje3.x);//20
        
        
        System.out.println("obje3'den sonra obje1'in y :" + obje1.y);//40
        System.out.println("obje3'den sonra obje2'in y :" + obje2.y);//40
        System.out.println("obje3'den sonra obje3'in y :" + obje3.y);//240

	}

}
