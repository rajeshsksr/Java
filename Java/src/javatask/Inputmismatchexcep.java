/**
 * 
 */
package javatask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Scanner;
public class Inputmismatchexcep {

	public static void main(String[] args) {
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		try
		{
			a=obj.nextInt();
			b=obj.nextInt();
			c=a+b;
			System.out.println(c);
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Incorrect data entered");
		}
		finally
		{
			System.out.println("Input mismatch exception occurred");
		}
		StringBuilder sbu=new StringBuilder();
	TreeMap ar=new TreeMap();

	}

}
