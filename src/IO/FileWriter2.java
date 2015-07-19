/**
 * IO异常的处理方式。
 * 
 */
package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
	
	public static void main(String []args)
	{
		FileWriter fw=null;
		try{
		fw=new FileWriter("F:\\demo2.txt");
		fw.write("sdafdasdas");
		
		}catch(IOException e)
		{
			System.out.println("Catch:"+e.toString());
		}
		finally
		{
			try{
			if(fw!=null)
			fw.close();	
			}catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
	}
}
