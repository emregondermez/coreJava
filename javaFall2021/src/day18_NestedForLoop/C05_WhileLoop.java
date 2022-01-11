package day18_NestedForLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		//3 basamakli sayilardan 15,20 ve 90 in kati olanlari yazdirin
		
		int flag=0;
		for (int i = 100; i <= 999; i++) {
			
			if (i%15==0  && i%20==0 && i%90==0) {
				System.out.print(i+" ");
				flag++;
			} 
			
		}System.out.println();
		System.out.println("uc basamakli 15,20 ve 90'a bolunebilen "+flag+" adet sayi vardir");

	
		int i=100;
		int flag2=0;
		while(i<=999) {
			if (i%15==0  && i%20==0 && i%90==0) {
				System.out.print(i+" ");
				flag2++;
			}
		i++;
		
		}System.out.println();
		System.out.println("uc basamakli 15,20 ve 90'a bolunebilen "+flag2+" adet sayi vardir");
	
	
	
	}

}
