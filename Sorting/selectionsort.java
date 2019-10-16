
package Sorting;
public class selectionsort 
{
    public static void main(String[] args)
    {
       int[] array={20,30,90,0,10,-12,55,50,60,70};
       int len=array.length;
       for(int last=len-1;last>0;last--)
       {
           int largest=0;
           for(int i=1;i<=last;i++)
           {
               if(array[i]>array[largest])
               {
                   largest=i;
               }
           }
           swap(array,largest,last);
       }
       for(int i=0;i<len;i++)
       {
           System.out.print(array[i]+" ");
       }
    }   
    public static void swap(int[] array,int i,int j)
    {
        int temp;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
