/**
 * 
 */
package javatask;

public class Throwexceptionnull {

	public static void main(String[] args) 
	{
		Throwexceptionnull s=new Throwexceptionnull();
		s.name(null);
		
	}
public void name(String n) {
	if(n.length())
	{
		throw new NullPointerException("No Input");
	}
	else
	{
		System.out.println("No exception");
	}
}
}
