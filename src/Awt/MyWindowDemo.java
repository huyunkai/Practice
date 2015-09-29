package Awt;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class MyWindowDemo {
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	private Dialog d;
	private Label lab;
	private Button OkBar; 
	MyWindowDemo()
	{
		init();
	}
	public void init()
	{
		f=new Frame("my window");
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		
		tf=new TextField(30);
		but=new Button("转到");
		ta=new TextArea(15,40);
		d=new Dialog(f, "提示信息-self", true);
		d.setBounds(400, 200, 240,150);
		d.setLayout(new FlowLayout());
		lab=new Label();
		OkBar=new Button("确定");
		
		d.add(lab);
		d.add(OkBar);
		f.add(tf);
		f.add(but);
		f.add(ta);
		myEvent();
		f.setVisible(true);
	}
	private void myEvent()
	{
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					showDir();
				}
			}
		});
		OkBar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d.setVisible(false);
				
			}
		});
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				d.setVisible(false);
			}
		});
		f.addWindowListener(new WindowAdapter() {
		
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showDir();
				
			}
		});
	}
	private void showDir()
	{
		String dirPath=tf.getText();
		File dir=new File(dirPath);
		if(dir.exists()&&dir.isDirectory())
		{
			String []names=dir.list();
			for(String name:names)
			{
				ta.append(name+"\r\n");
			}
		}
		//System.out.println(text);
		else
		{
			String info="您输入的信息： "+dirPath+"是错误的.请重新输入";
			lab.setText(info);
			d.setVisible(true);
		}
	}
	
	public static void main(String[]args)
	{
		new MyWindowDemo();
	}
}
