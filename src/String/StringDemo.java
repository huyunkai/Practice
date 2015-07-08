/**
 * String类适用于面熟字符串事物。
 * 那么它就提供了读个方法对字符串进行操作。
 * 常见的操作有哪些：
 * 1、获取。
 *   1.1 字符串中的包含的字符数，也就是字符u串的长度。
 *     int length():获取长度.
 *   1.2 根据位置上的某个字符。
 *     char charAt(int index):
 *   1.3 根据字符 获取该字符在字符串中位置。
 *     int indexof(int ch):返回的ch在字符串中第一次出现的位置。
 *     int indexof(int ch,int fromindex):从fromindex指定的位置开始，
 *    获取ch在字符串中出现的位置。
 *     int indexof(String str):返回的str在字符串中第一次出现的位置。
 *     int indexof(int ch,int fromindex):从fromindex指定的位置开始，
 *     int lastindexOf(int ch) 从右往左返回的ch在字符串中第一次出现的位置
 *    获取ch在字符串中出现的位置。
 *      
 * 2、判断 
 *   2.1字符串中是否包含某一个子串。
 *       boolean contains(str): 
 *       特殊之处：indexOf(str):可以索引str第一次出现位置，如果返回-1.表示该str不在字符串中存在
 *       所以，也可以用于对指定判断是否包含。
 *       if(str.indexOf("aa"!=-1))
 *       而且该方法既可以判断，又可以获取出现的位置。
 *   2。2 字符串中是否有内容。
 *       boolean isEmpty():原理就是判断长度是否为零。
 *   2.3 字符串是否是以指定内容开头
 *       boolean startswith(str);
 *   2.4 字符串是否是以指定内容结尾。
 *       boolean endswith(str);
 *   2.5 判断字符串的内容是否相同。复写了Object类中的equals方法。
 *       boolean equals(str):
 *   2.6 判断内容是否相同，并忽略大小写。
 *       boolean equalsIgnoreCase();    
 * 3转换
 *   3.1 将字符数组转成字符串。
 *       构造函数：String(Char [])
 *             String (Char [],offset,count):将字符数组中的一部分转成字符串。
 *       静态方法：
 *             static String copyValue(char []);
 *             static String copyValue(char []data,offset,count);
 *             static String valueOf(Char []):     
 *   3.2 将字符串转成字符数组。
 *             char []toCharArray():
 *   3.3 将字节数组转成字符串。
 *   String(byte [])
 *   String (byte [],offset,count):将字符数组中的一部分转成字符串。
 *   3.4 将字符串转成字节数组。
 *            byte []getBytes();
 *   3.5 将基本数据类型转成字符串。
 *         String valueOf(int)
 *         String valueOf(double); 
 *         3+""==String.valueOf(3);
 *         特殊：字符串和字节数组在转换过程中，是可以指定编码表的。
 *   3.6  替换
 *       String replace(oldchar,new char); 
 *   5 切割
 *   String [] split(regex);
 *   6 子串。获取字符串中的一部分
 *   String subString(begin,end);
 *   7 转换,取出空格，比较
 *   7.1 将字符串转成大写或者小写.
 *   String toUpperCase();
 *   String toLowerCase();
 *   7.2 将字符串两端的多个空格去除。
     String trim();
 *   7.3 将两个字符串进行子让顺序的比较
 *    int compareTo(string);
 *   8 将字符串进行反转。将字符串中指定部分进行反转,"abcdefg";abfecdcg
 *     思路：
 *     1.定义个计数器。
 *     2，获取kk第一次出现的位置。
 *     3，将反转后的数组变成字符串。
 *     4，只要将或反转的部分的开始和结束位置作为参数传递即可。
 *   9 获取一个 字符串在另一个字符串中出现的次数。
 *     "abkkcdkkefkkskk"
 *     思路：
 *     1，定义个计数器
 *     2， 定义kk第一次出现的位置。
 *     3，从第一次出现位置剩余的字符串中继续获取kk出现的位置。
 *     4，当获取不到时，计数完成。
 *   10 获取两个字符串中最大相同子串。第一个动作：将短的那个 串进行长度一次递减的子串打印。
 *    “abcwerthelloyuiodef”
 *    "cvhellobnm"
 *   思路：
 *   1 将短的那个子串按照长度递减的方式获取到。
 *   2、将没获取到的子串去长度中判断是否包含。
 *      如果包含，已经找到！
 *      
 * */
