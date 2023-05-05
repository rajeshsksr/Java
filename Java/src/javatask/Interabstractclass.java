/**
 * 
 */
package javatask;

class vivo3 implements Intermob
{
	public void mobilebrand()
	{
	System.out.println("Vivo");
	}
	public void mobilecamera()
	{
	System.out.println("64MP");
	}
	public void mobileram()
	{
	System.out.println("6GB");
	}
	public void mobileprocessor()
	{
	System.out.println("Quad core");
	}
	public void mobilerom()
	{
	System.out.println("128GB");
	}
}
class Oppo2 extends vivo3
{
	public void mobilebrand()
	{
	System.out.println("Oppo");
	}
	public void mobilecamera()
	{
	System.out.println("56MP");
	}
	public void mobileram()
	{
	System.out.println("4GB");
	}
	public void mobileprocessor()
	{
	System.out.println("Quad core");
	}
	public void mobilerom()
	{
	System.out.println("64GB");
	}
}
class iphone1 extends Oppo2
{
	public void mobilebrand()
	{
	System.out.println("Iphone");
	}
	public void mobilecamera()
	{
	System.out.println("Ioscamera");
	}
	public void mobileram()
	{
	System.out.println("6GB");
	}
	public void mobileprocessor()
	{
	System.out.println("IOS");
	}
	public void mobilerom()
	{
	System.out.println("128GB");
	}
}
public class Interabstractclass {

	public static void main(String[] args) 
		{
			iphone1 ip=new iphone1();
			ip.mobilebrand();
			ip.mobilecamera();
			ip.mobileram();
			ip.mobileprocessor();
			ip.mobilerom();
			System.out.println();
			
		    Oppo2 o=new Oppo2();
			o.mobilebrand();
			o.mobilecamera();
			o.mobileram();
			o.mobileprocessor();
			o.mobilerom();
			System.out.println();
			
			vivo3 i=new vivo3();
			i.mobilebrand();
			i.mobilecamera();
			i.mobileram();
			i.mobileprocessor();
			i.mobilerom();
			}

}
