package Sorting;
public class shellsort 
{
    public static void main(String [] args)
    {
       int[] array={10,54,0,-12,33,-22,45,99,-1,65};
       int len=array.length;
       for(int gap=len/2;gap>0;gap/=2)
       {
           for(int i=gap;i<len;i++)
           {
               int newelement=array[i];
               int j=i;
               while(j>=gap && array[j-gap]>newelement)
               {
                   array[j]=array[j-gap];
                   j-=gap;
               }
               array[j]=newelement;
           }
       }
       for(int i:array)
       {
           System.out.print(i+" ");
       }
    }
}
