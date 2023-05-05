/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
class Travel
{
	public void train()
	{
		System.out.println("Vande Bharat");
	}
	public void bus()
	{
		System.out.println("Ashok Leyland");
	}
	public void car()
	{
		System.out.println("Mahindra");
	}
	public void flight()
	{
		System.out.println("Indigo");
	}
}
class Delhi extends Travel
{
	public void flight()
	{
	System.out.println("Akasa Air");
	}
}
class Vishakapatnam extends Delhi 
{
	public void car()
	{
		System.out.println("Tata");
	}
}
public class Polymorphismor2 {

	public static void main(String[] args) {
	Vishakapatnam t=new Vishakapatnam();
	t.car();
	t.flight();
	t.bus();
	t.train();

	}

}
