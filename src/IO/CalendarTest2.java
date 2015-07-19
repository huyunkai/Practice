/*
 * 2，获取昨天的现在的这个时刻。
 * 		c.add(Calendar.DAY_OF_MONTH,-1);
 * */
package IO;

import java.util.Calendar;

public class CalendarTest2 {
	public static void main(String []args)
	{
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -1);
		printCalendar(c);
	}
	public static void printCalendar(Calendar c)
	{
		String []months={"一月","二月","三月","四月",
					     "五月","六月","七月","八月",
					     "九月","十月","十一月","十二月"};
		String []weeks={"","星期日","星期一","星期二","星期三",
						"星期四","星期五","星期六",};
		int index=c.get(Calendar.MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
		sop(c.get(Calendar.YEAR)+"年");
		sop(months[index]);
		sop(c.get(Calendar.DAY_OF_MONTH)+"日");
		sop(weeks[weekday]);
		sop(c.get(Calendar.HOUR_OF_DAY)+"时:");
		sop(c.get(Calendar.MINUTE)+"分:");
		sop(c.get(Calendar.SECOND)+"秒:");
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
