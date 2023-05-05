/**
 * 
 */
package javatask;
import java.util.Arrays;
public class Arrequal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,3,2,4};
	boolean result=Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Two  arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}
		
	}

}
