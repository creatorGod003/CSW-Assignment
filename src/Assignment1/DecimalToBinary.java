package Assignment1;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String binary = "";
		
		if(n==0) 
			binary = "0";
		else
			binary = toBinary(n);
		
		System.out.println(binary);
		
		sc.close();
	}
	
	public static String toBinary(int n) {
		
		if(n==0) {
			return "";
		}
		
		return  toBinary(n/2) + (n%2);
		
	}

}
