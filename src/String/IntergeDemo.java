/*
 * �����������Ͷ����װ�ࡣ
 * byte Byte
 * short short 
 * int  Integer
 * long Long
 * boolean Boolean
 * float  Float
 * double Double
 * char Character
 * 
 * �����������Ͷ����װ����������,
 * �������ڻ����������ͺ��ַ�������֮���ת����
 * ������������ת���ַ�����
 *   ������������+"";
 *   �����������͡�toString(������������ֵ);
 *   �磺
 *   Integer��toString(34);//��34�������"34";
 * �ַ�������ת���ɻ�����������.
 *   XXX a=XXX.parseXXX(String);
 *   int a=Integer.parseInt("123");//���봫�����ָ�ʽ���ַ���
 *   double b=Double.parseDouble("123.42352");
 *   boolean b=Boolean.parseBoolean("true");
 *   Integer i=new Integer("123");
 *   int num=i.intValue();//�������
 *   ʮ����ת����������
 *    toBinaryString();
 *    toHexString();
 *    toOctalString();
 *    
 *    ��������ת��ʮ����
 *    parseInt(String,redix);
 * */
package String;

public class IntergeDemo {
  public static void main(String []args)
  {
	 //�������͵����ֵ
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
