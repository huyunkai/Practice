/*
 * �ַ���(�����ı�)��
 * FileReader
 * FileWriter.
 * 
 * BufferedReader
 * BufferedWriter.
 * �ֽ�����
 * InputStream,
 * OutputStream.
 * ����:
 * ��Ҫ����ͼƬ���ݣ���ʱ��Ҫ�õ��ֽ���.
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
		byte[] buf=new byte[len];//����һ���ոպõĻ���������Ҫѭ����
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
