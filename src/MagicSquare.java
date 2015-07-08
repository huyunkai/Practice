
public class MagicSquare {
 public static void main(String []agrs)
 {
	 int [][] magicsquare=
		 {
			 {16,3,2,13},
			 {5,10,11,8},
			 {9,6,7,12},
			 {4,15,14,1}
		 };
	 for(int i=0;i<magicsquare.length;i++)
	 {
		 for(int j=0;j<magicsquare.length;j++)
		 {
			 if(j==magicsquare.length-1)
			 System.out.print(magicsquare[i][j]);
			 else
				 System.out.print(magicsquare[i][j]+",");	 
		 }	
	 System.out.println();
	 }
 }
}
 