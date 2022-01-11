package day10_Ternary_SwichCase;

public class C08_SwitchCase {

	public static void main(String[] args) {
		
		int gunNo =9;
		
		switch (gunNo) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("hafta ici");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("gecersiz gun numarasi");
		}


	}

}
