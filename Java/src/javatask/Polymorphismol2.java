/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Polymorphismol2 {
	public void winnames(int c)
	{
		c=10;
		System.out.println(c);
	}
	public void winnames(String b)
	{
		b="Windows XP";
		System.out.println(b);
	}
	public void winnames(double a)
	{
		a=2.0;
		System.out.println(a);
	}
		public static void main(String[] args) {
		Polymorphismol2 p=new Polymorphismol2();
		p.winnames(10);
		p.winnames("Windows XP");
		p.winnames(2.0);
	}

}
