import java.util.Scanner;


public class Switch {
  public static void main(String []args)
  {
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  while(n>0){
		  System.out.println("Select an option(1,2,3,4,5)");
		  int choice=in.nextInt();
		  int a=in.nextInt();
		  int b=in.nextInt();	  
	  switch(choice)
	  {
	  case 1: //加法运算
		  System.out.println(a+b);
		  break;
	  case 2:  //减法运算
		  System.out.println(Math.abs(a-b));
		  break;
	  case 3:  //乘法运算
		  System.out.println(Math.abs(a*b));
		  break;
	  case 4:  //除法运算
		  if(b==0) {
		  System.out.println("除数不能为0!");
		  return;
		  }
		  else
		  {
			  double c=(double)(a/b);
		  System.out.println(c);
		  }
		  break;
	  case 5: //乘方运算
		  System.out.println(Math.pow(a, b));
		  break;
	default :
		System.out.println("不存在此运算！");
		break;
	  }
       n--;
  }
}
}