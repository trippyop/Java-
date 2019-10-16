package Sorting;
public class quicksort 
{
     public static void main(String [] args)
    {
        int[] array={10,54,0,-12,33,-22,45,99,-1,65};
        quicksort(array,0,array.length);
         for(int i:array)
        {
            System.out.print(i+" ");
        }
    }
     public static void quicksort(int[] array,int start, int end)
     {
         if(end-start<2)
         {
             return;
         }
         else
         {
             int pivotindex=partition(array,start,end);
             quicksort(array,start,pivotindex);
             quicksort(array,pivotindex+1,end);      
         }
     }
     public static int partition(int[] array,int start, int end)
     {
         int pivot=array[start];
         int i=start;
         int j=end;
         while(i<j)
         {
             while(i<j && array[--j]>=pivot);
             if(i<j)
             {
                 array[i]=array[j];
             }
             while(i<j && array[++i]<=pivot);
             if(i<j)
             {
                 array[j]=array[i];
             }
         }
         array[j]=pivot;
         return j;
     }
}
