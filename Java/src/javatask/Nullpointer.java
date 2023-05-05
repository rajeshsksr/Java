/**
 * 
 */
package javatask;

public class Nullpointer {

	public static void main(String[] args) {
		String name=null;
		try
		{
		System.out.println(name.length());
		}
		catch(NullPointerException obj)
		{
		System.out.println("Exception caught");
		}
		finally
		{
			System.out.println("Null pointer exception occurred.");
		}
		
	}

}
