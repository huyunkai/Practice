package Awt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin extends WindowAdapter {
	public void windowClosing(WindowEvent e)
	{
		//System.out.println("window closing...."+e.toString());
		System.exit(0);
	}
}
