/*
 * �������ĳ�����Ϊ��������Ĳ���Ч�ʶ����ֵġ�
 * ���Դ���������֮ǰ
 * ����������������
 * �û��������ṩ��һ����ƽ̨�Ļ��з���
 * newline();
 * */
package Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String []args)throws IOException
	{
		//����һ���ַ�д��������
		FileWriter fw=new FileWriter("buf.txt");
		//Ϊ������ַ�д����Ч�ʡ������˻��弼����
		//ֻ��Ҫ�����Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯�����ɡ�
		BufferedWriter bw=new BufferedWriter(fw);
		for(int x=1;x<5;x++)
		{
		
			bw.write("abcde"+x);//ֻҪ�õ�����������Ҫ�ǵ�ˢ��.
			bw.newLine();//��ƽ̨ϵͳ���κ�ϵͳ������ʹ�á�
			bw.flush();
		}
		
		bw.close();//��ʵ�رջ����������ڹرջ������е�������.
		
	}
}
