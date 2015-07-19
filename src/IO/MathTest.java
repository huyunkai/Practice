/*
 * 练习：
 * 给定一个小数。
 * 保留该小数的后两位。
 * */
package IO;

import java.util.Scanner;

public class MathTest {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		sop("你所得到的小数后两位:");
		System.out.printf("%.2f",s);
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
