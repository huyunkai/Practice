/*
 * 两个练习：
 * 1、获取任意年的二月有多少天。
 * 		思路：根据指定年设置一个时间就是
 * 		c.set(year,2,1)//某一年的3月1号。
 * 		c.add(Calendar.DAY_OF_MONTH,-1);//3月1号，往前推一天，就是2月的最后一。
 * */
package IO;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String []args)
	{
		Calendar c=Calendar.getInstance();
		System.out.print("请输入1-2015年的任意一年:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		//printCalendar(c);
		if(c.equals("29"))
		{
			sop("这一年是瑞年！");
		}
		else
		{
			sop("这一年是平年");
		}
		
		
	}
	public static void printCalendar(Calendar c)
	{
		String []months={"一月","二月","三月","四月",
				"五月","六月","七月","八月",
				"九月","十月","十一月","十二月",};
		String []weeks={"","星期日","星期一","星期二",
				"星期三","星期四","星期五","星期六"};
		int index=c.get(Calendar.MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
//		sop(c.get(Calendar.YEAR)+"年");
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
