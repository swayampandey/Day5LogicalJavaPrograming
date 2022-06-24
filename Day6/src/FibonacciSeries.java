
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1, n3,i,count = 10;
		/*
		 * printing 0 and 1
		 */
		System.out.println(n1+"  ");
		System.out.println(n2+"");
		
		/*
		 * starting loop from 2 as 0 and 1 is already printed
		 */
		
		for(i=2; i<count; i++) {
			
			n3=n1+n2;
			
			System.out.println(""+n3);
			n1=n2; n2=n3;
		}
			

	}

}
