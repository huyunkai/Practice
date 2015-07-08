
public class Employ {
 private String name;
 private double salary;
 public Employ(String n,double s)
 {
	 name=n;
	 salary=s;
	 
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
 public void raiseSalary(double bypercent)
 {
	 double raise=salary *bypercent/100;
	 salary+=raise;
 }
}
