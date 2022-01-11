package day03;

public class Q11 {
	public static void main(String[] args) {
		/*
		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz. String
		 * pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
		String harf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(harf.charAt(harf.indexOf("A")) 
				+ " " + harf.charAt(harf.indexOf("L")) 
				+ " " + harf.toLowerCase().charAt(harf.indexOf("I")));

	}

}
