/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Student {
public void stuId()
{
	System.out.println("10th-042");
}
public void stuName()
{
	System.out.println("Kumar");
}
public void stuDob()
{
	System.out.println("01-01-2000");
}
public void stuPhone()
{
	System.out.println("97860*2***");
}
public void stuEmail()
{
	System.out.println("abc@gmail.com");
}
public void stuAddress()
{
	System.out.println("8,bazaar road,chennai");
}

	public static void main(String[] args) {
		Student i=new Student();
		i.stuId();
		Student n=new Student();
		n.stuName();
		Student d=new Student();
		d.stuDob();
		Student p=new Student();
		p.stuPhone();
		Student e=new Student();
		e.stuEmail();
		Student a=new Student();
		a.stuAddress();

	}

}
