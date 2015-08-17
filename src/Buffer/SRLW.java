package Buffer;

import java.util.Calendar;
import java.util.Scanner;

public class SRLW {
	public static void main(String []args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("小洁，你的生日是1994之后的,请输入一个在1994之后的某一年：");
		System.out.println("请输入任意的年份：");
		int year=a.nextInt();
		Scanner b=new Scanner(System.in);
		int month=4;
		//System.out.println("输入的月份为："+year);
		System.out.println("      "+year+"年"+month+"月              ");
		String title[]={"日","一","二","三","四","五","六"};
		for(int i=0;i<=6;i++)
		{
			System.out.print(title[i]+'\t');
		}
		System.out.println("");
		Calendar cal=Calendar.getInstance();
		int maxdate=cal.getActualMaximum(Calendar.DATE);
		int mindate=cal.getActualMinimum(Calendar.DATE);
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		//用来获取当前的日期是星期几.
		int weekday=cal.get(Calendar.DAY_OF_WEEK);
		for(int i=1;i<=weekday-1;i++)
		{
			System.out.print("\t");
		
		}
		
		int bb=mindate+7-1;
			
		for(int i=1;i<=maxdate-1;i++)
		{
			
			System.out.print(i+"\t");
			if(i==bb)
			{
				System.out.print("*");
			}
			if((i+weekday-1)%7==0)
			{
				System.out.println("");
				
			}
		}
		System.out.println();
		System.out.println("带*的日子是你的生日，不要忘记哦！生日快乐！");
		
		
		
	}
}
