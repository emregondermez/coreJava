package ManavProje;



public class Urunler {
	String urun;
	double fiyat;
	
	
	Urunler(){
		
	}
	
	Urunler(String urun,double fiyat){
		this.fiyat=fiyat;
		this.urun=urun;
		
	}
	
	@Override
	public String toString() {
		return  urun + "     \t    " + fiyat +"TL\n";
	}


	
	
}
