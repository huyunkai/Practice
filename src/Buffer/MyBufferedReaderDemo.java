package Buffer;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyBufferedReaderDemo {
	public static void main(String []args)
	{
		FileReader fr=null;
		try {
			fr = new FileReader("C:\\Users\\sony\\workspace\\Prictice\\buf.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyBufferedReader myBuf=new MyBufferedReader(fr);
		String line=null;
		while((line=myBuf.myReadLine())!=null)
		{
			System.out.println(line);
		}
		myBuf.myClose();
	}
}
