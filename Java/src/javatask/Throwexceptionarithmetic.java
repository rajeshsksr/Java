/**
 * 
 */
package javatask;

public class Throwexceptionarithmetic {

	public static void main(String[] args) 
    {
	Throwexceptionarithmetic t=new Throwexceptionarithmetic();
	t.age(17);
	}
	public void age(int a)
	{
	if(a<18)
	{
		throw new ArithmeticException("Not eligible to vote");
	}
	else
	{
	System.out.println("Eligible to vote");	
	}
}
}