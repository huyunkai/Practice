package Buffer;

import java.io.FileReader;

public class MyLineNumberReader2 extends MyBufferedReader 
{
	private int lineNumber;
	MyLineNumberReader2(FileReader r)
	{
		super(r);
	}
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber=lineNumber;
	}
	public int getLineNumer()
	{
		return this.lineNumber;
	}
	public String getReadline()
	{
		lineNumber++;
		return super.myReadLine();
	}

}
