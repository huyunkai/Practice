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
	  case 1: //�ӷ�����
		  System.out.println(a+b);
		  break;
	  case 2:  //��������
		  System.out.println(Math.abs(a-b));
		  break;
	  case 3:  //�˷�����
		  System.out.println(Math.abs(a*b));
		  break;
	  case 4:  //��������
		  if(b==0) {
		  System.out.println("��������Ϊ0!");
		  return;
		  }
		  else
		  {
			  double c=(double)(a/b);
		  System.out.println(c);
		  }
		  break;
	  case 5: //�˷�����
		  System.out.println(Math.pow(a, b));
		  break;
	default :
		System.out.println("�����ڴ����㣡");
		break;
	  }
       n--;
  }
}
}