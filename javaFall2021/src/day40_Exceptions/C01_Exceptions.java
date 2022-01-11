package day40_Exceptions;

public class C01_Exceptions {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("Bolme islmeminde sifir olmaz");
		}
		
		System.out.println("Sayilarin boumu "+(a/b));
		System.out.println("Gorev tamamlandi");

		
	}

}
