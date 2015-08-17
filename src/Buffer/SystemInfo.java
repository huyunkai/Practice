package Buffer;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class SystemInfo {

	public static void main(String[] args) {
		Properties prop=System.getProperties();
		//System.out.println(prop);
		try {
			System.setOut(new PrintStream("D:\\sysinfo.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop.list(System.out);
	}

}
