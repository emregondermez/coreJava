package day32_Varrargs_StringBuilder;

public class C05_StringBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "Ali Can";

		String str2 = new String("Veli Cem");

		StringBuilder sb = new StringBuilder("Yasasin Java");

		
		sb.append("!!!");
	
		System.out.println(sb);

		String sbBuyukHarf = sb.toString().toUpperCase();

		System.out.println(sb);

		
		StringBuilder sb2 = new StringBuilder(3);
		sb2.append("aliasdasdas ");
		sb2.append("alasdasdasd ");
		sb2.append("aliasdasd ");
		sb2.append("aliasdasd ");
		sb2.append("aliasdasd");
		
		System.out.println(sb2);
		
	}

}
