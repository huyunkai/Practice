/*
 * JDK 1.5�汾�Ժ���ֵ������ԡ�
 * 
 * */
package String;

public class IntegerDemo2 {
     public static void method()
     {
    	 Integer x=4;//�Զ�װ�䡣//new Integer(4);
    	 x=x/*x.intValue()*/+2;//x+2;x �������Զ����䣬�����int���ͣ���2���мӷ����㡣
    	 //�ٽ��ͽ���װ�丶��x.
    	 sop(x);
    	 Integer m=128;
    	 Integer n=128; 
    	 sop("m==n:"+(m==n));
    	 Integer a=127;
    	 Integer b=127;
    	 sop("a==b:"+(a==b));//���Ϊtrue.��Ϊa��bָ����ͬһ��Integer����
    	  //��Ϊ��ֵ��byte��Χ���ݣ����������ԣ�����������Ѿ����ڣ��򲻻��ڿ����µĿռ䡣
     }
	public static void main(String []args)
   {
		method();
	   Integer x=new Integer(123);
	   Integer y=new Integer("123");
	   sop("x==y:"+(x==y));
	   sop("x.equals(y):"+x.equals(y));
   }
   public static void sop(Object obj)
   {
	   System.out.println(obj);
   }
}
