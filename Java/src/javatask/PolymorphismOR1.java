/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
class bankinfo
{
	public void saving()
	{
		System.out.println("Rs.50k");
	}
	public void fixed()
	{
		System.out.println("5L");
	}
	public void deposit()
	{
		System.out.println("10L");
	}
}
class canarabank extends bankinfo
{
	public void deposit()
	{
	System.out.println("7L");
	}
}
class statebank extends canarabank
{
	public void saving()
	{
		System.out.println("Rs.70k");
	}
}
public class PolymorphismOR1 {

	public static void main(String[] args) {
	statebank s=new statebank();
	s.saving();
	s.deposit();
	s.fixed();
	}
}
