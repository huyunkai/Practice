package package2;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
   private String name;
   private double salary;
   private java.util.Date hireDay;
   public Employee(String n,double s,int year,int month,int day)
   {
	   name=n;
	   salary=s;
	   GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);
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
   public java.util.Date getHireDay()
   {
	   return hireDay;
   }
   public void raiseSalary(double percent)
   {
	   double raise=salary*percent/100;
	   salary+=raise;
   }
   public boolean equals(Object otherObject)
   {
	   if(this==otherObject) return true;
	   if(otherObject==null) return false;
	   //if the class don't match ,they can not equal
	   if(getClass()!=otherObject.getClass()) return false;
	   Employee other=(Employee) otherObject;
	   return Objects.equals(name, other.name)&&salary==other.salary&&Objects.equals(hireDay,other.hireDay);
	   
   }
   public int hashCode()
   {
	   return Objects.hash(name,salary,hireDay);
   }
   public String toString()
   {
	   return getClass().getName()+"[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
   }
}

