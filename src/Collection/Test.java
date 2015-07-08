package Collection;

import java.util.Scanner;

public class Test {	
	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("是否进入二次方程的求解：Y/N");
		String answer=in.next();
		System.out.println("请输入你想进行几次计算：");
		int n=in.nextInt();
		System.out.println("你想计算的次数为："+n+"");
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
	    System.out.println("请按照以下提示进行：aX^2+bX+c=0:(Y/N)");
	    String f1=in.next();
	    if(f1.equals("Y"))
	    {
	    System.out.println("请输入a的值:");	
		float a=in.nextFloat();
		System.out.println("请输入b的值:");
		float b=in.nextFloat();
		 System.out.println("请输入c的值:");
		float c=in.nextFloat();
		System.out.println("你所得到的二元一次方程是:"+a+"X^2+"+b+"X+"+c+"=0:(Y/N)");
		String f2=in.next();
		if(f2.equals("Y"))
		{
			double disp=Math.pow(b, 2)-4*a*c;
			if(disp<0)
			{
				System.out.println("此方程无解！");
			}
			else
			{
				if(disp==0)
				{
					double X=b*1.0/(2*a);
					System.out.println("此方程的解为X1=X2="+X);
				}
				else
				{
					double sid=Math.sqrt(disp);
					double X1=(b-sid)/(2*a);
					double X2=(b+sid)/(2*a);
					System.out.println("此方程的解为X1="+X1);
					System.out.println("此方程的解为X2="+X2);
					
				}
			}
		}
	    }
	}
}