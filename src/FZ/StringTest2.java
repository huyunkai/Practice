/*
 * 3获取一个字符串在另一个字符串中出现的次数。
 *   "ackkcdkkefkkskk" 
 *   思路：
 *   1 、定义个计数器
 *   2、获取kk第一次出现的位置。
 *   3、从第一次开始位置后剩余的字符串中继续获取kk出现的位置。
 *     每获取一次就计数一次
 *   4、当获取不到时，计数完成。
 *  4 获取两个字符串中最大相同子串，第一个动作：将短的那个串进行长度一次递减的子串打印
 *    "abcwerthelloyuiodef"
 *    "cvhellobnm"
 *    思路：
 *    1、将短的那个子串按照长度递减的方式获取到
 *    2、将没获取到的子串去长度中判断是否包含，
 *      如果包含，已经找到！。
 * */
package FZ;

public class StringTest2 {
  /*
   * 练习三.
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
//		String s="ackkcdkkefkkskk";//不建议使用切的使用
//		sop("count="+getCount2(s ,"kk"));
		String s1="abcwerthelloyuiodef";
		String s2="cvhellobnm";
		sop(getMaxSubString(s1, s2));
		
	}
	/*
	 * 联系三，方式二
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
		sop("max="+max+"。。。。"+"min="+min);
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
