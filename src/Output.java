import java.util.Date;


public class Output {
 public static void main(String []args)
 {
//	 double x=10000.0/3.0;
//	 System.out.println(x);
//	 System.out.printf("%8.2f", x);
//	 System.out.println();
//	 System.out.printf("%,.2f", x);
	 String name="zhangsan";
	 int age=19;
	 String message=String.format("Hello ,%s.Next year,you will be %d", name,age+1);
	 System.out.printf("%tD",new Date());//c 完整的日期和时间  ；F ISO8601 日期  ；D 美国格式的日期 ；T 24小时的时间
	 //r 12小时的时间 R 24小时没有秒 Y 四位数字的年 y 年后面的两位数字 C年前面的两位数字 B 月的完整拼写 b或者h 月的缩写 m 两位数字的月
	 //d 两位数字的日 前面补0 e两位数字的日 前面不补0 。。。。。
	 
 }
}
