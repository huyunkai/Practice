/*
 * Ŀ¼�л���Ŀ¼,ֻҪʹ��ͬһ���г�Ŀ¼���ܵĺ�����ɼ���.
 * ���г������г��ֵĺ�ʽĿ¼�Ļ����������ٴε��ñ����ܡ�
 * Ҳ���Ǻ��������������.
 * ���ֱ�����ʽ�����߱���ַ�����Ϊ�ݹ�.
 * 
 * �ݹ�Ҫע��:
 * 1,�޶�����.
 * 2,Ҫע��ݹ�Ĵ��������������ڴ����.
 * */
package File;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
	public static void main(String []args)
	{
        File dir=new File("d:\\QQ");
		showDir(dir,0);
		//toBin(6);
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			System.out.printf("%d ",getSum(i));
//		}


	}
	public static int getSum(int n)
	{
		if(n==1) return 1;
		else if(n==2) return 1;
		else
		return getSum(n-1)+getSum(n-2);
	}
	public static void toBin(int num)
	{
		if(num>0)
		{
			toBin(num/2);
			System.out.print(num%2);
			
		}
	}
	public static String getLeval(int level)
	{
		StringBuilder sb=new StringBuilder();
		sb.append("|--");
		for(int x=0;x<level;x++)
		{
//			sb.append("|--");
			sb.insert(0, "|  ");
		}
		return  sb.toString();
	}
	public static void showDir(File dir,int level)
	{
		System.out.println(getLeval(level)+dir.getName());
		level++;
		File []files=dir.listFiles();
		for(File f:files)
		{
			if(f.isDirectory())
				showDir(f,level);
			else
			System.out.println(f);
		}
	}
}
