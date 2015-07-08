/*
 * JDK 1.5版本以后出现的新特性。
 * 
 * */
package String;

public class IntegerDemo2 {
     public static void method()
     {
    	 Integer x=4;//自动装箱。//new Integer(4);
    	 x=x/*x.intValue()*/+2;//x+2;x 进行了自动拆箱，变成了int类型，和2进行加发运算。
    	 //再将和进行装箱付给x.
    	 sop(x);
    	 Integer m=128;
    	 Integer n=128; 
    	 sop("m==n:"+(m==n));
    	 Integer a=127;
    	 Integer b=127;
    	 sop("a==b:"+(a==b));//结果为true.因为a和b指向了同一个Integer对象。
    	  //因为当值在byte范围内容，对于新特性，如果该数组已经存在，则不会在开辟新的空间。
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
