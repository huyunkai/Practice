package Collection;

import java.util.Comparator;

public class StrLenComparator implements Comparator<String>{

	public int compare(String s1, String s2) {
		   if(s1.length()>s2.length())
				return 1;
			    if(s1.length()<s2.length())
			    	return -1;
			    
		return s1.compareTo(s2);
	}

}
