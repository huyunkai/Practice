package Buffer;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
	private Reader r;
	private int  lineNumber;
	MyLineNumberReader(Reader r)
	{
		this.r=r;
	}
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber=lineNumber;
	}
	public int getLineNumber()
	{
		return this.lineNumber;
	}
	public String myReadline()throws IOException
	{
		lineNumber++;
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		
		}
		if(sb.length()!=0)
			return sb.toString();
		
		return null;
	
		
	}
	public void myClose()throws IOException
	{
		r.close();
	}

}
