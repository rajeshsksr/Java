/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Forloopsfibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N1=1;int N2=2;int N3=0;int C=10;
		System.out.println(N1);
		System.out.println(N2);
		for(int i=2;i<C;i++)
		{
			N3=N1+N2;
			System.out.print(" "+N3);
			N1=N2;
			N2=N3;
		}
	}

}
