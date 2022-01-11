package day43_Interface;

public interface C01_Interface {
	
	void motor();
	
 default void kaporta() { // interface'de body'si olan bir method yazmak istersek Java iki secenek sunar
						  // 1- method'un basina default keyword yazabilirsiniz ancak bu default acces modifier degil
	 					  // Java'nin interface icin kabul ettigi bir keyword'tur
	 					  // 2 static keywor'u
		
	}
}
