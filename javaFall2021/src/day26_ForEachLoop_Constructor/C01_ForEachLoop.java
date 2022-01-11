package day26_ForEachLoop_Constructor;

public class C01_ForEachLoop {

	public static void main(String[] args) {
		// iki String Array olusturunuz
		// ve bu Array'lerdeki ortak elemanlari for each loop kullanarak bulunuz
		//sonucu ekrana yazdiriniz
		// ortak yoksa ekrana ortak yok yazdirin
		
		String arr1[]= {"A","C","B"};
		String arr2[]= {"A","R","O"};
	
		int flag=0;
		for (String each1 : arr1) {
			for (String each2 : arr2) {
				if (each1.equals(each2)) {
					System.out.print(each1+" ");
					flag++;
				}
				
			}
		}
		if (flag==0) {
			System.out.println("ortak eleman yok");
		}
		
	}

}
