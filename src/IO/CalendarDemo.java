package IO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String []args)
	{
//		Date d=new Date();
//		sop(d.getYear());
//	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年");
//	    sop(sdf.format(d)); 
//	    GregorianCalendar cal=new GregorianCalendar();
//	    sop(cal.get(Calendar.DAY_OF_YEAR));
		Calendar cal=Calendar.getInstance();
		
		String []months= {"一月","二月","三月","四月",
						"五月","六月","七月","八月",
						"九月","十月","十一月","十二月"};
		String []weeks={"","星期日","星期一","星期二","星期三","星期四"
				  		 ,"星期五","星期六"};
		int index=Calendar.getInstance().get(Calendar.MONTH);
		int weekday=Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		//sop(cal);
		sop(cal.get(Calendar.YEAR)+"年"+" "+months[index]+" "
			+cal.get(Calendar.DAY_OF_MONTH)+"日"+" "+
				weeks[weekday]+" "+
				cal.get(Calendar.HOUR_OF_DAY)+"小时"+":"+
				cal.get(Calendar.MINUTE)+"分"+":"+
				cal.get(Calendar.SECOND)+"秒");
	    }
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
