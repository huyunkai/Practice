import java.util.Random;


public class Employe {
   private static int  nextId;
   private int id;
   private String name="";
   private double salary;
   static 
   {
	   Random generator =new Random();
	   nextId=generator.nextInt(10000);
	   
   }
   {
	   id=nextId;
	   nextId++;
	   
   }
   public Employe(String n,double s)
   {
	   name =n;
	   salary=s;
   }
   public Employe(double s)
   {
	   this("Employe #"+nextId,s);
   }
   public Employe()
   {
	   
   }
public int getId() {
	return id;
}

public String getName() {
	return name;
}

public double getSalary() {
	return salary;
}

}
