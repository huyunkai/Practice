/*
 * ��--Set:Ԫ���������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ�.
 *    ��--HashSet:�ײ����ݽṹ�ǹ�ϣ��
 *       HashSet����α�֤Ԫ��Ψһ�Ե��أ�
 *       ��ͨ��Ԫ�ص�����������HashCode��equals����ɡ�
 *       ���Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
 *       ���Ԫ�ص�Hashcodeֵ��ͬ���������equals.
 *  
 *    !--TreeSet:
 * Set���ϵĹ��ܺ�Collection��һ�µġ�
 * 
 * */

package Single;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
//		Person p=new Person("NB",11);
//		Person p1=new Person("NB2",12);
//		sop(p);
//		sop(p1);
		HashSet hs=new HashSet();
		hs.add("java01");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
