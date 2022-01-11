package day07;

public class Q01 {
    /*

       sayaci ritmik ilerleyen ve adim sayisi belli ise FOR kullanilir
      Degilse While kullanilir, eger  donguye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       Problem Tanimi
        100'den 0'a kadar 13'e tam bolunebilen sayilari ve toplamlarini ekrana yazdriniz (buyukten kucuge)

         Ekran ciktisi
        91
        78
        65
        52
        39
        26
        13       */
    public static void main(String[] args) {
    	
    	int toplam=0;
    	for (int i = 100; i >0 ;i--) {
			if (i%13==0) {
				System.out.println(i);
				toplam+=i;
			}
		}System.out.println("100'den kucuk 13 e bolunebilen sayilarin toplami = "+toplam);
    	
    	
    }
}
