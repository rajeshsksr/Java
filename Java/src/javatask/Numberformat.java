/**
 * 
 */
package javatask;

public class Numberformat {

	public static void main(String[] args) {
		String s="hello";
		try
		{
		int a=Integer.valueOf(s);
		System.out.println(a);
		}
		catch(NumberFormatException ex)
		{
		System.out.println("Data type conversion.");
		}
		finally
		{
			System.out.println("Number format exception occurred.");
		}
	}

}
