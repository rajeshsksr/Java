/**
 * 
 */
package javatask;

abstract class Mobile
{
	abstract void mobilebrand();
	public void mobilecamera()
	{
		System.out.println("64MP");
	}
	abstract void mobileram();
}
class Vivo extends Mobile1
{
	void mobilebrand()
	{
	System.out.println("Vivo Camera Phone");
	}
	void vivoprocessor()
	{
	System.out.println("Octa Core");
	}
	@Override
	void mobileram() {
		// TODO Auto-generated method stub
		
	}
}
class Iphone extends Vivo
{
	public void mobilebrand()
	{
	System.out.println("Apple");
	}
	public void mobileram()
	{
	System.out.println("8GB");
	}
	
}
public class Abstractionmobile {

	public static void main(String[] args) {
	Iphone b=new Iphone();
	b.mobilebrand();
	b.mobileram();
	
	System.out.println();
	Vivo b1=new Vivo();
	b1.mobilebrand();
	b1.vivoprocessor();
	
	}

}

