package randomSiteJavaPrograms;

public class LeftTrianglePascals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		
	//First iteration
		    for (int i=1; i<= rows ; i++)
	     	{
            for (int j=i; j<rows ;j++) 
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) 
            { 
            	System.out.print("*"); 
            }
                System.out.println(""); 
                
	//Second iteration 
	        }
		    for (int i=rows; i>=1; i--)
            {
            for(int j=i; j<=rows;j++)
            {
                 System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                 System.out.print("*");
          	}
                 System.out.println("");
	}
}
}
