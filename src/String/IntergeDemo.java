/*
 * 基本数据类型对象包装类。
 * byte Byte
 * short short 
 * int  Integer
 * long Long
 * boolean Boolean
 * float  Float
 * double Double
 * char Character
 * 
 * 基本数据类型对象包装类的最常见作用,
 * 就是用于基本数据类型和字符串类型之间的转换。
 * 基本数据类型转成字符串。
 *   基本数据类型+"";
 *   基本数据类型。toString(基本数据类型值);
 *   如：
 *   Integer。toString(34);//将34整数变成"34";
 * 字符串类型转换成基本数据类型.
 *   XXX a=XXX.parseXXX(String);
 *   int a=Integer.parseInt("123");//必须传入数字格式的字符串
 *   double b=Double.parseDouble("123.42352");
 *   boolean b=Boolean.parseBoolean("true");
 *   Integer i=new Integer("123");
 *   int num=i.intValue();//对象调用
 *   十进制转成其他进制
 *    toBinaryString();
 *    toHexString();
 *    toOctalString();
 *    
 *    其他进制转成十进制
 *    parseInt(String,redix);
 * */
package String;

public class IntergeDemo {
  public static void main(String []args)
  {
	 //整数类型的最大值
	 sop("int max:"+Integer.MAX_VALUE); 
	  String s="123";
	 sop(Long.parseLong(s));
	 sop(s);
	 Boolean b=Boolean.parseBoolean("false");
	 sop(b);
	 sop(b.TYPE);
	 sop(Integer.toBinaryString(-6));
	 String num=Integer.toBinaryString(60);
	 sop(num);
	 int kk=Integer.parseInt(num);
	 int mm=kk>>2;
      sop(mm);
	 sop(Integer.toBinaryString(mm));
	 int x=Integer.parseInt("3c",16);
	 sop("x="+x);
	 Integer i=new Integer("123");
	  int num2=i.intValue();
	  sop(num2);
	 
			 
	 
	 
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
}
