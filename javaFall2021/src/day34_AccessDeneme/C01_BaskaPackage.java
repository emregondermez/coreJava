package day34_AccessDeneme;

import day34_AccessModifier.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		C01 obj = new C01();
	//	System.out.println(obj.sayiDefault);  -----> Sadece ayni package'den ulasilabilir
	//	System.out.println(obj.sayiPrivate);  -----> Sadece ayni class'tan ulasilabilir 
	//	System.out.println(obj.sayiProtected);----->Ayni package icerisndeki class'lar ve child class'lar ulasabilir
		System.out.println(obj.sayiPublic);
	}

}
