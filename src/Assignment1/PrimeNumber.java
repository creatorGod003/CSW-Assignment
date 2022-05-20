package Assignment1;
import java.util.*;


public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean prime = isPrime(n);
		
		String ans = "Prime";
		
		if(!prime) {
			ans = "Not "+ans;
		}
		
		System.out.println("Number "+n+ " is "+ans);
	
		sc.close();
	}
	
	public static boolean isPrime(int n){
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
}
