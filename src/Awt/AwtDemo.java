/*
 * ����ͼ�λ����棺
 * 1������frame����.
 * 2,�Դ�����л�������.
 *  �����С��λ�ã�����.
 *  3,�������
 *  4�������ͨ�������add������ӵ�������.
 *  5,�ô�����ʾ��ͨ��setVisible(true);
 *  �¼��������Ƶ��ص� ��
 *  1���¼�Դ.
 *  2,�¼�.
 *  3,������.
 *  4,�¼�����.
 *  �¼�Դ������awt������swing���е���Щͼ�ν������.
 *  �¼���ÿһ���¼�Դ�����Լ����еĶ�Ӧ�¼��͹����¼�.
 *  �������������Դ���ĳһ���¼��Ķ������Ѿ���װ���˼�������.
 *  �������ߣ���java�ж��Ѿ��������.
 *  ֱ�ӻ�ȡ��������þͿ�����.
 *  ����Ҫ���������ǣ����ǶԲ����Ķ������д���.
 *  OSIģ�ͣ�Ӧ�ò㣬��ʾ�㣬�Ự�㣬����㣬����㣬������·�㣬�����.
 *  TCP/IP��Ӧ�ò�,����㣬���ʲ㣬�����������.
 * */
package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtDemo {
	public static void main(String []args)
	{
		Frame f=new Frame("my awt");
		f.setSize(500,100);//���ÿ��
		f.setLocation(300, 200);//���þ������Ͻǵľ���.
		f.setLayout(new FlowLayout());//���ò��ֹ���.
		Button b=new Button("I am a button!");
		f.add(b);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ر�");
				System.exit(0);
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("�һ���");
				
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("������!");
				
			}
		});
		f.setVisible(true);//�����Ƿ�ͼ�λ���ʾ
		
	}
}
