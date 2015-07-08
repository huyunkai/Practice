
public class PackageTest {
  public static void main(String []args)
  {
	  Pmployee harry=new Pmployee("Harry Hacker",50000, 1989, 10, 1);
	  harry.raiseSalary(20);
	  System.out.println("name="+harry.getName()+",salary="+harry.getSalary());
  }
}
