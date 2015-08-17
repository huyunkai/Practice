/*
 * 字符流(操作文本)：
 * FileReader
 * FileWriter.
 * 
 * BufferedReader
 * BufferedWriter.
 * 字节流：
 * InputStream,
 * OutputStream.
 * 需求:
 * 想要操作图片数据，这时就要用到字节流.
 * 
 * */
package Buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String []args)
	{
		//writeFile();
		//readFile_2();
		readFile_3();
	}
	public static void writeFile()
	{
		try{
		FileOutputStream fos=new FileOutputStream("fos.txt");
		fos.write("abcde".getBytes());
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}
	public static void readFile_1()
	{
		FileInputStream fis=null;
		try{
		fis=new FileInputStream("C:\\Users\\sony\\workspace\\Prictice\\fos.txt");
		int line=0;
		while((line=fis.read())!=-1)
		System.out.printf("%c",(char)line); 
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				if(fis!=null)
				fis.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
	}
	public static void readFile_2()
	{
		FileInputStream fis=null;
		try{
	
			fis=new FileInputStream("C:\\U"
					+ "sers\\sony\\workspace\\Prictice\\fos.txt");
			byte []buf=new byte[1024];
			int len=0;
			while((len=fis.read(buf))!=-1)
			{
				System.out.println(new String(buf,0,len));
			}
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				if(fis!=null)
				{
					fis.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
	}
	public static void readFile_3()
	{
		FileInputStream fis=null;
		try{
		fis=new FileInputStream("C:\\Users\\"
	     + "sony\\workspace\\Prictice\\fos.txt");
		int len=fis.available();
		byte[] buf=new byte[len];//定义一个刚刚好的缓冲区，不要循环了
		fis.read(buf);
		System.out.println(new String(buf));
		
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
			if(fis!=null)
			{
				fis.close();
			}
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
	}
}
