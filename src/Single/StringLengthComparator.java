package Single;

import java.util.Comparator;

public class StringLengthComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		int num= new Integer(s1.length()).compareTo(new Integer(s2.length()));
	    if(num==0)
	    {
	    	return s1.compareTo(s2);
	    }
	    return num;
	}

}
