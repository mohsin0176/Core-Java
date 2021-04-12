import java.io.*;
package package2;
public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee empone=new Employee("James Smith");
		Employee emptwo=new Employee("James Edward");
		empone.empAge(20);
		empone.empDesignation("Sr. Developer");
		empone.empSalary(2000);
		empone.printEmployee();
		emptwo.empAge(30);
		emptwo.empDesignation("Jr. Developer");
		emptwo.empSalary(3000);
		emptwo.printEmployee();

	}
}