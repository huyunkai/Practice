/*
 * ��ϰ��
 * "sdhdjifkakfaasfsa"��ȡ���ַ����е���ĸ���ֵĴ�����
 * ϣ����ӡ�����a(1)c(2)����������
 * ͨ�����֣�ÿһ����ĸ���ж�Ӧ�Ĵ�����
 * ˵����ĸ�ʹ���֮�䶼��ӳ���ϵ��
 * ע���ˣ���������ӳ���ϵʱ������ѡ��map����.
 * ��Ϊmap�����д�ž���ӳ���ϵʱ����Ҫ���뵽map���ϡ�
 * ˼·��
 * 1�����ַ���ת�����ַ����飬��ΪҪ��ÿһ����ĸ���в�����
 * 2������һ��map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��treemap���ϡ�
 * 3�������ַ����顣
 *  	��ÿһ����ĸ��Ϊ��ȥ��map���ϡ�
 *  	�������null��������ĸ��1���뵽map�����С�
 *  	������ز���null,˵������ĸ��map�����Ѿ����ڲ��ж�Ӧ������
 *  	��ô�ͻ�ȡ�ô���������������Ȼ�󽭸���ĸ��������Ĵ������뵽map�����С�
 *  4,��map�����е����ݱ��ָ�����ַ�����ʽ���ء�
 * */
package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class MapTest3 {
	public static void main(String []args)
	{
	
		String s=CharCount("sdafasvdsabjfasi213");
		sop(s);
	}
	public static String CharCount(String str)
	{
		char[]chs=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character, Integer>();
		
		for(int x=0;x<chs.length;x++)
		{
			int count=0;
			if(!(chs[x]>='a' &&chs[x]<='z' ||chs[x]>='A'&&chs[x]<='Z'))
                continue;
	            Integer value=tm.get(chs[x]);
	            if(value!=null)
	            	count=value;
	            count++;
	            tm.put(chs[x], count);
//	            }
//	            	{
//	            	tm.put(chs[x], 1);
//	            }
//	            else
//	            {
//	            	value=value+1;
//	            	tm.put(chs[x], value);
//	            }
	            	            	
		}
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<Character, Integer>>entrySet=tm.entrySet();
		Iterator<Map.Entry<Character, Integer>>it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer>mp=it.next();
			Character ch=mp.getKey();
			Integer value=mp.getValue();
			sb.append(ch+"("+value+")");
		}
		return sb.toString();
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
