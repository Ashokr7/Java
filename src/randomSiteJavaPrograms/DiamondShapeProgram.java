package randomSiteJavaPrograms;

public class DiamondShapeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, i, j, space = 1;
		 /*System.out.print("Enter the number of rows: ");
		              Scanner s = new Scanner(System.in);
		               n = s.nextInt();
		               space = n - 1;*/
		space = n -1; //n=13
		for (j = 1; j<= n; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space--;
		for (i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print(i);
		}
		System.out.println("");
		}
		space = 1;
		for (j = 1; j<= n - 1; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space++;
		for (i = 1; i<= 2 * (n - j) - 1; i++)
		{
		System.out.print(i);
		}
		System.out.println("");
		}
		}
		}

//Program num =5