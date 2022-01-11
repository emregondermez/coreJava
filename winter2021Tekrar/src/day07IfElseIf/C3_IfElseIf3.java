package day07IfElseIf;

import java.util.Scanner;

public class C3_IfElseIf3 {

	public static void main(String[] args) {
		// kullanicinin girdigi sayinin pzotif mi negatif  mi oldugunu ve
		//girilen sayinin tek mi cift mi oldugunu bulunuz
		
		
		System.out.println("lutfen bir sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		System.out.println("girdiginiz sayi: "+ sayi);
		
		if (sayi%2==0 && sayi<0) {
			System.out.println(sayi+" cift ve negatif bir sayidir");
		} else if(sayi%2==0 && sayi>0){
			System.out.println(sayi+" cift ve pozitif bir sayidir");
		}else if((sayi%2==1 ||sayi%2==-1) && sayi<0){									
			System.out.println(sayi+" tek ve negatif bir sayidir");
		}else if(sayi%2==1 && sayi>0){
			System.out.println(sayi+ " tek ve pozitif bir sayidir");
		}else  {
			System.out.println("sifir cift ve notr bir sayidir");
		}
		
		
	
		
		
	scan.close();	
	}
	
}
