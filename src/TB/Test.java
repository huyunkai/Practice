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
    			 System.out.println("��һ����a:"+i);
    			 
    			 synchronized (MyLock.lockb) 
    			 {
					System.out.println("�ڶ�����b:"+i);
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
    			 System.out.println("��һ����b:"+i);
    		 synchronized(MyLock.locka)
    		 {
    			 System.out.println("�ڶ�����a:"+i);
    		 }
    		 }
    	  }
     }
     }
     }
