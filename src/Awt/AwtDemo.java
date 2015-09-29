/*
 * 创建图形化界面：
 * 1，创建frame窗体.
 * 2,对窗体进行基本设置.
 *  比如大小，位置，布局.
 *  3,定义组件
 *  4，将组件通过窗体的add方法添加到窗体中.
 *  5,让窗体显示，通过setVisible(true);
 *  事件监听机制的特点 ：
 *  1，事件源.
 *  2,事件.
 *  3,监听器.
 *  4,事件处理.
 *  事件源：就是awt包或者swing包中的那些图形界面组件.
 *  事件：每一个事件源都有自己特有的对应事件和共性事件.
 *  监听器：将可以触发某一个事件的动作都已经封装到了监听器中.
 *  以上三者，在java中都已经定义好了.
 *  直接获取其对象来用就可以了.
 *  我们要做的事情是，就是对产生的动作进行处理.
 *  OSI模型：应用层，表示层，会话层，传输层，网络层，数据链路层，物理层.
 *  TCP/IP：应用层,传输层，国际层，主机至网络层.
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
		f.setSize(500,100);//设置宽高
		f.setLocation(300, 200);//设置距离左上角的距离.
		f.setLayout(new FlowLayout());//设置布局管理.
		Button b=new Button("I am a button!");
		f.add(b);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("关闭");
				System.exit(0);
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("我活了");
				
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("被打开了!");
				
			}
		});
		f.setVisible(true);//设置是否图形化显示
		
	}
}
