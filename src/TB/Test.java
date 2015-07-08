package TB;

public class Test {
     private boolean flag;
     Test(boolean flag)
     {
    	 this.flag=flag;
     }
     public void run()
     {

    	 if(flag)
    	 {
    		 synchronized(MyLock.locka)
    		 {
    			 for(int i=0;i<30;i++)
    			 {
    			 System.out.println("第一把锁a:"+i);
    			 
    			 synchronized (MyLock.lockb) 
    			 {
					System.out.println("第二把锁b:"+i);
				}
    			 }
    		 }
    	 }
    	 else
    	  {
    		 synchronized(MyLock.lockb)
    		 {
    			 for(int i=0;i<30;i++)
    		{
    			 System.out.println("第一把锁b:"+i);
    		 synchronized(MyLock.locka)
    		 {
    			 System.out.println("第二把锁a:"+i);
    		 }
    		 }
    	  }
     }
     }
     }
