package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentInfoTool {
	public static Set<Student>getStudents()throws IOException
	{
		return getStudents(null);
	}
	public static Set<Student> getStudents(Comparator<Student>cmp)throws IOException
	{
		BufferedReader bufr=new BufferedReader(new 
				InputStreamReader(System.in));
		String line=null;
		Set<Student>stus=null;
		if(stus==null)
			stus=new TreeSet<Student>();
		else
			stus=new TreeSet<Student>(cmp);
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			String []info=line.split(",");
			Student stu=new Student(info[0],Integer.parseInt(info[1]),
					                 Integer.parseInt(info[2]),
					                 Integer.parseInt(info[3]));
				stus.add(stu);
		}
		bufr.close();
		return stus;
	}
	public static void WriteFile(Set<Student>stus)throws IOException
	{
		BufferedWriter bufw=new BufferedWriter(new FileWriter("d:\\stud.txt"));
		for(Student s:stus)
		{
		 	bufw.write(s.toString()+"\t");
		 	bufw.write(s.getSum()+"");
		 	bufw.newLine();
		 	bufw.flush();
		}
		bufw.close();
	}
	
}
