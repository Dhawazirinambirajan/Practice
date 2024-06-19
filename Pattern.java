import java.util.Scanner;
import java.util.Random;
public class Pattern {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
         /*
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("num is : "+num);

          */

        System.out.println("Right:Increasing triangle");
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Right:Decreasing triangle in Descending order");
        for(int i=0;i<num;i++)
        {
            for(int j=num-1;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Right:Decreasing triangle in ascending order");
        for(int i=0;i<num;i++)
        {
            int n = num-i;
            for(int j=0;j<n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Left:Increasing Triangle");
        for(int i=0;i<num;i++)
        {
            for(int j=num-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Left:Decreasing triangle in ascending order");
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            int n=num-i;
            for(int j=0;j<n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Left:Decreasing triangle in descending order");
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            int n=(num-1)-i;
            for(int j=n;j>=0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Right angle Triangle position : odd as 0 even as 1");
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((j%2==0)?"1":"0");
            }
            System.out.println();
        }

        System.out.println("Normal:Pyramid 1");
        for(int i=1;i<=num;i++)
        {
           for(int j=num-1;j>=i;j--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("1 ");
           }
            System.out.println();
        }

        System.out.println("odd : Pyramid 1");
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("1");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("1");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Diamond");
        for(int i=1;i<num;i++)
        {
            for(int j=i;j<num;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("1");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<num;j++)
            {
                System.out.print("1");
            }
            for(int j=i;j<=num;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }

        System.out.println("Right Arrow");
        for(int i=1;i<=((2*num)-1);i++)
        {
            if(i<=num) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1 ");
                }
            }
            else {
                for(int j=i;j<=((2*num)-1);j++){
                    System.out.print("1 ");
                }
            }
            System.out.println();

        }

    }
}
