package IO;

import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String []args)
	{
		Calendar c=Calendar.getInstance();
		//c.set(2012, 2,23);
		c.add(Calendar.YEAR, -1);
		printCalendar(c);
		
		
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
		sop(c.get(Calendar.YEAR)+"年");
		sop(months[index]);
		sop(c.get(Calendar.DAY_OF_MONTH));
		sop(weeks[weekday]);
		sop(c.get(Calendar.HOUR_OF_DAY));
		sop(c.get(Calendar.MINUTE));
		sop(c.get(Calendar.SECOND));
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
