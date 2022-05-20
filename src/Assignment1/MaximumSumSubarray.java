package Assignment1;

public class MaximumSumSubarray {
	public static void main(String[] args) {
		
		int[] arr = {1,-1,2,3,5};
		
		System.out.println(maxSum(arr));
		
	}
	
	public static int maxSum(int[] arr) {
		
		int overallBest = arr[0];
		int currBest = arr[0];
		
		int i = 1;
		
		while(i<arr.length) {
			
			if(arr[i]>arr[i] + currBest) {
				currBest = arr[i];
			}
			else {
				currBest = arr[i]+currBest;
			}
			
			if(overallBest<currBest) {
				overallBest = currBest;
			}
		
			i++;
		}
		
		return overallBest;
				
		
	}
	
}
