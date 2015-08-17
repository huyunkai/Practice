/*
 * 明白了BufferedReader类中特有方法readline的原理后，
 * 可以自定义一个类中包含一个功能和readLine一致的方法.来模拟一下
 * BufferedReader
 * */
package Buffer;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	private FileReader r;
	MyBufferedReader(FileReader r)
	{
		this.r=r;
	}
	
	//可以一次读一行的方法.
	public String myReadLine()
	{
		//定义一个临时容器.原BufferedReader封装的是字符数组。
				//为了演示方便.定义一个StringBuilder容器.因为最终还是
				//要将数据变成字符串.
				StringBuilder sb=new StringBuilder();
				
				int ch=0;
				try {
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
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}
	public void myClose()
	{
		try {
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
