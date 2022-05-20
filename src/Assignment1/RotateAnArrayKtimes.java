package Assignment1;
import java.util.Arrays;


public class RotateAnArrayKtimes {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		rotateKTimes(arr, 2);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateKTimes(int[] arr, int k) {
		
		if(k%arr.length==0) {
			return ;
		}
		else{
			
			k =  k%arr.length;
			
			for(int i=1;i<=k;i++) {
				
				int x = arr[arr.length-1];
				
				int j=arr.length-1;
				for(;j>0;j--) {
					arr[j] = arr[j-1];
				}
				
				arr[j] = x;
				
			}
			
		}
		
		
	}
}
