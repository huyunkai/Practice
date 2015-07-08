package Collection;

import java.util.Comparator;

public class StrComparator implements  Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int num=s1.compareTo(s2);
		if(num>0)
		return -1;
		if(num<0)
			return 1;
		return num;
	}

}
