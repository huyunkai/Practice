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
	 System.out.printf("%tD",new Date());//c ���������ں�ʱ��  ��F ISO8601 ����  ��D ������ʽ������ ��T 24Сʱ��ʱ��
	 //r 12Сʱ��ʱ�� R 24Сʱû���� Y ��λ���ֵ��� y ��������λ���� C��ǰ�����λ���� B �µ�����ƴд b����h �µ���д m ��λ���ֵ���
	 //d ��λ���ֵ��� ǰ�油0 e��λ���ֵ��� ǰ�治��0 ����������
	 
 }
}
