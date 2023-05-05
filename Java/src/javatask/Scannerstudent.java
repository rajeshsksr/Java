/**
 * 
 */
package javatask;

import java.util.Scanner;

public class Scannerstudent {
	public int stuid()
	{
		int id=0;
		return id;
	}
	public String stuname()
	{
		String name="0";
		return name;
	}
	public int stuclass()
	{
		int std=0;
		return std;
	}
	public String stuemail()
	{
		String email="0";
		return email;
	}
	public int stuphoneno()
	{
		int phno=0;
		return phno;
	}
	public String stuaddress()
	{
		String address="0";
		return address;
	}
	public String stugender()
	{
		String gender="0";
		return gender;
	}
	
		public static void main(String[] args) {
		
			new Scannerstudent();
			Scanner sc=new Scanner(System.in);
			System.out.println("id=");
			sc.nextInt();
				
			System.out.println("name=");
			sc.next();
			
			System.out.println("std=");
			sc.next();
			 
			System.out.println("email=");
			sc.next();
			 
			System.out.println("address=");
			sc.next();
			
			System.out.println("gender=");
			sc.next();
			
	}

}
