/*
 * 
 * */
package IO;

import java.util.Random;

public class MathDemo {
	private static final double PI=3.14;
	public static void main(String []args)
	{
		Random r=new Random();
		for(int x=0;x<5;x++)
		{
			int i=r.nextInt(10)+1;
			sop(i);
//			System.out.printf("%.2f",i);
//			System.out.println();
		}
		//ceil���ش���ָ�����ݵ���С������
		double d=Math.ceil(12.34);
		sop("d="+d);
		//floor����С��ָ�����ݵ��������
		double d1=Math.floor(12.34);
		sop("d1="+d1);
		long l=Math.round(12.64);//��������
		sop("l="+l);
		double m=Math.pow(2, 3);//2^3;��
		sop("m="+m);
		
		//
//		Scanner sc=new Scanner(System.in);
//		double i=0.5;
//		while(true)
//		{
//		double x=sc.nextDouble();
//		System.out.println(Math.sqrt(x));
//		
//		}
		}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
