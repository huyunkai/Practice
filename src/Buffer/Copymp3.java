/*
 * 演示MP3的复制，通过缓冲区.
 * 
 * */
package Buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Copymp3 {
	public static void main(String []args)
	{
		Copymap3_1();
	}
	//通过字节流的缓冲区完成复制.
	public static void Copymap3_1()
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
		fis=new FileInputStream("C:\\Users\\Public\\Music\\Sample Music\\Kalimba.mp3");
		fos=new FileOutputStream("D:\\mymp4.mp3");
		byte []buf=new byte[1024];
		int len =0;
		while((len=fis.read(buf))!=-1)
		{
			fos.write(buf, 0, len);
		}
		}
		catch(IOException e)
		{
			throw new RuntimeException("复制mp3出错");
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
				throw new RuntimeException("读取文件失败");
			}
			try
			{
				if(fos!=null)
					fos.close();
				
			}
			catch(IOException e)
			{
				throw new RuntimeException("写入文件失败");
			}
		}
	}
}
