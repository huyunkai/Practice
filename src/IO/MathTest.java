/*
 * ��ϰ��
 * ����һ��С����
 * ������С���ĺ���λ��
 * */
package IO;

import java.util.Scanner;

public class MathTest {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		sop("�����õ���С������λ:");
		System.out.printf("%.2f",s);
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
