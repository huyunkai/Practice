package TB;

public class ThisLockDemo {
    public static void main(String []args)
    {
    	Ticket t=new Ticket();
    	Thread t1=new Thread(t);
    	Thread t2=new Thread(t);
    	t1.start();
    	try
    	{
    		Thread.sleep(10);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	t.flag=false;
    	t2.start();
    }
}
