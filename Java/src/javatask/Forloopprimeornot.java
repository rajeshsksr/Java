/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Forloopprimeornot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=37;int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			System.out.println("It is not a prime number");
			flag=1;
			break;
		}
		}
			if(flag==0)
			{
				System.out.println("It is a prime number");
	}
}
}