package ManavProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends Urunler {

	protected static List<Urunler> manav = new ArrayList<>();
	protected static List<Urunler> sakulteri = new ArrayList<>();
	protected static List<Urunler> market = new ArrayList<>();
	
	
	static Scanner scan = new Scanner(System.in);
	static int secim;
	static String cvp;

	public static void main(String[] args) {

		urunEkle();
		System.out.println("\n\n\t|__--***HOS GELDINIZ***--__|");
		anaMenu();

	}

	

	public static void anaMenu() {
		System.out.println(
				"\n\tAna Menu\n\nManav icin 1'e\nMarket icin 2'ye\nSakulteri icin 3'e\nCikis icin 0'a Basin\n\nSeciminiz : ");
		secim = scan.nextInt();
		switch (secim) {
		case 1:
			manavMenu(manav);
			devamMi();
			break;
		case 2:
			marketMenu(market);
			devamMi();
			break;
		case 3:
			sakulteriMenu(sakulteri);
			devamMi();
		case 0:
			System.out.println("\n\n\t>>>>>Cikis Yapildi<<<<<<");
			break;
		default:
			System.out.println("Lutfen gecerli bir tercih giriniz");
			anaMenu();
		}

	}

	public static void devamMi() {
		System.out.println("Alis verise devam etmek istiyor musunuz ?(E/H)");
		cvp=scan.next().substring(0,1);
		
		if (cvp.equalsIgnoreCase("E")) {
			anaMenu();
		} else if (cvp.equalsIgnoreCase("H")) {
			cikis();
		}else {
			System.out.println("Lutfen gecerli bir tercih giriniz. Sizi ana menuye yonlendiriyorum");
			anaMenu();
		}

	}

	public static void cikis() {
		System.out.println("\n\n\t>>>>>Cikis Yapildi<<<<<<");

	}

	public static void sakulteriMenu(List<Urunler> sakulteri) {
		for (Urunler a : sakulteri) {
			System.out.println(a);
		}

	}

	public static void marketMenu(List<Urunler> market) {
		for (Urunler a : market) {
			System.out.println(a);
		}
		
		

	}

	private static void manavMenu(List<Urunler> manav) {
		for (Urunler a : manav) {
			System.out.println(a);
		}

	}
	public static void urunEkle() {
		// ** MANAV
				Urunler urun1 = new Urunler("Elma", 2);
				manav.add(urun1);
				Urunler urun2 = new Urunler("Portakal", 3);
				manav.add(urun2);
				Urunler urun3 = new Urunler("Muz", 2.6);
				manav.add(urun3);
				Urunler urun4 = new Urunler("Kayisi", 5);
				manav.add(urun4);
				Urunler urun5 = new Urunler("kivi", 4);
				manav.add(urun5);
				Urunler urun6 = new Urunler("Domates", 2.9);
				manav.add(urun6);

				// ** SAKULTERI
				Urunler peynir = new Urunler("Peynir", 6);
				sakulteri.add(peynir);
				Urunler zeytin = new Urunler("Zeytin", 10);
				sakulteri.add(zeytin);
				Urunler sucuk = new Urunler("Sucuk", 11);
				sakulteri.add(sucuk);
				Urunler kasar = new Urunler("Kasar", 6);
				sakulteri.add(kasar);
				Urunler sut = new Urunler("Sut", 0.50);
				sakulteri.add(sut);

				// ** MARKET
				Urunler cips = new Urunler("Cips", 1);
				market.add(cips);
				Urunler kola = new Urunler("kola", 2);
				market.add(kola);
				Urunler sakiz = new Urunler("Sakiz", 0.25);
				market.add(sakiz);
				Urunler ekmek = new Urunler("Ekmek", 0.50);
				market.add(ekmek);
		
	}
}
