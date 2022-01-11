package day03;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		// KullanΔ±cΔ±dan alacaΔ�Δ±nΔ± bir stringde
		// boΕ�luk karakterinin olup olmadΔ±Δ�Δ±nΔ± kontrol ediniz.

		// KullanΔ±cΔ±dan alacaΔ�Δ±nΔ± bir stringin bos olup olmadΔ±Δ�Δ±nΔ±
		// kontrol ediniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir String yaziniz");
		String str = scan.nextLine();
		
		
		boolean varMi = str.contains(" ");
		System.out.println("bosluk var mi ? : "+ varMi);
		System.out.println("String bos mu ? : "+str.isEmpty());
		
		
		if (str.contains(" ")) {
			System.out.println("bosluk var ");
		}else {
			System.out.println("bosluk yok");
		}
		
		
		scan.close();
	}
}
