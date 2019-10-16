package arays;

import java.util.Scanner;

public class decimal2binary 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that need to be converted ");
        int num=sc.nextInt();
        convert(num); 
    }
    private static void convert(int num)
    {
        int array[]=new int[10];
        int i;
        for( i=0;num!=0;i++)
        {
            int rem=num%2;
            array[i]=rem;
            num=num/2;
        }
        
        for(i=i-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}
