package IO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String []args)
	{
		Date d=new Date();
		//System.out.println(d);//��ӡ��ʱ�俴������ϣ����Щ��ʽ��
		//��ģʽ��װ��SimpleDateFormat�����С�
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy��MM��dd�� hh:mm:ss");
		//����format������ģʽ��ʽ���ƶ�Date����
		String time=sdf.format(d);
		System.out.println("time="+time);
	}
}
