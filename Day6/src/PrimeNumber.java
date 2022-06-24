import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Taking number from user input
 */
		int n,i,count=0;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for (i=1; i<=n; i++) {
			
			if ( n%i==0) {
				
				count++;
			}
		}
			if(count==2) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not a prime number ");
			} 
				
		
		
	}

}
