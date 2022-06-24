import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev;
		/*
		 * Taking user input
		 */
		System.out.print("Enter a Number");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		
		while (n>0) {
			rev=n%10;
			
			System.out.print(rev);
			n=n/10;
			
			
		}

	}

}
