/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Switchopp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c,x;
		a=50;b=20;
		x=3;
		switch (x)
		{
		case 1:c=a+b;
		System.out.println(c);
		break;
		case 2:c=a-b;
		System.out.println(c);
		break;
		case 3:c=a*b;
		System.out.println(c);
		break;
		case 4:c=a/b;
		System.out.println(c);
		break;
		default:
			System.out.println("Invalid case");
			break;
		
		}

	}

}
