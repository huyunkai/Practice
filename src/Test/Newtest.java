package Test;

import java.util.Scanner;

public class Newtest {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("���������0-"+m+"�ĺ���:");
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
