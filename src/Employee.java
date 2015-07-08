import java.util.GregorianCalendar;


public class Employee {
	 private String name;
	  private double salary;
	  private java.util.Date hireday;
	  public Employee(String n,double s,int year,int month,int day)
	  {
		  name=n;
		  salary=s;
		  GregorianCalendar cd=new GregorianCalendar(year,month-1,day);
		  hireday=cd.getTime();
		  
	  }
	  
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public java.util.Date getHireday() {
		return hireday;
	}

	public void setHireday(java.util.Date hireday) {
		this.hireday = hireday;
	}

	public void raiseSalary(double byPercent)
   {
   	double raise=salary*byPercent /100;
   	salary+=raise;
   	
   }
}
