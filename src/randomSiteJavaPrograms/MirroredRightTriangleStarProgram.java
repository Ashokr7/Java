package randomSiteJavaPrograms;

public class MirroredRightTriangleStarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int rows =6;
        
        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
	}
}
