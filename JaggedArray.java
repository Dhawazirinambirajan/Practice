import java.util.*;
class JaggedArray
{
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.of.rows : ");
		n = s.nextInt();
		String cse[][] = new String[n][];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter the size of "+i+" row : ");
			int j = s.nextInt();
			cse[i]= new String[j];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<cse[i].length;j++)
			{
			 cse[i][j]=s.next();
			}
		}
		System.out.print("The Array is : \n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<cse[i].length;j++)
			{
			 System.out.print(cse[i][j]+" ");
			}
			System.out.println();
		}
	}
}