package Buffer;

public class SuperPerson {
	private Person p;
	SuperPerson(Person p)
	{
		this.p=p;
	}
	public void superChifan()
	{
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
		System.out.println("来根烟");

	}
}
