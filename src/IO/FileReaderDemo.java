package IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[]args)
	{
		FileReader fr=null;
		int count=0;
		//����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ�����ԡ�
		//��֤���ļ����Ѿ����ڵģ���������ڣ��ᷢ���쳣FileNotFoundException.
		try{
		fr=new FileReader("demo.txt");
		//���ö�ȡ������ġ�
		//read():һ�ζ�һ���ַ������һ��������¶���
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			System.out.printf("%c ",(char)ch);
		}
		//		while(true)
//		{
//		int ch=fr.read();
//		if(ch==-1)
//			break;
//		System.out.printf("%c ",(char)ch);
//		count++;
//		}
//		
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
		
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
} 
