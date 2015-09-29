package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
//定义该图形中所需的组件的引用.
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
		//将组建添加到frame中
		f.add(but);
		//加载一个窗体上事件
		myEvent();
		//显示窗体
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
		 * 让按钮具备退出程序的功能
		 *	按钮就是事件源
		 * 那么选择哪个监听器呢？
		 * 通过关闭窗体示例了解到,想要知道哪个组件具备什么样的特有监听器.
		 * 需要查看该组件对象的功能.
		 * 通过查阅button的描述,发现按钮支持一个特有的监听addActionListener();
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
