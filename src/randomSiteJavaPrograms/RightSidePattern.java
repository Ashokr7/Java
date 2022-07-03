package randomSiteJavaPrograms;

public class RightSidePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int left =6;
		
		for (int i=0; i<left;i++) 
		  {
			for (int j=2*left-i; j>i; j--)
			{
				System.out.print(" ");
			}
				for (int j=0; j<=i; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			
		}
		
	//Program number = 4
	}
