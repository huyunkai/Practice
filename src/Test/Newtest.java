package Test;

import java.util.Scanner;

public class Newtest {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("你输入的是0-"+m+"的和是:");
		int result=0;
		for(int i=0;i<=m;i++)
		{
			result+=i;
		}
		sop("result="+result);
	}
	public static void sop(Object obj)
	{
		
		System.out.println(obj);
	}
}
