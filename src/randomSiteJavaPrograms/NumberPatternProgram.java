package randomSiteJavaPrograms;

public class NumberPatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i+1;j++)
			{
			System.out.print(num++ +" ");
			}System.out.println();	
		}
	}

}
