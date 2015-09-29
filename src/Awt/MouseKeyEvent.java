package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseKeyEvent {
	private Frame f;
	private Button but;
	private TextField tf;
	MouseKeyEvent()
	{
	  init();
	}
	public void init()
	{
		f=new Frame("my frame");
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		tf=new TextField(40);
		but=new Button("my button");
		f.add(tf);
		f.add(but);
		myEvent();
		f.setVisible(true);
		
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
			
		});
		tf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{    int code=e.getKeyCode();
				if(!(code>=KeyEvent.VK_0&&code<=KeyEvent.VK_9))
				{
					System.out.println(code+"...�ǷǷ��ģ�");
					e.consume();
				}
			}
		});
		//�����
//		but.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("action ok!");
//				
//			}
//		});
//		but.addMouseListener(new MouseAdapter() {
//			private int count=1;
//			private int clickCount=1;
//			public void mouseEntered(MouseEvent e)
//			{
////				System.out.println("�����뵽�����"+count++);
//			}
//			public void mouseClicked(MouseEvent e)
//			{
//				if(e.getClickCount()%2==0)
//				 System.out.println("˫������"+clickCount++);
//				}
//		});
		//��but���һ�����̼����¼�
		but.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e)
			{
				if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER)
					System.exit(0);
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"..."+e.getKeyCode());
			}
		});
	}
	public static void main(String  []args)
	{
		new MouseKeyEvent();
	}
	
}
