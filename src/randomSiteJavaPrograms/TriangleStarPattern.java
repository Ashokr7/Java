package randomSiteJavaPrograms;

public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =9;
		for (int i= count-1; i>=0 ; i--)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print(" *");
		}
		System.out.println("");
	}
}}
