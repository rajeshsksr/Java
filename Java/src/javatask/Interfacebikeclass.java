/**
 * 
 */
package javatask;

class Passion implements Interfacebike
{
	public void bikename()
	{
	System.out.println("Passion");
	}
	public void bikemodel()
	{
	System.out.println("Passion Pro i3S");
	}
	public void milage()
	{
	System.out.println("55 kmpl");
	}
	public void bikerate()
	{
	System.out.println("Rs.77,000");
	}
	public void warranty()
	{
	System.out.println("5 years");
	}
}
class Bullet extends Passion 
{
	public void bikename()
	{
	System.out.println("Royal Enfield");
	}
	public void bikemodel()
	{
	System.out.println("Himalayan");
	}
	public void milage()
	{
	System.out.println("40 kmpl");
	}
	public void bikerate()
	{
	System.out.println("Rs.1,70,000");
	}
	public void warranty()
	{
	System.out.println("4 years");
	}
}
class Jaawa extends Bullet
{
	public void bikename()
	{
	System.out.println("Jawa");
	}
	public void bikemodel()
	{
	System.out.println("Perak");
	}
	public void milage()
	{
	System.out.println("30 kmpl");
	}
	public void bikerate()
	{
	System.out.println("Rs.2,00,000");
	}
	public void warranty()
	{
	System.out.println("2 years");
	}
}
public class Interfacebikeclass {

public static void main(String[] args) 
		{
			Jaawa ip=new Jaawa();
			ip.bikename();
			ip.bikemodel();
			ip.milage();
			ip.bikerate();
			ip.warranty();
			System.out.println();
			
		    Passion o=new Passion();
			o.bikename();
			o.bikemodel();
			o.milage();
			o.bikerate();
			o.warranty();
			System.out.println();
			
			Bullet i=new Bullet();
			i.bikename();
			i.bikemodel();
			i.milage();
			i.bikerate();
			i.warranty();
			}
	}


