public class StaticTest {
   public static void main(String []args)
   {
	   Employyee []staff=new Employyee[3];
	   staff [0]=new Employyee("Tom", 40000);
	   staff [1]=new Employyee("Dick", 60000);
	   staff [2]=new Employyee("Harry", 65000);
	   for(Employyee e:staff)
	   {
		   e.setId();
		   System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
  		   
	   }
   }
}
