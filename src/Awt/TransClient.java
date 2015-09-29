package Awt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TransClient 
{
	public static void main(String []args)throws Exception
	{
		Socket s=new Socket("127.0.0.1",10005); 
		//�����ȡ�������ݵ�������.
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//����Ŀ��,������д�뵽socket����������͸������.
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//����һ��socket��ȡ��,��ȡ����˷��صĴ�д��Ϣ
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			
			if("over".equals(line))
				break;
			bufw.write(line);
			//���¶�ȡ�ӷ���������������
			String str=bufIn.readLine();
			System.out.println("server:"+str);
			
		}
		bufr.close();
		s.close();
	}
}
