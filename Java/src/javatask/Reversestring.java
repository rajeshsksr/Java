/**
 * 
 */
package javatask;

public class Reversestring {

	public static void main(String[] args) {
	String Stringinput="Ram Kumar";
	char[]resultarray=Stringinput.toCharArray();	
for(int i=resultarray.length-1;i>=0;i--)
{
	System.out.print(resultarray[i]);
}
	}

}
