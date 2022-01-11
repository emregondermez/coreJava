package day16_ForLoop;

public class C03_ForLoop {

	public static void main(String[] args) {
		// 10 ve 30 arasindaki aralarinda , olarak ayni satirda yazdiriniz

		
		for (int i = 10; i <=30 ; i++) {
			if (i==30) {
				System.out.println(i);
			} else {
				System.out.print(i+", ");
			}
		
		}
		System.out.println();// bos syso sadece alt satira gecmek icin kullanilir
		
		for (int j = 10; j <=29; j++) {
			System.out.print(j+", ");
		}
		
		System.out.println(30);
		
		
		}
	
		
	}


