package Assignment1;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Reverse of number "+n+" is "+reverse(n)); 
		
		sc.close();
	}
	
	public static int reverse(int n) {
		
		int rev = 0;
		
		while(n!=0) {
			rev = (rev*10)+(n%10);
			n/=10;
		}
		
		return rev;
	}
	
}
