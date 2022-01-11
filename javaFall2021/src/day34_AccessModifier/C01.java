package day34_AccessModifier;

public class C01 {

	private int sayiPrivate =10;
	// Private class uyelerine sadece icinde bulundugu class'tan ulasabiliriz
	
	int sayiDefault=20;
	//Default class uyelerine icinde bulundugu package'dan ulasabiliriz
	// default access modifier'in diger ismi de package access modifier'dir
	
	protected int sayiProtected=30;
	// protected class uyelerine icinde bulundugu package'dan ve child class'lardan ulasabiliriz
	
	public int sayiPublic=40;
	// public class uyelerine her yerden ulasabiliriz
		public static void main(String[] args) {
		
			C01 obj = new C01();
			System.out.println(obj.sayiDefault);
			System.out.println(obj.sayiPrivate);
			System.out.println(obj.sayiProtected);
			System.out.println(obj.sayiPublic);
			
			
			
			
			
		}
		public void staticOlmayanMethod() {
			C01 obj = new C01();
			System.out.println(obj.sayiDefault);
			System.out.println(obj.sayiPrivate);
			System.out.println(obj.sayiProtected);
			System.out.println(obj.sayiPublic);
		}
		
		
	

}
