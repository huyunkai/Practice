/*
 * ������ϰ��
 * 1����ȡ������Ķ����ж����졣
 * 		˼·������ָ��������һ��ʱ�����
 * 		c.set(year,2,1)//ĳһ���3��1�š�
 * 		c.add(Calendar.DAY_OF_MONTH,-1);//3��1�ţ���ǰ��һ�죬����2�µ����һ��
 * */
package IO;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String []args)
	{
		Calendar c=Calendar.getInstance();
		System.out.print("������1-2015�������һ��:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		//printCalendar(c);
		if(c.equals("29"))
		{
			sop("��һ�������꣡");
		}
		else
		{
			sop("��һ����ƽ��");
		}
		
		
	}
	public static void printCalendar(Calendar c)
	{
		String []months={"һ��","����","����","����",
				"����","����","����","����",
				"����","ʮ��","ʮһ��","ʮ����",};
		String []weeks={"","������","����һ","���ڶ�",
				"������","������","������","������"};
		int index=c.get(Calendar.MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
//		sop(c.get(Calendar.YEAR)+"��");
//		sop(months[index]);
		sop(c.get(Calendar.DAY_OF_MONTH));
//		sop(weeks[weekday]);
//		sop(c.get(Calendar.HOUR_OF_DAY));
//		sop(c.get(Calendar.MINUTE));
//		sop(c.get(Calendar.SECOND));
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
