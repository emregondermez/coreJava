package day03;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		int sayi=10;
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi);
		
		System.out.println(sayi++); // bu satirda iki islem var
									// artirma ve yazdirma
		
		System.out.println(sayi); //-->14 
		// once arttirmak sonra yazdirmak isterseniz ++sayi yazdirmaliyiz 
		// once yazdirmak osnra rttirmak isrsek sayi++
		
		
		System.out.println(++sayi); // ---> 15
		
		
	}

}
