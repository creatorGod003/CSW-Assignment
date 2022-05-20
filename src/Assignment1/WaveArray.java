package Assignment1;

import java.util.Arrays;

public class WaveArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		waveArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void waveArray(int[] arr) {
		
int c = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			
		if(c==0) {
			if(arr[i]<arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		else {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		if(c==0) {
			c= 1;
		}
		else {
			c = 0;
		}
		
	}
		
	}
	
}
