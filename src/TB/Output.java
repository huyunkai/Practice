package TB;

public class Output implements Runnable
{
	private Resource rs;
	Output(Resource rs)
	{
		this.rs=rs;
	}
	@Override
	public void run() {
		while(true)
		{
			 rs.out();
	}
			}
		
	}
