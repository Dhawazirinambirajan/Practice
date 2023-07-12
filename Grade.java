import java.util.*;
class Grade{
	public static void main(String args[])
	{
		int n,rem=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.of.students :" );
		n = s.nextInt();
		int marks[] = new int[n];
		int mark_updated[]=new int[n];
		for(int i=0;i<n;i++)
		{
			marks[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		  if(marks[i]>=38)
		  {
			 if(marks[i]%5==0)
			 {
				mark_updated[i]=marks[i];
			 }
			 else
			 {
				rem=marks[i]%5;
				System.out.print("\nrem : "+rem);
				if(rem>=3)
				{
					mark_updated[i]=marks[i]+(5-rem);
				}
				else{
					mark_updated[i]=marks[i];
				}
			 }
		  }		
		  else
		  {
			  mark_updated[i]= marks[i];
		  }
		}
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("\n"+mark_updated[i]);
		 }
	}
}
		