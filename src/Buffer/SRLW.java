package Buffer;

import java.util.Calendar;
import java.util.Scanner;

public class SRLW {
	public static void main(String []args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("С�࣬���������1994֮���,������һ����1994֮���ĳһ�꣺");
		System.out.println("�������������ݣ�");
		int year=a.nextInt();
		Scanner b=new Scanner(System.in);
		int month=4;
		//System.out.println("������·�Ϊ��"+year);
		System.out.println("      "+year+"��"+month+"��              ");
		String title[]={"��","һ","��","��","��","��","��"};
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
		//������ȡ��ǰ�����������ڼ�.
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
		System.out.println("��*��������������գ���Ҫ����Ŷ�����տ��֣�");
		
		
		
	}
}
