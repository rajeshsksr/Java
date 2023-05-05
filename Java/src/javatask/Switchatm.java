/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Switchatm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=1;
		switch (x)
		{
		case 1:
			System.out.println("Cash withdrawal");
			break;
		case 2:
			System.out.println("Balance enquiry");
			break;
		case 3:
			System.out.println("Fast cash");
			break;
		case 4:
			System.out.println("Pin change");
			break;
		case 5:
			System.out.println("Account statement");
			break;
		default:
			System.out.println("Cancel");
			break;
			

	}
	}
}
