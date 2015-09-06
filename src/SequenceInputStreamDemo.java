import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class SequenceInputStreamDemo {
	public static void main(String []args)throws IOException
	{
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(new FileInputStream("D:\\11.txt"));
		v.add(new FileInputStream("D:\\22.txt"));
		v.add(new FileInputStream("D:\\33.txt"));
		Enumeration<FileInputStream> en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);
		FileOutputStream fos=new FileOutputStream("D:\\4.txt");
		byte [] by=new byte[1024];
		int len=0;
		while((len=sis.read(by))!=-1)
		{
			fos.write(by, 0, len);
		}
		fos.close();
		sis.close();
	}
}
