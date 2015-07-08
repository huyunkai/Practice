package TB;

public class stopThread implements Runnable
{
	private boolean flag=true;
public void run()
{
	while(flag)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName()+"... run");
	}
	}
public void changeFlag()
{
      flag=false;	
}
}
