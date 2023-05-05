/**
 * 
 */
package javatask;

class Icici implements Interbank
{
	public void bankname()
	{
	System.out.println("ICICI");
	}
	public void bankifsc()
	{
	System.out.println("ICIC0000529");
	}
	public void branchname()
	{
	System.out.println("VIRUDHUNAGAR");
	}
	public void customers()
	{
	System.out.println("50,000");
	}
	public void securitytips()
	{
	System.out.println("Visit bank");
	}
}
class Hdfc extends Icici
{
	public void bankname()
	{
	System.out.println("HDFC");
	}
	public void bankifsc()
	{
	System.out.println("HDFC0001877");
	}
	public void branchname()
	{
	System.out.println("VIRUDHUNAGAR");
	}
	public void customers()
	{
	System.out.println("40,000");
	}
	public void securitytips()
	{
	System.out.println("Visit bank");
	}
}
class Statebank extends Hdfc
{
	public void bankname()
	{
	System.out.println("State bank");
	}
	public void bankifsc()
	{
	System.out.println("SBIN0000951");
	}
	public void branchname()
	{
	System.out.println("VIRUDHUNAGAR");
	}
	public void customers()
	{
	System.out.println("70,000");
	}
	public void securitytips()
	{
	System.out.println("Visit bank");
	}
}
public class Interfacebankclass {

	public static void main(String[] args) {
		Icici ip=new Icici();
		ip.bankname();
		ip.bankifsc();
		ip.branchname();
		ip.customers();
		ip.securitytips();
		System.out.println();
		
	    Hdfc o=new Hdfc();
	    o.bankname();
		o.bankifsc();
		o.branchname();
		o.customers();
		o.securitytips();
		System.out.println();
		
		Statebank i=new Statebank();
		i.bankname();
		i.bankifsc();
		i.branchname();
		i.customers();
		i.securitytips();
		}
}