package String;

public class StringDemo {
	/*
	 * 练习2 将字符串反转
	 * 1、将字符串变成数组
	 * 2、对数组反转
	 * 3.将数组转成字符串。
	*/
	public static String reverseString(String s,int start,int end)
	{
		          //字符串变数组.
				char  []chs=s.toCharArray(); 
				//反转数组.
				reverse(chs,start,end);
				//将数组变成字符串。
				return new String(chs);
		
	}
	public static String reverseString(String s)
	{
		return reverseString(s, 0, s.length());
	}
	public static void reverse(char [] arr,int x,int y)
	{
		for(int start=x ,end=y-1 ;start<end;start++,end--)
		{
			swap(arr,start,end);
		}
	} 
	public static void swap(char []arr,int x,int y)
	{
		char temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		
	}
	public static void method_7()
	{
		String s="  Hello java";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		sop(s.trim());
		String s1="abc";
		String s2="aaa";
		sop(s1.compareTo(s2)); 
		}
	public static void method_sub()
	{
		String s="abcde";
		sop(s.substring(2));//从指定位置开始到结尾
		sop(s.substring(2,4));//包含头，不包含尾。
		sop(s.substring(0, s.length()));
	}
	public static void method_split()
	{
		
		String s="zhangsan,lisi,wangwu";
		String []str={s.substring(0, 8),s.substring(9, 13),s.substring(14, s.length())};
		
		//String  []arr=s.split(",");
		for(int x=0;x<str.length;x++)
		{
			sop(str[x]);
			}
	}
	public static void method_replace()
	{
		String s="hello java";
		String s1=s.replace('a', 'h');
		String s2=s.replace("java", "go");//如果要替换的资费和不存在，返回的还是原串。
		sop(s);
		sop(s1);
		sop(s2);
	}
	public static void method_trans()
	{
		char []str={'a','b','c','d','e','f'};
		String s=new String(str,1,3);
		sop("s="+s);
		String s1="zxfdsfs";
		char []chs=s1.toCharArray();
		for(int x=0;x<chs.length;x++)
		{
			sop("ch="+chs[x]);
		}
	}
	public static void method_is()
	{
		String str="ArrayDemo.java";
		//判断文件名称是否是Array单词开头
		sop(str.startsWith("Array"));
		//判断文件名称是否是.java单词的文件结束。
		sop(str.endsWith(".java"));
		//判断文件名中是否包含Demo
		sop(str.contains("Demo"));
		
	}
	public static void method_get()
	{
		String str="abcdrfasdad";
		//长度
		sop(str.length());
		//根据索引获取字符。
		sop(str.charAt(4));//当访问到字符串中不存在的角标事会发生StringIndexOutOfBounds.
		//根据字符获取索引
		sop(str.indexOf('a',3));//如果没有找到返回-1.
		//反向索引一个字符出现的位置。
		sop(str.lastIndexOf('a'));
	}
  public static void main(String []args)
  {
	  String s="  ab  cd  ";
	  sop("("+s+")");
	  sop("("+reverseString(s)+")");
	 //method_7();
	  // method_sub();
	 // method_split();
	  //method_replace();
	 //method_trans();
//	  String s1="abc";//s1是一个类类型变量，"abc"是一个对象。
	   //字符串最大特色：一旦被初始化就不可以被改变.
//	  String s2=new String("abc");
//	  System.out.println(s1==s2);
	  //s1和s2有什么区别
	  /*
	   * s1在内存中有一个对象
	   * s2在内存中有两个对象
	   * */
//	  System.out.println(s1.equals(s2));//String 类复写了Object类中equals方法，该方法用于段胖字符串是否相同。
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
  
}
