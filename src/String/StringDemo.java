/**
 * String�������������ַ������
 * ��ô�����ṩ�˶����������ַ������в�����
 * �����Ĳ�������Щ��
 * 1����ȡ��
 *   1.1 �ַ����еİ������ַ�����Ҳ�����ַ�u���ĳ��ȡ�
 *     int length():��ȡ����.
 *   1.2 ����λ���ϵ�ĳ���ַ���
 *     char charAt(int index):
 *   1.3 �����ַ� ��ȡ���ַ����ַ�����λ�á�
 *     int indexof(int ch):���ص�ch���ַ����е�һ�γ��ֵ�λ�á�
 *     int indexof(int ch,int fromindex):��fromindexָ����λ�ÿ�ʼ��
 *    ��ȡch���ַ����г��ֵ�λ�á�
 *     int indexof(String str):���ص�str���ַ����е�һ�γ��ֵ�λ�á�
 *     int indexof(int ch,int fromindex):��fromindexָ����λ�ÿ�ʼ��
 *     int lastindexOf(int ch) �������󷵻ص�ch���ַ����е�һ�γ��ֵ�λ��
 *    ��ȡch���ַ����г��ֵ�λ�á�
 *      
 * 2���ж� 
 *   2.1�ַ������Ƿ����ĳһ���Ӵ���
 *       boolean contains(str): 
 *       ����֮����indexOf(str):��������str��һ�γ���λ�ã��������-1.��ʾ��str�����ַ����д���
 *       ���ԣ�Ҳ�������ڶ�ָ���ж��Ƿ������
 *       if(str.indexOf("aa"!=-1))
 *       ���Ҹ÷����ȿ����жϣ��ֿ��Ի�ȡ���ֵ�λ�á�
 *   2��2 �ַ������Ƿ������ݡ�
 *       boolean isEmpty():ԭ������жϳ����Ƿ�Ϊ�㡣
 *   2.3 �ַ����Ƿ�����ָ�����ݿ�ͷ
 *       boolean startswith(str);
 *   2.4 �ַ����Ƿ�����ָ�����ݽ�β��
 *       boolean endswith(str);
 *   2.5 �ж��ַ����������Ƿ���ͬ����д��Object���е�equals������
 *       boolean equals(str):
 *   2.6 �ж������Ƿ���ͬ�������Դ�Сд��
 *       boolean equalsIgnoreCase();    
 * 3ת��
 *   3.1 ���ַ�����ת���ַ�����
 *       ���캯����String(Char [])
 *             String (Char [],offset,count):���ַ������е�һ����ת���ַ�����
 *       ��̬������
 *             static String copyValue(char []);
 *             static String copyValue(char []data,offset,count);
 *             static String valueOf(Char []):     
 *   3.2 ���ַ���ת���ַ����顣
 *             char []toCharArray():
 *   3.3 ���ֽ�����ת���ַ�����
 *   String(byte [])
 *   String (byte [],offset,count):���ַ������е�һ����ת���ַ�����
 *   3.4 ���ַ���ת���ֽ����顣
 *            byte []getBytes();
 *   3.5 ��������������ת���ַ�����
 *         String valueOf(int)
 *         String valueOf(double); 
 *         3+""==String.valueOf(3);
 *         ���⣺�ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�
 *   3.6  �滻
 *       String replace(oldchar,new char); 
 *   5 �и�
 *   String [] split(regex);
 *   6 �Ӵ�����ȡ�ַ����е�һ����
 *   String subString(begin,end);
 *   7 ת��,ȡ���ո񣬱Ƚ�
 *   7.1 ���ַ���ת�ɴ�д����Сд.
 *   String toUpperCase();
 *   String toLowerCase();
 *   7.2 ���ַ������˵Ķ���ո�ȥ����
     String trim();
 *   7.3 �������ַ�����������˳��ıȽ�
 *    int compareTo(string);
 *   8 ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת,"abcdefg";abfecdcg
 *     ˼·��
 *     1.�������������
 *     2����ȡkk��һ�γ��ֵ�λ�á�
 *     3������ת����������ַ�����
 *     4��ֻҪ����ת�Ĳ��ֵĿ�ʼ�ͽ���λ����Ϊ�������ݼ��ɡ�
 *   9 ��ȡһ�� �ַ�������һ���ַ����г��ֵĴ�����
 *     "abkkcdkkefkkskk"
 *     ˼·��
 *     1�������������
 *     2�� ����kk��һ�γ��ֵ�λ�á�
 *     3���ӵ�һ�γ���λ��ʣ����ַ����м�����ȡkk���ֵ�λ�á�
 *     4������ȡ����ʱ��������ɡ�
 *   10 ��ȡ�����ַ����������ͬ�Ӵ�����һ�����������̵��Ǹ� �����г���һ�εݼ����Ӵ���ӡ��
 *    ��abcwerthelloyuiodef��
 *    "cvhellobnm"
 *   ˼·��
 *   1 ���̵��Ǹ��Ӵ����ճ��ȵݼ��ķ�ʽ��ȡ����
 *   2����û��ȡ�����Ӵ�ȥ�������ж��Ƿ������
 *      ����������Ѿ��ҵ���
 *      
 * */
package String;

public class StringDemo {
	/*
	 * ��ϰ2 ���ַ�����ת
	 * 1�����ַ����������
	 * 2�������鷴ת
	 * 3.������ת���ַ�����
	*/
	public static String reverseString(String s,int start,int end)
	{
		          //�ַ���������.
				char  []chs=s.toCharArray(); 
				//��ת����.
				reverse(chs,start,end);
				//���������ַ�����
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
		sop(s.substring(2));//��ָ��λ�ÿ�ʼ����β
		sop(s.substring(2,4));//����ͷ��������β��
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
		String s2=s.replace("java", "go");//���Ҫ�滻���ʷѺͲ����ڣ����صĻ���ԭ����
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
		//�ж��ļ������Ƿ���Array���ʿ�ͷ
		sop(str.startsWith("Array"));
		//�ж��ļ������Ƿ���.java���ʵ��ļ�������
		sop(str.endsWith(".java"));
		//�ж��ļ������Ƿ����Demo
		sop(str.contains("Demo"));
		
	}
	public static void method_get()
	{
		String str="abcdrfasdad";
		//����
		sop(str.length());
		//����������ȡ�ַ���
		sop(str.charAt(4));//�����ʵ��ַ����в����ڵĽǱ��»ᷢ��StringIndexOutOfBounds.
		//�����ַ���ȡ����
		sop(str.indexOf('a',3));//���û���ҵ�����-1.
		//��������һ���ַ����ֵ�λ�á�
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
//	  String s1="abc";//s1��һ�������ͱ�����"abc"��һ������
	   //�ַ��������ɫ��һ������ʼ���Ͳ����Ա��ı�.
//	  String s2=new String("abc");
//	  System.out.println(s1==s2);
	  //s1��s2��ʲô����
	  /*
	   * s1���ڴ�����һ������
	   * s2���ڴ�������������
	   * */
//	  System.out.println(s1.equals(s2));//String �ิд��Object����equals�������÷������ڶ����ַ����Ƿ���ͬ��
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
  
}
