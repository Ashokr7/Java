package randomSiteJavaPrograms;

public class DiamondNumberPatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,inc=2,num=1;
		//First
		for(i=0;i<6;i++)    {
		for(j=i;j<=5;j++)   {
			 System.out.print(" ");}
		     System.out.print(num +" "); 
	    if(i!=0)for(k=0;k<1*i;k++){
	    	 System.out.print(inc++ +" ");}
		     System.out.println();}
		//Sec	
		for(i=6;i>=0;i--){
		for(j=5;j>i-1;j--){
			 System.out.print(" ");}
		     System.out.print(num +" "); 
	    if(i!=0)for(k=1*i;k>0;k--) {
		    System.out.print(inc++ +" ");}
		    System.out.println();
	}
	}}

