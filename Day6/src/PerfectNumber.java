import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,i;
		/*
		 * Taking input number from user
		 */
		System.out.println("Enter any number ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for (i=1; i<n; i++) {
			
			if (n%i==0) {
				sum=sum+i;
			}
			
				
		}
			if(sum==n) {
				System.out.println("This is a perfect number");
			}
			else {
				System.out.println("This is not a perfect number");
			}
			
				
	}

}
