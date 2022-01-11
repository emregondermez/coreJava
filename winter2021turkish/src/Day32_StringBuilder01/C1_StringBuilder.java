package Day32_StringBuilder01;

public class C1_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Rumeysa");
		System.out.println(sb1);

		sb1.append(" ").append("Cetinturk");
		System.out.println(sb1);

		String cumle = "javayi cok sever";
		sb1.append(cumle, 6, 11); // baslangic index i dahil(inclusive), bitis index'i dahil degildir (exclusive)
		System.out.println(sb1);

		System.out.println(sb1.length());
		System.out.println(sb1.capacity());

		System.out.println(sb1.charAt(1));

		sb1.delete(17, 21); // istedigimiz arasindaki kismi siler
		System.out.println(sb1);

		sb1.deleteCharAt(16);
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1.equals(sb2)); // false StringBuilder da equal metodu String'den farkli calisir
												// ancak ayni obje ile kiyaslandiginda true verir. (sb1.equals(sb1); -->
												// true

		System.out.println(sb1.reverse()); // tersten yazdirin

	}
}
