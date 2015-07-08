/*
 * 线程间通讯：
 * 其实就是多个线程在操作同一个资源，
 * 但是操作的动作不同
 * */

package TB;

public class Resource 
{
 
	private String name;
    private String sex;
    private boolean flag=false;
	public synchronized void set(String name,String sex)
	{
		if(flag)
			try {
				this.wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out()
	{
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(name+"........"+sex);
		flag=false;
		this.notify();
	}
}
