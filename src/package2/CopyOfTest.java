package package2;
import java.lang.reflect.*;
import  java.util.*;
class CopyOfTest 
{
	public static void main(String[] args) 
	{
		int []a={1,2,3};
		a=(int [])goodCopyOf(a, 10);
		System.out.println(Arrays.toString(a));
		String []b={"Tom","Dick","harry"};
		String []c={"¶þÅÖ","¹·ÈÕµÄ"};
		b=(String [])goodCopyOf(b,10);
		System.out.println(Arrays.toString(b));
		System.out.println("The following call will generate an exception.");
		c=(String [])goodCopyOf(c,10);
		System.out.println(c.toString());
	}

	public static Object[] badCopyOf(Object []a,int newlength)
	{
		Object []newArray=new Object[newlength];
		System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newlength));
		return newArray;
	}
	public static Object goodCopyOf(Object a,int newlength)
	{
	      Class cl=a.getClass();
		  if(!cl.isArray()) return null;
		  Class componentType=cl.getComponentType();
		  int length=Array.getLength(a);
		  Object newArray=Array.newInstance(componentType,newlength);
		  System.arraycopy(a, 0, newArray, 0, Math.min(length, newlength));
		  return newArray;
		}
}
