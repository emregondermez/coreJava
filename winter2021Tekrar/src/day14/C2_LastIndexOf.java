package day14;

import java.util.Scanner;

public class C2_LastIndexOf {

	public static void main(String[] args) {
		// kullanicdan bir cumle alin ve asagidaki uc durumdan uygun olani yazdirin
		//1 cumle java icermiyor
		//2 cumlee 1 tane java iceriyor
		//3 cumle birdan fazla java iceriyor
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String c = scan.nextLine().toLowerCase();
		String j="java";
 
		if (c.indexOf(j)!=c.lastIndexOf(j)) {
			System.out.println("cumle en az iki tane java iceriyor");
		} else if(c.indexOf(j)==c.lastIndexOf(j) &&c.lastIndexOf(j)!=-1) {
			System.out.println("cumle bir tane java iceriyor");
		}else {
			System.out.println("java yok");
		}
		
		scan.close();
	}

}
