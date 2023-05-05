/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
class Computer
{
	public void computermodel()
	{
		System.out.println("E series");
	}
}
class Laptop extends Computer
{
	public void laptopmodel()
	{
		System.out.println("Zenbook");
	}
}
public class Inheritancesingle {

	public static void main(String[] args) {
	Laptop i=new Laptop();
	i.laptopmodel();
	i.computermodel();
	}

}
