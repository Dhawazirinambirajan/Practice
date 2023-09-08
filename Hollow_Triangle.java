import java.util.*;
public class Hollow_Triangle {
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        for(int i=1;i<=rows;i++) {
            //trailing space
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            //first star in first row
            if (i == 1)
              System.out.print("*");
            //last row
            else if (i == rows) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("* ");
                }
            }
            //middle part
            else {
                  System.out.print("* ");
				  for(int j=1;j<i-1;j++)
				  {
					  System.out.print("  ");
                 }
				System.out.print("*");
            }
            System.out.println();
        }
    }
}
