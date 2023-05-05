/**
 * 
 */
package javatask;
import java.util.Scanner;
public class Scannermarks {
	public int eng()
	{
		int E=0;
		return E;
	}
	public int tamil()
	{
		int T=0;
		return T;
	}
	public int maths()
	{
		int M=0;
		return M;
	}
	public int e()
	{
		int e=0;
		return e;
	}
	public int hindi()
	{
		int H=0;
		return H;
	}
	
		public static void main(String[] args) {
		
		new Scanneremp();
		Scanner sc=new Scanner(System.in);
		System.out.print("E=");
		int M1=sc.nextInt();
			
		System.out.print("T=");
		int M2=sc.nextInt();
		 
		System.out.print("M=");
		int M3=sc.nextInt();
		 
		System.out.print("evs=");
		int M4=sc.nextInt();
		
		System.out.print("H=");
		int M5=sc.nextInt();
		
		System.out.println("Total=" +(M1+M2+M3+M4+M5));
				
		System.out.println("Average=" +(M1+M2+M3+M4+M5)/5);
		
		
	}
}
