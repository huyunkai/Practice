package TB;

public class Res {
  private String name;
  private int count=1;
  private boolean flag=false;
  public synchronized void set(String name)
  {
	  while(flag)
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  this.name=name +"--"+count++;
	  System.out.println(Thread.currentThread().getName()+"...������"+this.name);
      flag=true;
      this.notifyAll();
  }
  public synchronized void out()
  {
	   while(!flag)
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println(Thread.currentThread().getName()+"...������"+this.name);
      flag=false;
      this.notifyAll();
  }
  
}
