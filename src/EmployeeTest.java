import java.util.GregorianCalendar;


public class EmployeeTest {
  public static void main(String []args)
  {
	 
	  Employee []staff=new Employee[3];
	  staff[0]=new Employee("Cral Cracker", 75000, 1982, 12, 13);
	  staff[1]=new Employee("Harry Hacker", 50000, 1989, 11, 1);
	  staff[2]=new Employee("tony test", 40000, 1989, 3, 15);
	  for(Employee e:staff)
	  {
		  e.raiseSalary(5);
		  System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireday());
  }    
	  }  
  
}
