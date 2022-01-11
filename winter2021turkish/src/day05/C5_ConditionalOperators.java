package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		// AND &&, OR ||
		
		
		// AND && operatoru mukemmiliyetcidir. herhangi biri false ise sonuc false olur.
		boolean isTrue= 5>4 && 7-3>0 ;
		System.out.println(isTrue);

		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && y*x>20 && x-y>0);
		
		//OR || operatoru ise optimisttir. verilen karsilastirmalardan bir tanesi bile dogru ise sonuc true olur.
		
	System.out.println(x<y || x+y<0 || x*y>0); //true

	
	
	
	}
	
	

}
