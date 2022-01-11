package day34_AccessModifier;

public class C05 {

	private	int asgariMaas=4000;
	
	
	public static void main(String[] args) {
		

	}

	/*
	 bir class taki herhangi bir class uyesine ulasabilirsin ama degistiremezsin
	 diyorsan
	 1-> class uyesini PRIVATE yapar
	 2-> private class uyesine hic bir sekilde ulasim olmayacagi icin 
	 sadece gorebilmesi icin getter() olustruruz 
	 */
	
	

	public int getAsgariMaas() {
		return asgariMaas;
	}



}
