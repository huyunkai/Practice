package package2;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class EnumTest {
  public static void main(String []args)
  {
	  Scanner in=new Scanner(System.in);
	  System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
	  String input =in.next().toUpperCase();
	 Size size=Enum.valueOf(Size.class,input);
	 System.out.println("size="+size);
	 System.out.println("abbreviation="+size.getAbbreviation());
	 if(size==size.EXTRA_LARGE)
	 {
		 System.out.println("Good job--you paid attention to the_.");
	 }
  }

}
