package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class SplitFileDemo {
	public static void main(String []args)throws IOException
	{
		//splitFile();
		merge();
	}
	public static void merge()throws IOException
	{
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
		
			al.add(new FileInputStream("d:\\"+1+".part"));
		final Iterator<FileInputStream>it=al.iterator();
		Enumeration<FileInputStream> en=new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		SequenceInputStream sis=new SequenceInputStream(en);
		FileOutputStream fos=new FileOutputStream("0.jpg");
		byte []buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1)
		{
			fos.write(buf, 0, len);
		}
		fos.close();
		sis.close();
	}
	public static void splitFile()throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		FileOutputStream fos=null;
		int count=1;
		byte []buf=new byte[1024*1024];
		int len=0;
		while((len=fis.read(buf))!=-1)
		{
			fos=new FileOutputStream("d:\\"+(count++)+".part");
			fos.write(buf, 0, len);
			fos.close();
		}
		
			fis.close();
	}
}
