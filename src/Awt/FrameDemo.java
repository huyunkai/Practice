package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
//�����ͼ������������������.
	private Frame f;
	private Button but;
	FrameDemo()
	{
		init();
	}
	public void init()
	{
		f=new Frame("my frame");
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		but=new Button("my button");
		//���齨��ӵ�frame��
		f.add(but);
		//����һ���������¼�
		myEvent();
		//��ʾ����
		f.setVisible(true);
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		/*
		 * �ð�ť�߱��˳�����Ĺ���
		 *	��ť�����¼�Դ
		 * ��ôѡ���ĸ��������أ�
		 * ͨ���رմ���ʾ���˽⵽,��Ҫ֪���ĸ�����߱�ʲô�������м�����.
		 * ��Ҫ�鿴���������Ĺ���.
		 * ͨ������button������,���ְ�ť֧��һ�����еļ���addActionListener();
		 * 
		 * */
		but.addActionListener(new ActionListener(){
			private int count=1;
			public void actionPerformed(ActionEvent e)
			{
				Button b1=(Button)e.getSource();
				Frame f1=(Frame)b1.getParent();
				f1.add(new Button("button-"+count++));
				f1.validate();
			}
		});
	}
	public static void main(String []args)
	{
		new FrameDemo();
	}
}
