package Buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionInfo {
	public static void main(String []args) throws IOException
	{
		try
		{
		int []arr=new int[2];
		System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			try {
				Date d=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s=sdf.format(d);
				PrintStream ps=new PrintStream("D:\\aa.txt");
				System.setOut(ps);
				ps.println(s);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				throw new RuntimeException("日志文件创建失败！");
			}
			e.printStackTrace(System.out);
		}
	}
}
//log4j