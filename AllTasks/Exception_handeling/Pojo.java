//Q1-Exception Handeling


package Exception_handeling;
import java.util.*;

class Address 
{
	public String state;
	public String city;
	public long pin;
	public Address(String state,String city,long pin)
	{
		this.state=state;
		this.city=city;
		this.pin=pin;
	}
}

class Employee
{
	public String name;
	public long emp_id;
	public Address add;
	public Employee(String name,int emp_id,Address add)
	{
		this.name=name;
		this.emp_id=emp_id;
		this.add=add;
	}
}
class  InvalidEmployeeIdException extends Exception
{
	
public void validate(long id,Employee obj[]) throws InvalidEmployeeIdException
{
	int i=0;
	for(i=0;i<5;i++)
	{
		if(obj[i].emp_id==id)
		{
			System.out.println("Welcome to office");
			break;
		}
	}
	if(i==5)
	{
		throw new InvalidEmployeeIdException();
	}
}

public void Enter_id(Employee obj[])
{
	
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Employee id ");
		Long a=sc.nextLong();
//		InvalidEmployeeIdException e=new InvalidEmployeeIdException();
		validate(a,obj);
	}
	catch(InvalidEmployeeIdException e)
	{
		System.out.println("ID is not found or mismatched");	
	}
	finally
	{
		System.out.println("Thankyou");
	}
}
}
public class Pojo {	

	
	public static void main(String...strings)
	{
		Employee[] obj=new Employee[5];	
		Address add1 = new Address("Odisha","Bhadrak",756120);
		Address add2 = new Address("Odisha","Bhubaneswer",755110);
		Address add3 = new Address("Odisha","cuttack",767220);
		obj[0]=new Employee("John",10010,add1);
		obj[1]=new Employee("Rocky",10013,add1);
		obj[2]=new Employee("Remex",10014,add2);
		obj[3]=new Employee("John",10012,add3);		
		InvalidEmployeeIdException e=new InvalidEmployeeIdException();
		e.Enter_id(obj);
	}	
}