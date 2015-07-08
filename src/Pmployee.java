import java.util.GregorianCalendar;


public class Pmployee {
  private String name;
  private double salary;
  private java.util.Date hireDay;
  public Pmployee(String n,double s,int year,int month,int day)
  {
	  name=n;
	  salary=s;
	  GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
	  hireDay=calendar.getTime();
	  }
  public String getName()
  {
	  return name;
	  
  }
  public Double getSalary()
  {
	  return salary;
	  
  }
public java.util.Date getHireDay() {
	return hireDay;
}
public void raiseSalary(double percent)
{
	double raise=salary *percent/100;
	salary +=raise;
	}
  
} 
