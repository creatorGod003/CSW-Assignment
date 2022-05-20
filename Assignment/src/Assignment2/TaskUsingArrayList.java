package Assignment2;

import java.util.*;

public class TaskUsingArrayList {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		// Task1
		System.out.println(arr);
		// Task2
		System.out.println("Enter number");
		int n = sc.nextInt();
		String status = "present";
		
		if(!arr.contains(n)) {
			status = "not present";
		}
		
		System.out.println(n+" is "+status);
		
		// Task3
		int ind = sc.nextInt();
		System.out.println("Enter the index");
		arr.remove(ind);
		
		// Task4
		boolean isEmpty = arr.isEmpty();
		if(isEmpty) {
			System.out.println("ArrayList is not empty");
		}
		
	}
	
}
