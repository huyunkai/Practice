/*
 * 3��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
 *   "ackkcdkkefkkskk" 
 *   ˼·��
 *   1 �������������
 *   2����ȡkk��һ�γ��ֵ�λ�á�
 *   3���ӵ�һ�ο�ʼλ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ�á�
 *     ÿ��ȡһ�ξͼ���һ��
 *   4������ȡ����ʱ��������ɡ�
 *  4 ��ȡ�����ַ����������ͬ�Ӵ�����һ�����������̵��Ǹ������г���һ�εݼ����Ӵ���ӡ
 *    "abcwerthelloyuiodef"
 *    "cvhellobnm"
 *    ˼·��
 *    1�����̵��Ǹ��Ӵ����ճ��ȵݼ��ķ�ʽ��ȡ��
 *    2����û��ȡ�����Ӵ�ȥ�������ж��Ƿ������
 *      ����������Ѿ��ҵ�����
 * */
package FZ;

public class StringTest2 {
  /*
   * ��ϰ��.
   *
   * */
	
	public static int getSubCount(String str,String key)
	{
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1)
		{
			str.substring(index+key.length());
			sop("str="+str);
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}
	
	public static void main(String []args)
	{
//		String s="ackkcdkkefkkskk";//������ʹ���е�ʹ��
//		sop("count="+getCount2(s ,"kk"));
		String s1="abcwerthelloyuiodef";
		String s2="cvhellobnm";
		sop(getMaxSubString(s1, s2));
		
	}
	/*
	 * ��ϵ������ʽ��
	 * */
	public static int getCount2(String str,String key)
	{
		int count=0;
		int index=0;
		while((index=str.indexOf(key,index))!=-1)
		{
			
			sop("index="+index);;
			index=index+key.length();
		    count++;
			
		}
		return count;
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static String getMaxSubString(String s1,String s2)
	{
		String max="",min="";
		max=(s1.length()>s2.length())?s1:s2;
		min= (max==s1)?s2:s1;
		sop("max="+max+"��������"+"min="+min);
		for(int x=0;x<min.length();x++)
		{
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++)
			{
				String temp=min.substring(y, z);
				//sop(temp);
				if(s1.contains(temp))//if(s1.indexOf(temp)!=-1)
					return temp;
			}
		}
		return "";
	}
	
}
