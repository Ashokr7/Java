package randomSiteJavaPrograms;

public class RightPascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int rows= 6;
   /*int decrease =6;
    for(int i=0; i<=rows; i++)
    {
    	for(int j=0;j<=i;j++)
    	{
    	for(int k=0;k<=j;k++)
    	{
    		if (k==j)System.out.print(" *");
    		
    	}
    	}System.out.println("");
    }
    {
    	for(int i=0; i<=decrease; i++)
    	{for(int j=0; j<=decrease;j++) {
    		for (int k=0;k<=j;k++)
    		{
    			if (k==j-i-1)System.out.print(" *");
    		}
    	}System.out.println("");
    }*/
            
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) 
            { 
            	System.out.print("*"+ " "); 
            	} 
            System.out.println(""); 
            } 
        for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        
	} // Successfull program Program number =9
}
}