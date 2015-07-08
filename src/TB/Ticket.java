/*
 * 死锁。
 * 同步中嵌套同步
 * */
package TB;

public class Ticket implements Runnable{
    private int tick=1000;
    boolean flag=true;
    Object obj=new Object();
    
	@Override
	public void run() {
		if(flag)
		{
			while(true)
			{
				synchronized(obj)
				{
					show();
				}
			}
			}
		else
			while(true)
				show();
		
	}
  public synchronized void show()
  {
	  synchronized(obj)
		{
			if(tick>0)
			{
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
					
				System.out.println(Thread.currentThread().getName()+"....code:"+tick--);
					
				}
  }
  }
}
