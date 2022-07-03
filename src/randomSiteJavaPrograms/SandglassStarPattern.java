package randomSiteJavaPrograms;

public class SandglassStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		//First Iteration
		for(int i=0;i<=rows-1;i++)
		{
		for(int j=0; j<i;j++)
		{
	        System.out.print(" ");
		}
		for(int k=i;k<=rows-1;k++)
		{
			System.out.print("*" + " ");
		}   System.out.println(""); 
		} 
		//Second Iteration
		for(int i= rows-1; i>= 0; i--)
        {
		for(int j=0; j< i ;j++)
        {
            System.out.print(" ");
        }
        for (int k=i; k<=rows-1; k++)
        {
            System.out.print("*" + " ");
        }
            System.out.println("");
		
	
	}
	}
}
