package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Asal sayilari yazdirmak icin bir baslangic sayisi giriniz");
		int sayi = scan.nextInt();

		List<Integer> list = new ArrayList<>();

		do {
			sayi++;
			if (asalBul(sayi) == sayi) {
				list.add(sayi);
			}

		} while (list.size() != 10);

		System.out.println(list);

		scan.close();
	}

	public static int asalBul(int sayi) {

		int asal = 0;
		int sayac = 0;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}

		}
		if (sayac == 0) {
			asal = sayi;
		}

		return asal;
	}

}
