package Buffer;

public class PersonDemo {
	public static void main(String []args)
	{
		Person p=new Person();
		
		//p.chifan();
		SuperPerson sp=new SuperPerson(p);
		sp.superChifan();
	}
}
