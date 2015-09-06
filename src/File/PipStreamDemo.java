package File;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipStreamDemo {
	public static void main(String []args) throws IOException
	{
		PipedInputStream in=new PipedInputStream();
		PipedOutputStream os=new PipedOutputStream();
		in.connect(os);
		Read r=new Read(in);
		Write w=new Write(os);
		new Thread(r).start();
		new Thread(w).start();
	}
}
