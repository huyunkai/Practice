package Collection;

import java.util.Scanner;

public class Test {	
	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("�Ƿ������η��̵���⣺Y/N");
		String answer=in.next();
		System.out.println("������������м��μ��㣺");
		int n=in.nextInt();
		System.out.println("�������Ĵ���Ϊ��"+n+"");
		if(answer.equals("Y"))
		{
			while(n>0)
			{
			pow2();
			n--;
			}
		}
	}
	public static void pow2()
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("�밴��������ʾ���У�aX^2+bX+c=0:(Y/N)");
	    String f1=in.next();
	    if(f1.equals("Y"))
	    {
	    System.out.println("������a��ֵ:");	
		float a=in.nextFloat();
		System.out.println("������b��ֵ:");
		float b=in.nextFloat();
		 System.out.println("������c��ֵ:");
		float c=in.nextFloat();
		System.out.println("�����õ��Ķ�Ԫһ�η�����:"+a+"X^2+"+b+"X+"+c+"=0:(Y/N)");
		String f2=in.next();
		if(f2.equals("Y"))
		{
			double disp=Math.pow(b, 2)-4*a*c;
			if(disp<0)
			{
				System.out.println("�˷����޽⣡");
			}
			else
			{
				if(disp==0)
				{
					double X=b*1.0/(2*a);
					System.out.println("�˷��̵Ľ�ΪX1=X2="+X);
				}
				else
				{
					double sid=Math.sqrt(disp);
					double X1=(b-sid)/(2*a);
					double X2=(b+sid)/(2*a);
					System.out.println("�˷��̵Ľ�ΪX1="+X1);
					System.out.println("�˷��̵Ľ�ΪX2="+X2);
					
				}
			}
		}
	    }
	}
}