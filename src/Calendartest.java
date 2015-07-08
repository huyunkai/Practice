import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Calendartest {
   public static void main(String []args)
   {
	   GregorianCalendar d=new GregorianCalendar();
	   int today=d.get(Calendar.DAY_OF_MONTH);
	   int month=d.get(Calendar.MONTH);
	   d.set(Calendar.DAY_OF_MONTH,1);
	   int weekday=d.get(Calendar.DAY_OF_WEEK);
	   int first=d.getFirstDayOfWeek();
	   int indent=0;
	   while(weekday!=first)
	   {
		   indent++;
		   d.add(Calendar.DAY_OF_MONTH, -1);
		   weekday=d.get(Calendar.DAY_OF_WEEK);
	   }
	   //print weekday names
	   String [] weekdayNames=new DateFormatSymbols().getShortWeekdays();
       do
       {
    	   System.out.printf("%2s", weekdayNames[weekday]);
    	   d.add(Calendar.DAY_OF_MONTH, 1);
    	   weekday=d.get(Calendar.DAY_OF_WEEK);
       }
       while(weekday!=first);
    	   System.out.println();
    	   for(int i=1;i<=indent;i++)
    		   System.out.println("   ");
    	   d.set(Calendar.DAY_OF_MONTH,1);
    	   do
    	   {
    		   //print day
    		   int day=d.get(Calendar.DAY_OF_MONTH);
    		   System.out.printf("%3d",day);
    		   if(day==today)
    			   System.out.println("*");
    		   else
    			   System.out.println("  ");
    		   d.add(Calendar.DAY_OF_MONTH, 1);
    		   weekday=d.get(Calendar.DAY_OF_WEEK);
    		   if(weekday==first)
    			   System.out.println();
    	   }
    	   while(d.get(Calendar.MONTH)==month);
    	   if(weekday!=first)
    		   System.out.println();
    	  
   }
}
