package Single;

import java.util.Comparator;

public class MyCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student  s2=(Student)o2;
		int num=s1.getName().compareTo(s2.getName());
		if(num==0)
		{
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
//			if(s1.getAge()>s2.getAge())
//				return 1;
//			if(s1.getAge()==s2.getAge())
//				return 0;
//			return -1;
		}
		return num;
		
	}

}
