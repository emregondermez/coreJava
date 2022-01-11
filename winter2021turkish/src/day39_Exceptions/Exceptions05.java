package day39_Exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		/*
		 null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya calistigimizda
		 java NullPointerException verir
		 Unchecked Exceptio'dir. (RTE)
		 */
	
		String str = " ";
		String str2 = "";
		String str3 = null;  // null bir deger degildir sadece str3 un hicbirseye esit olmadigini 
							 // soyleyen bir isaretcidir.

		System.out.println(str.length());
		System.out.println(str2.length());
		//System.out.println(str3.length()); // NullPointerException
		System.out.println(str3+"yok");
		// System.out.println(str3.concat("yok")); //NullPointerException
	}

}
