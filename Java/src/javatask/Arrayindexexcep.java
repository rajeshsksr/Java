/**
 * 
 */
package javatask;

public class Arrayindexexcep {

	public static void main(String[] args) {
		int a[]=new int[2];
		a[0]=100;
		a[1]=200;
		try 
		{
		a[2]=300;
		System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
		System.out.println("Array exceeding index value.");
		}
		finally
		{
			System.out.println("Array index out of bound exception occurred.");
		}

	}

}
