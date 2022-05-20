package Assignment1;

public class BinarySearch {
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,8,9,11, 23};
		int key = 3;
		int ind = binarySearch(arr, key, 0, arr.length-1);
		
		System.out.println(ind);
		
	}
	
	public static int binarySearch(int[] arr, int key, int i, int j) {
		
		if(i>j) {
			return -1;
		}
		
		int m = i+(j-i)/2;
		
		if(arr[m]==key) {
			return m;
		}
		else if(arr[m]>key) {
			return binarySearch(arr, key, i, m-1);
		}
		else {
			return binarySearch(arr, key, m+1, j);
		}
	}
	
}
