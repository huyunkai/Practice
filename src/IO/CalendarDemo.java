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
//	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy��");
//	    sop(sdf.format(d)); 
//	    GregorianCalendar cal=new GregorianCalendar();
//	    sop(cal.get(Calendar.DAY_OF_YEAR));
		Calendar cal=Calendar.getInstance();
		
		String []months= {"һ��","����","����","����",
						"����","����","����","����",
						"����","ʮ��","ʮһ��","ʮ����"};
		String []weeks={"","������","����һ","���ڶ�","������","������"
				  		 ,"������","������"};
		int index=Calendar.getInstance().get(Calendar.MONTH);
		int weekday=Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		//sop(cal);
		sop(cal.get(Calendar.YEAR)+"��"+" "+months[index]+" "
			+cal.get(Calendar.DAY_OF_MONTH)+"��"+" "+
				weeks[weekday]+" "+
				cal.get(Calendar.HOUR_OF_DAY)+"Сʱ"+":"+
				cal.get(Calendar.MINUTE)+"��"+":"+
				cal.get(Calendar.SECOND)+"��");
	    }
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
