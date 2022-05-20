package Assignment2;
import java.util.*;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Binary representation of "+n +" is "+intToBinary(n));
		
	}
	
	public static String intToBinary(int n) {
		
		if(n==0) {
			return "0";
		}
		
		Stack<Integer> stack = new Stack<>();
		
		while(n!=0){
			stack.push(n%2);
			n = n/2;
		}
		
		String ans = "";
		
		while(!stack.isEmpty()) {
			ans+=stack.pop();
		}
		
		return ans;
	}
	
}
