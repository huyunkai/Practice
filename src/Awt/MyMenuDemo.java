package Awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyMenuDemo {
	private File file;
	private FileDialog opendia,savedia;
	private TextArea ara;
	private Frame f;
	private MenuBar mb;
	private Menu m,b,x,c,help;
	private Menu subMenu;
	private MenuItem closeItem,subItem,subItem1,openItem,saveItem;
	MyMenuDemo()
	{
		init();
	}
	public void init()
	{
		f=new Frame("my  window");
		f.setBounds(300, 100, 600, 500);
		mb=new MenuBar();
		ara=new TextArea();
		m=new Menu("文件");
		b=new Menu("编辑");
		x=new Menu("项目");
		c=new Menu("窗口");
		help=new Menu("帮助");
		subMenu=new Menu("子菜单");
		subItem=new MenuItem("子条目1");
		subItem1=new MenuItem("子条目2");
		closeItem=new MenuItem("退出");
		openItem=new MenuItem("打开");
		saveItem=new MenuItem("保存");
		subMenu.add(subItem);
		subMenu.add(subItem1);
		m.add(subMenu);
		m.add(closeItem);
		m.add(openItem);
		m.add(saveItem);
		mb.add(m);
		mb.add(b);
		mb.add(x);
		mb.add(c);
		mb.add(help);
		f.setMenuBar(mb);
		opendia=new FileDialog(f,"我要打开",FileDialog.LOAD);
		savedia=new FileDialog(f,"我要保存",FileDialog.SAVE);
		f.add(ara);
		myEvent();
		f.setVisible(true);
	}
	private void myEvent()
	{
		saveItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(file==null)
				{
				savedia.setVisible(true);
				String dirPath=savedia.getDirectory();
				String filename=savedia.getFile();
				if(dirPath==null ||filename==null)
				return;
				file=new File(dirPath,filename);
				}
				try
				{
					BufferedWriter bufw=new BufferedWriter(new FileWriter(file));
					String text=ara.getText();
					bufw.write(text);
					bufw.close();
				}
				catch(IOException e1)
				{
					throw new RuntimeException("写入失败！");
				}
				
			}
		});
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				opendia.setVisible(true);
				String dirPath=opendia.getDirectory();
				String filename=opendia.getFile();
				if(dirPath==null||filename==null)
					return;
				ara.setText("");
				file=new File(dirPath,filename);
				try
				{
					BufferedReader bufr=new BufferedReader(new FileReader(file));
					String line=null;
					while((line=bufr.readLine())!=null)
					{
						ara.append(line+"\r\n");
					}
				}
				catch(IOException e1)
				{
					throw new RuntimeException("读取失败！");
				}
			}
		});
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) 
	{
		new MyMenuDemo();
	}

}
