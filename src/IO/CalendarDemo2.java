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
		String []months={"һ��","����","����","����",
				"����","����","����","����",
				"����","ʮ��","ʮһ��","ʮ����",};
		String []weeks={"","������","����һ","���ڶ�",
				"������","������","������","������"};
		int index=c.get(Calendar.MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
		sop(c.get(Calendar.YEAR)+"��");
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
