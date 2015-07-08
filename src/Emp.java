import java.util.GregorianCalendar;


public class Emp extends Person{
    private double salary;
    private java.util.Date hireDay;
    public Emp(String n,double s ,int year,int month,int day)
    {
    	super(n);
    	salary=s;
    	GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
    	hireDay=calendar.getTime();
    }
    public double getSalary()
    {
    	return salary;
    	
    }
    public java.util.Date getHireDay()
    {
    	return hireDay;
    }
    public String getDescription()
    {
    	return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double percent)
    {
    	double raise=salary*percent/100;
    	salary+=raise;
    }
}

