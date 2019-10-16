package arays;
import java.util.*;
public class Insertatposition
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements do you wanna store");
        int num=sc.nextInt();
        int array[]=new int[num];
        System.out.print("enter the number "+" ");
         for(int i=0;i<num;i++)
         {
             Scanner s=new Scanner(System.in);
             array[i]=s.nextInt();
         }
         System.out.println("enter the postion where you wanna insert and then value ");
         Scanner p=new Scanner(System.in);
         int pos =p.nextInt();
         int val=p.nextInt();
         for(int i=array.length-1;i>pos-1;i--)
         {
             array[i]=array[i-1];
             
         }
         array[pos-1]=val;
         for(int i=0;i<array.length;i++)
         {             
             System.out.print(array[i]+" ");
         }
    }
}
