/*
 * 目录中还有目录,只要使用同一个列出目录功能的函数完成即可.
 * 在列出过程中出现的韩式目录的话，还可以再次调用本功能。
 * 也就是函数自身调用自身.
 * 这种表现形式，或者编程手法，成为递归.
 * 
 * 递归要注意:
 * 1,限定条件.
 * 2,要注意递归的次数，尽量避免内存溢出.
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
