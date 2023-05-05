/**
 * 
 */
package javatask;

import java.util.Scanner;

public class Scannertransport {
	public String bus()
	{
		String bus ="0";
		return bus;
	}
	public String car()
	{
		String car="0";
		return car;
	}
	public String train()
	{
		String train="0";
		return train;
	}
	public String ship()
	{
		String ship="0";
		return ship;
	}
	public String flight()
	{
		String flight="0";
		return flight;
	}
	
		public static void main(String[] args) {
		
			new Scannertransport();
			Scanner t=new Scanner(System.in);
			System.out.print("Bus=");
			t.next();
				
			System.out.print("Car=");
			t.next();
			
			System.out.print("Train=");
			t.next();
			
			System.out.print("Ship=");
			t.next();
			
			System.out.print("Flight=");
			t.next();
				
	}

}
