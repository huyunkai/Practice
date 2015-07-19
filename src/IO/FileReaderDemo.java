package IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[]args)
	{
		FileReader fr=null;
		int count=0;
		//创建一个文件读取流对象，和指定名称的文件相关性。
		//保证该文件是已经存在的，如果不存在，会发生异常FileNotFoundException.
		try{
		fr=new FileReader("demo.txt");
		//调用读取流对象的。
		//read():一次读一个字符，而且会依次往下读。
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			System.out.printf("%c ",(char)ch);
		}
		//		while(true)
//		{
//		int ch=fr.read();
//		if(ch==-1)
//			break;
//		System.out.printf("%c ",(char)ch);
//		count++;
//		}
//		
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
		
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
} 
