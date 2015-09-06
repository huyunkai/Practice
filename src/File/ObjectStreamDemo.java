package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String []args)throws IOException, ClassNotFoundException
	{
		//writeObj();
		readObj();
	}
	public static void readObj()throws IOException, ClassNotFoundException
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\obj.txt"));
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
		
	}
	public static void writeObj()throws IOException
	{
		ObjectOutputStream oos=
				new ObjectOutputStream(new FileOutputStream("d:"+File.separator+"obj.txt"));
		oos.writeObject(new Person("lisi0",399,"Japan"));
		oos.close();
	}
}
