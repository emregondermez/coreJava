package day21_Scope_Arrays;

public class C03_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// elemanlari  Ali, Veli. Ayse,Fatma olan bir array olsuturun
		
		
		String arr[]= new String [4];
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		
		String arr2[]= {"Ali","Veli","Ayse","Fatma"};

		// onceki Array'deki Ali yi Can ; fatma yi gul yap
		
		
		arr[0]="Can";
		arr[3]="Gul";
		
		System.out.println(arr[0]);
	}

}
