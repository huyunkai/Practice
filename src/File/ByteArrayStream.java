/*
 * ���ڲ����ֽ������������.
 * ByteArrayInputStream:�ڹ����ʱ����Ҫ��������Դ..��������Դ��һ���ֽ�����
 * ByteArrayOutputStream:�ڹ����ʱ�򣬲���Ҫ��������Ŀ��,��Ϊ�ö������Ѿ��ڲ���װ��
 * �ɱ䳤�ȵ��ֽ�����.
 * ���������Ŀ�ĵ�.
 * 
 * ��Ϊ�����������󶼲����������飬��û��ʹ��ϵͳ��Դ.
 * ���Բ��ý���close�ر�.
 * ������������ʱ��
 * ԭ�豸
 * 	���� System.in,Ӳ�� FileStream,�ڴ� ArrayStream.
 * Ŀ���豸
 * 	����̨ System.in,Ӳ��FileStream ,�ڴ� ArrayStream.
 *
 * */
package File;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayStream {
	public static void main(String []args)
	{
		//����Դ
		ByteArrayInputStream bis=new ByteArrayInputStream("ADCDD".getBytes());
		//����Ŀ��
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		int by=0;
		while((by=bis.read())!=-1)
		{
			bos.write(by);
		}
		System.out.println(bos.size());
		System.out.println(bos.toString());
		//bos.writeTo(new FileOutputStream("a.txt"));
		
	}
}
