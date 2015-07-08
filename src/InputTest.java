import java.io.Console;


/**
 * @author sony
 *
 */
public class InputTest {
  public static void main(String[]args)
  {
//	  Scanner in=new Scanner(System.in);
//	  //get first input
//	  System.out.println("What is your name?");
//	  String name=in.nextLine();
//	  //get second input
//	  System.out.println("How old are you!?");
//	  int age=in.nextInt();
//	  //display output on console
//	  System.out.println("hello,"+name+".this year,you will be "+age+".");
	  Console cons=System.console();
	  String username=cons.readLine("lisi");
	  if(username==null)
	  
	  {
		  System.out.println("username is not found!");
	  }
	  
	  char []passwd=cons.readPassword("Password: ");
	  //display output on console
	  System.out.println("Hello "+username+"your password is: "+passwd);
  }
}
