package day33_StringBuilder;

public class C07_Yarisma {

	public static void main(String[] args) {
		// Soru : For loop ile 1000 defa bir islem yapalim.
		// Oncesinde ve sonrasinda zamani kontrol edip
		// StringBuilder ve String class’larinin performanslarini karsilastiralim.

		// Ipucu:  long TimeSb = System.nanoTime();  kullanalim
		
		 long TimeSb = System.nanoTime();
		 StringBuilder sb = new StringBuilder();
		System.out.println(TimeSb);
		
		for (int i = 0; i <1000; i++) {
			sb.append(5);
		}
		System.out.println(sb);
		
		
		
		
		long TimeSb1 = System.nanoTime();
		System.out.println(TimeSb1);
		long b = TimeSb1-TimeSb;
		System.out.println(b);
		
		
		
		
		long TimeS = System.nanoTime();
		
		String str ="Veli";
		
		System.out.println(TimeS);
		
		for (int i = 0; i <1000; i++) {
			str+=5;
		}
		System.out.println(str);
		
		long TimeS1 = System.nanoTime();
		System.out.println(TimeS1);
		
		long a =TimeS1-TimeS;
		System.out.println(a);
		
		
		System.out.println(b>a);
		if (b>a) {
			System.out.println("String daha hizli");
		} else {
			System.out.println("StringBuilder daha hizli");
		}
		
	}

}
