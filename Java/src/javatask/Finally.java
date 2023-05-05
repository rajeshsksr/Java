/**
 * 
 */
package javatask;

public class Finally {

	public static void main(String[] args) {
		String s="Greens";
		try
		{
			System.out.println(s.charAt(7));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("Finally block executed");
		}

	}

}
