package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,4,5};
		
		try {
		System.out.println(arr[9]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("ne olursa olsun  bu satir yazilsin");
		}
		
		
		
		}

}
