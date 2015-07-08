package Single;

public class GenericDemo3 {
	public static void main(String []args)
	{
//		Tool t=new Tool();
//		t.setWorker(new Worker());
//		Worker w=(Worker)t.getWorker();
		Util<Worker> u=new Util<Worker>();
		u.setObject(new Worker());
		Worker w=u.getObject();
	}
}
