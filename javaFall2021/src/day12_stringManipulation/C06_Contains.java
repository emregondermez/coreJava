package day12_stringManipulation;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
	    //  Soru 1) Kullanicidan email adresini girmesini isteyin, 
        //         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, 
        //         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , 
        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin 
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
        
        
        String email=scan.next();

        
        if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresi giriniz");
		} else if(!email.endsWith("@gmail.com")){
			System.out.println("gecerli bir gmail hesabi giriniz");
		}else {
			System.out.println("KAYDEDILDII");
		}
        
        
        scan.close();
	}

}
