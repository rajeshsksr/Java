/**
 * 
 */
package javatask;

class India implements Interfacecountries
{
	public void countryname()
	{
	System.out.println("India");
	}
	public void noofstates()
	{
	System.out.println("28");
	}
	public void president()
	{
	System.out.println("Hon.Droupadi Murmu");
	}
	public void primeminister()
	{
	System.out.println("Hon.Narendra Modi");
	}
	public void population()
	{
	System.out.println("130,00,00,000");
	}
}
class Usa extends India
{
	public void countryname()
	{
	System.out.println("United States");
	}
	public void nofstates()
	{
	System.out.println("50");
	}
	public void president()
	{
	System.out.println("Hon.Joe Biden");
	}
	public void primeminister()
	{
	System.out.println("Presidential form of Government");
	}
	public void population()
	{
	System.out.println("33,19,00,000");
	}
}
class Australia extends Usa
{
	public void countryname()
	{
	System.out.println("Australia");
	}
	public void nofstates()
	{
	System.out.println("6");
	}
	public void president()
	{
	System.out.println("King of Australia");
	}
	public void primeminister()
	{
	System.out.println("Hon.Anthony Albanese");
	}
	public void population()
	{
	System.out.println("2,51,00,000");
	}
}
public class Intercountryclass {

	public static void main(String[] args) {
		India ip=new India();
		ip.countryname();
		ip.noofstates();
		ip.president();
		ip.primeminister();
		ip.population();
		System.out.println();
		
	    Usa o=new Usa();
	    o.countryname();
		o.noofstates();
		o.president();
		o.primeminister();
		o.population();
		System.out.println();
		
		Australia i=new Australia();
		i.countryname();
		i.noofstates();
		i.president();
		i.primeminister();
		i.population();

	}

}
