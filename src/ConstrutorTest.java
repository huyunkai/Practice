
public class ConstrutorTest {
  public static void main(String []args)
  {
	  Employe[] staff=new Employe[3];
	  staff[0]=new Employe("Harry", 40000);
	  staff[1]=new Employe(60000);
	  staff[2]=new Employe();
	  for(Employe e:staff)
	  {
		  System.out.println("name="+e.getName()+",id="+e.getId()+","
		  		+ "salary="+e.getSalary());
	  }
  }
}
