/*
 * ��ȡ����¼��.
 * System.out:��Ӧ���Ǳ�׼����豸,����̨.
 * System.in:��Ӧ���Ǳ�׼�����豸������.
 * ����
 * ͨ������¼�����ݡ�
 * ��¼��һ�����ݺ�,�ͽ��������ݽ��д�ӡ.
 * ���¼���ʫ����over,��ôֹͣ¼��.
 * */
package Buffer;
import java.io.*;
public class ReadIn {

	public static void main(String[] args) {
		InputStream  in=System.in;
		String []app={"0","1","2","3","4","5","6","7","8","9"};
		try{
			StringBuilder sb=new StringBuilder();
		while(true)
		{
			int ch=in.read();
			if(ch=='\r')continue;
			if(ch=='\n')
			{
				String s=sb.toString();
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());
				sb.delete(0, sb.length());
//				sb=new StringBuilder();
			}
			else
				sb.append((char)ch);
		}
		}
		catch(IOException e)
		{
			throw new RuntimeException("����ʧ�ܣ�");
		}
		finally
		{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
