package Sorting;
public class mergesort
{
    public static void main(String [] args)
    {
        int[] array={10,54,0,-12,33,-22,45,99,-1,65};
        //int len=array.length;
        mergesort(array,0,array.length);
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }
    public static void mergesort(int[] array,int start,int end)
    {
        if(end-start<2)
        {
            return;
        }
        else
        {
            int mid=(start+end)/2;
            mergesort(array,start,mid);
            mergesort(array,mid,end);
            merge(array,start,mid,end);
        }
    }
    public static void merge(int[] array,int start,int mid,int end)
    {
        if(array[mid-1]<=array[mid])
        {
            return;
        }
        else
        {
            int i=start;
            int j=mid;
            int tempindex=0;
            int temp[]=new int[end-start];
            while(i<mid &&j<end)
            {
                temp[tempindex++]=array[i]<=array[j]?array[i++]:array[j++];
            }
            System.arraycopy(array,i,array,start+tempindex,mid-i);
            System.arraycopy(temp,0,array,start,tempindex);
        }
    }
}
