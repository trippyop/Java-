package seaching;
public class binarysearch 
{
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(binarysearch(array,1));
        System.out.println(binarysearch(array,0));
        System.out.println(binarysearch(array,4));
    }
    public static int binarysearch(int[] array,int value)
    {
        int start=0;
        int end=array.length;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(array[mid]==value)
            {
                return mid;
            }
            else if(array[mid]<value)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return -1;
    }
}

