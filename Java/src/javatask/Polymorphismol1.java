/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Polymorphismol1 {
public void phoneinfo(int c)
{
	c=6;
	System.out.println(c);
}
public void phoneinfo(String b)
{
	b="Quad Core";
	System.out.println(b);
}
public void phoneinfo(double a)
{
	a=11.2;
	System.out.println(a);
}
	public static void main(String[] args) {
	Polymorphismol1 p=new Polymorphismol1();
	p.phoneinfo(6);
	p.phoneinfo("Quad Core");
	p.phoneinfo(11.2);

	}

}
