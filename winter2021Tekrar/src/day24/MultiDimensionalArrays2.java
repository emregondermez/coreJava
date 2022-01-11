package day24;

public class MultiDimensionalArrays2 {

	public static void main(String[] args) {
		// verilen 2 katli bir array'in tum elemanlarinin toplamini bulalalim
		
		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}};
		
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				toplam+=arr[i][j];
			}
		}System.out.println(toplam);

	}

}
