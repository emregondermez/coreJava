package day43_interfaces;

public interface Interface01 {
  
	
	public void motor(); // interface icinde abstract method'lar ve 
						// ozel concrate method'lar olabilir
	
	/*
	  Bir abstract method'un body'si olmadigindan method'un istenen dinamik ozelligi 
	  nasil gerceklestirecegini bilmemiz mumkun degildir
	  sadece ne yapacagini biliriz
	
	 Bu method bize sunu anlatir
	 Beni inherit eden her concrete class'in dinamik motor ozelligi olmalidir.
	
	 */
	
	void vites(); // inherit eden her concrete class'in dinamik VITES ozelligi olmalidir.
	abstract void kasa(); //inherit eden her concrete class'in dinamik KASA ozelligi olmalidir.
	
	// interface'de sadece abstract, public methodlar olur
	// bu iki keyword'u yazsak da yazmasak da Java tum methodlari bu sekilde kabul eder
	
	//Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
	// Bir class sonradan interface yapilamaz
	 
	 }
