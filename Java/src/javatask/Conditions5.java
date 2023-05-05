/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Conditions5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=40;int b=50;int c=30;int d=20;
		if (a>b&&a>c&&a>d)
		{
			System.out.println("a is greatest");
		}
		else if(b>a&&b>c&&b>d)
		{
			System.out.println("b is greatest");
		}
		else if(c>a&&c>b&&c>d)
		{
			System.out.println("c is greatest");
		}
		else
		{
			System.out.println("d is greatest");
		}
	}

}
