package randomSiteJavaPrograms;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
		for (int k = 5; k > i; --k) {
		System.out.print(" ");
		}
		System.out.print("*");
		for (int j = 0; j < 2 * i - 1; j++) {
		System.out.print(" ");
		}
		if (i > 0) 
		{
		System.out.print("*");
		}
		System.out.println();
		}
		for(int i=5; i>=1; i--) 
		 {
	        for (int j = 5; j > i ; j--) 
	        {
	            System.out.print(" ");
	        }
	            System.out.print("*");
	            for (int k = 1-1; k < 2*(i -1) ;k++) {
	                System.out.print(" ");
	            }
	            if( i==1)
	                System.out.println(" ");
	            else
	                System.out.println("*");
	        }
			
		}
	}
		
	



/*
 * int rows =6; // old code for(int i=0;i<rows;i++) {System.out.print(" ");
 * if(i==5)System.out.print("*"+"\n"); } for(int j=0;j<rows;j++)
 * {System.out.print(" "); if(j==4 || j==5) System.out.print("*");
 * }System.out.println(); for(int k=0;k<=rows;k++) {System.out.print(" ");
 * if(k==3 || k==6) System.out.print("*"); }
 */