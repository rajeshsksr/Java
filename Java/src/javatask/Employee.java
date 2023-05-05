/**
 * 
 */
package javatask;

/**
 * @author rajesh kannan s
 *
 */
public class Employee {
			public void empId()
		{
			System.out.println("2010-042");
		}
		public void empName()
		{
			System.out.println("Kumar");
		}
		public void empDob()
		{
			System.out.println("01-01-1980");
		}
		public void empPhone()
		{
			System.out.println("97860*2***");
		}
		public void empEmail()
		{
			System.out.println("abc@gmail.com");
		}
		public void empAddress()
		{
			System.out.println("8,bazaar road,chennai");
		}

			public static void main(String[] args) {
				Employee i=new Employee();
				i.empId();
				Employee n=new Employee();
				n.empName();
				Employee d=new Employee();
				d.empDob();
				Employee p=new Employee();
				p.empPhone();
				Employee e=new Employee();
				e.empEmail();
				Employee a=new Employee();
				a.empAddress();
	}
}
