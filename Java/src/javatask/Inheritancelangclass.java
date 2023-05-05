/**
 * 
 */
package javatask;
import hello.Inheritancetamil;
import array.Inheritanceenglishclass;
import hello.Inheritancetelugu;

public class Inheritancelangclass
{
	public void alllanguage()
	{
		System.out.println("All laguage");
	}

public static void main(String[]args)
{
	Inheritancelangclass lc=new Inheritancelangclass();
	lc.alllanguage();
	
	Inheritancetamil t=new Inheritancetamil();
	t.tamillanguage();
	
	Inheritanceenglishclass e=new Inheritanceenglishclass();
	e.Englishlanguage();
	
	Inheritancetelugu te=new Inheritancetelugu();
	te.telugulanguage();
}
}
