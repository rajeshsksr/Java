/**
 * 
 */
package javatask;


abstract class bank
{
	abstract void customerdetails();
	public void accounttype()
	{
		System.out.println("Savings");
	}
	
}
class bank1 extends bank
{
	void customerdetails()
	{
	System.out.println("Mr.Kumar");
	}
	void accountno()
	{
	System.out.println("123456789");
	}
}
class bank2 extends bank1
{
	public void customerdetails2()
	{
	System.out.println("Mr.Raghu");
	}
	public void netbanking()
	{
	System.out.println("Yes,provide netbanking");
	}
	
}
public class Abstractionbank {

	public static void main(String[] args) {
	bank2 b=new bank2();
	b.customerdetails2();
	b.accounttype();
	b.netbanking();
	System.out.println();
	bank1 b1=new bank1();
	b1.customerdetails();
	b1.accounttype();
	b1.accountno();
	
	}

}

