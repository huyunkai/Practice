package Buffer;

public class SuperPerson {
	private Person p;
	SuperPerson(Person p)
	{
		this.p=p;
	}
	public void superChifan()
	{
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
		System.out.println("������");

	}
}
