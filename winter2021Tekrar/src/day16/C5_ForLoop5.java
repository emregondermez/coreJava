package day16;

public class C5_ForLoop5 {

	public static void main(String[] args) {
		// 50'den buyuk 150'den kucuk olan tam sayilardan
		// 7 ile bolunebilenleri toplayip
		// sonucu yazdiran bir kod yaziniz

		int toplam = 0;
		
		for (int i = 51; i < 150; i++) {
			if (i % 7 == 0) {
				toplam += i;
			}
		}
		System.out.println(toplam);

	}

}
