/*
 * ������BufferedReader�������з���readline��ԭ���
 * �����Զ���һ�����а���һ�����ܺ�readLineһ�µķ���.��ģ��һ��
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
	
	//����һ�ζ�һ�еķ���.
	public String myReadLine()
	{
		//����һ����ʱ����.ԭBufferedReader��װ�����ַ����顣
				//Ϊ����ʾ����.����һ��StringBuilder����.��Ϊ���ջ���
				//Ҫ�����ݱ���ַ���.
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
