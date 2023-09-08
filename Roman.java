import java.util.*;
class Roman
{
	static int value(char c)
	{
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C') 
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		else
			return -1;
	}
		
  public static void main(String args[])
  {
	  Scanner s = new Scanner(System.in);
	  int res=0;
	  System.out.println("Input:");
	  String input = s.next();
	  for(int i=0;i<input.length();i++)
	  {
		  int s1 = value(input.charAt(i));
		  if(i+1 < input.length())
		  {
			  int s2 = value(input.charAt(i+1));
			  if(s1>=s2)
				  res+=s1;
			  else
				  res-=s1;
		  }
		  else
		  {
			  res+=s1;
		  }
	  }
	  System.out.println("Output:");
	  System.out.println("The value is: "+res);
  }
}