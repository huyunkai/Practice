package package2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTableTest {
  public static void main(String []args) throws Exception
  {
	  Method square=MethodTableTest.class.getMethod("square",double.class);
	  Method sqrt=Math.class.getMethod("sqrt", double.class);
	  Method add=MethodTableTest.class.getMethod("add", double.class,double.class);
	  Method sub=MethodTableTest.class.getMethod("sub", double.class,double.class);
	  Method cf=MethodTableTest.class.getMethod("cf", double.class,double.class);
	  Method mit=MethodTableTest.class.getMethod("mit", double.class,double.class);
	  printTable(1,10,10,square);
	  printTable(1,10,10,sqrt);
	  printTable2(1,2,10,10,add);
	  printTable3(1,2,10,10,sub);
	  printTable4(1,2,10,10,cf);
	  printTable5(1,2,10,10,mit);
  }
  private static void printTable5(int start, int second, int to, int n, Method mit) {
	System.out.println(mit);
	double dc=(to-start)/(n-1);
	for(double x=start;x<=to;x+=dc)
	{
		try {
			double y=(double)mit.invoke(null, x,second++);
			System.out.printf("%10.4f |%10.4f%n",x,y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
}
/*
   * 两个数相乘x*(x+1);
   */
  private static void printTable4(int start, int second, int to, int n, Method cf) {
	  System.out.println(cf);
		double dx=(to-start)/(n-1);
		for(double x=start;x<=to;x+=dx)
		{
			
				try {
					double y=(double)cf.invoke(null, x,second++);
					System.out.printf("%10.2f | %10.2f%n",x,y);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//如果在调用方法的时候提供一个错误的参数，那么invoke函数将抛出一个异常。
			
		}
	
}
  /*
   * 两个数相减 (x+2)-x
   * */
private static void printTable3(int start, int second, int to, int n, Method sub) {
	  System.out.println(sub);
		double dx=(to-start)/(n-1);
		for(double x=start;x<=to;x+=dx)
		{
			
				try {
					double y=(double)sub.invoke(null, x,second+=2);
					System.out.printf("%10.2f | %10.2f%n",x,y);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//如果在调用方法的时候提供一个错误的参数，那么invoke函数将抛出一个异常。
			
		}
	
}
/*
 * 两个数相加 x+(x+1)
 * */
private static void printTable2(int start, double second, int to, int n, Method k) {
		System.out.println(k);
		double dx=(to-start)/(n-1);
		for(double x=start;x<=to;x+=dx)
		{
			
				try {
					double y=(double)k.invoke(null, x,second++);
					System.out.printf("%10.2f | %10.2f%n",x,y);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//如果在调用方法的时候提供一个错误的参数，那么invoke函数将抛出一个异常。
			
		}
		
	
}
public static double square(double x)
 {
	  return x*x;
 }
  public static double add(double x,double y)
  {
	return x+y;
	  
  }
  public static double sub(double x,double y)
  {
	  return y-x;
  }
  public static double cf(double x,double y)
  {
	  return x*y;
  }
 public static double mit(double x,double y)
 {
	 if(y==0) return 0;
	 else
		 return x/y;
	 
	 
 }
/*
 * x*x或者x开根号
 * */
private static void printTable(int from, int to, int n, Method f) {
	System.out.println(f);
	double dx=(to-from)/(n-1);
	for(double x=from;x<=to;x+=dx)
	{
		
			try {
				double y=(double)f.invoke(null, x);
				System.out.printf("%10.2f | %10.2f%n",x,y);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//如果在调用方法的时候提供一个错误的参数，那么invoke函数将抛出一个异常。
		
	}
	
}
}
