/**
 * 
 */
package javatask;
import javatask.Department;
import javatask.Inheritancecollege1;
import javatask.Inheritancehostel;
public class Inheritancestudent {

	public void Studentname()
	{
		System.out.println("Kumar");
	}
	public void Studentdept()
	{
		System.out.println("Mechanical Engineering");
	}
	public void Studentid()
	{
		System.out.println("MER142");
	}

	public static void main(String[] args) {
		Inheritancecollege1 c=new Inheritancecollege1();
		c.Collegename();
		c.Collegecode();
		c.Collegerank();
		
		Department dp=new Department();
		dp.departmentName();
		
		Inheritancestudent stu=new Inheritancestudent();
		stu.Studentname();
		stu.Studentdept();
		stu.Studentid();
				
		Inheritancehostel i=new Inheritancehostel();
		i.hostelname();
		
	}

}
