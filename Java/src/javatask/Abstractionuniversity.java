/**
 * 
 */
package javatask;

abstract class university
{
	abstract void students();
	public void studentdetails()
	{
		System.out.println("Collect student details");
	}
	
}
class college1 extends university
{
	void students()
	{
	System.out.println("No of students:50");
	}
	void studentid()
	{
	System.out.println("Univ-****");
	}
}
class college2 extends college1
{
	public void students()
	{
	System.out.println("55");
	}
	public void studentmarks()
	{
	System.out.println("Semester 1 marks:");
	}
	
}
public class Abstractionuniversity {

	public static void main(String[] args) {
	college1 b=new college1();
	b.studentdetails();
	b.students();
	b.studentid();
	System.out.println();
	college2 b1=new college2();
	b1.studentdetails();
	b1.students();
	b1.studentmarks();
	
	}

}
