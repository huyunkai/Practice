package TB;

public class Input implements Runnable
{
     private Resource rs;
     Input(Resource rs)
     {
    	 this.rs=rs;
     }
     
	@Override
	public void run() {
		int x=0;
		while(true)
		{
			if(x==0)
			rs.set("mike", "male");
			else
			rs.set("����", "ŮŮŮŮ");
			x=(x+1)%2;
		}
	}

}
