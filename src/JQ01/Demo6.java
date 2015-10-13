package JQ01;

public class Demo6 
{
	public static void main(String []args)
	{
		Week s=new Week();
		s.setName("½ñÌì");
		s.setGrade(Grade.Mon);
		String str=Grade.Mon.getValue();
		String str1=Grade.Mon.toLocalGrade();
		System.out.println(str+"..."+str1);
	}
	
}
