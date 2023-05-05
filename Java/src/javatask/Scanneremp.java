/**
 * 
 */
package javatask;
import java.util.Scanner;
public class Scanneremp {
public int empid()
{
	int id=0;
	return id;
}
public String empname()
{
	String name="0";
	return name;
}
public String empemail()
{
	String email="0";
	return email;
}
public int empphoneno()
{
	int phno=0;
	return phno;
}
public int empsalary()
{
	int salary=0;
	return salary;
}
public String empgender()
{
	String gender="0";
	return gender;
}
public String empcity()
{
	String city="0";
	return city;
}
	public static void main(String[] args) {
	
		new Scanneremp();
		Scanner sc=new Scanner(System.in);
		System.out.println("id=");
		sc.nextInt();
			
		System.out.println("name=");
		sc.next();
		 
		System.out.println("email=");
		sc.next();
		 
		System.out.println("salary=");
		sc.nextInt();
		
		System.out.println("gender=");
		sc.next();
		
		System.out.println("city=");
		sc.next();
		
	}

}
