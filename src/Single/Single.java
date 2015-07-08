package Single;

public class Single {
private static Single s=null;
private Single(){}
public static Single getInstance()
{
   if(s==null)
	   s=new Single();
   return s;
}
}
