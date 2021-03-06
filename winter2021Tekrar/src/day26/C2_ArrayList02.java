package day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C2_ArrayList02 {

	public static void main(String[] args) {
		//Ask to user enter a letter
		// if the letter exists in the list convert it to "Got it"
		//otherwise add the element which user entered into the list
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a upper case letter");
		String letter = scan.next().toUpperCase().substring(0,1);	
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		
		if (list1.contains(letter)) {
			list1.set(list1.indexOf(letter), "Got it");
		} else {
			list1.add(letter);
		}
		
		System.out.println(list1);

		scan.close();
	}

}
