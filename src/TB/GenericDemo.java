/*
 * ���ͣ�JDK1.5�汾�Ժ���������ԡ����ڽ����ȫ���⣬��һ����ȫ���ơ�
 * �ô���
 * 1��������ʱ�ڳ�������ClassException��ת�Ƶ��˱���ʱ�ڡ�
 * �����ڳ���Ա������⡣������ʱ��������ٰ�ȫ
 * 2��������ǿ��ת�����鷳��
 * */
package TB;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
  public static void main(String []args)
  {
	  ArrayList<String> a1=new ArrayList<String>();//String���͵ļ��϶���ʱֱ�Ӷ�����������
	  a1.add("abc01");
	  a1.add("abc02");
	  a1.add("abc03");
	  Iterator<String> it=a1.iterator();
	  while(it.hasNext())
	  {
		  //��ӡԪ�صĳ���
		  String s=it.next();
		  System.out.println(s+":"+s.length());
	  }
  }
}
