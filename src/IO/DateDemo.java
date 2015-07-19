package IO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String []args)
	{
		Date d=new Date();
		//System.out.println(d);//打印的时间看不懂，希望有些格式。
		//将模式封装到SimpleDateFormat对象中。
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy年MM月dd日 hh:mm:ss");
		//调用format方法让模式格式化制动Date对象。
		String time=sdf.format(d);
		System.out.println("time="+time);
	}
}
