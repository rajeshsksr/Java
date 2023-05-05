/**
 * 
 */
package javatask;

abstract class college
{
	abstract void departmentname();
	abstract void noofstudents();
	public void collegename()
	{
		System.out.println("KEC");
	}
	public void subjects()
	{
		System.out.println("6");
	}
	public void staffs()
	{
		System.out.println("25");
	}
}
class Department1 extends college
{
	public void departmentname()
	{
	System.out.println("Physics");
	}
	public void noofstudents()
	{
	System.out.println("60");
	}
}
class Department2 extends Department1
{
	public void departmentname()
	{
	System.out.println("Chemistry");
	}
	public void noofstudents()
	{
	System.out.println("40");
	}
			
}

class Abstractioncollege {
	public static void main(String[] args) {
		Department1 d=new Department1();
		d.collegename();
		d.departmentname();
		d.staffs();
		d.noofstudents();
		d.subjects();
	Department2 co=new Department2();
	co.collegename();
	co.departmentname();
	co.staffs();
	co.noofstudents();
	co.subjects();
	}
}


