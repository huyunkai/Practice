package Buffer;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
	public static void main(String []args)
	{
		FileReader fr=null;
		LineNumberReader lnr=null;
		try
		{
		fr=new FileReader("C:\\Users\\sony\\workspace\\Prictice\\src\\Buffer\\Person.java");
		lnr=new LineNumberReader(fr);
		String line=null;
		lnr.setLineNumber(10);
		while((line=lnr.readLine())!=null)
		{
			System.out.println(lnr.getLineNumber()+".."+line);
		}
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
				
					try {
						if(fr!=null)
						lnr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
		}
	}
	}
