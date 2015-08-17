package Buffer;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderDemo {
	public static void main(String []args)
	{
		MyLineNumberReader2 mr=null;
		try{
		FileReader fr=new FileReader("C:\\Users\\sony\\workspace\\Prictice\\src\\Buffer\\Person.java");
		mr=new MyLineNumberReader2(fr);
		String line=null;
		mr.setLineNumber(100);
		while((line=mr.getReadline())!=null)
		{
			System.out.println(mr.getLineNumer()+".."+line);
		}
		
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			mr.myClose();
		}
	
	}
}
