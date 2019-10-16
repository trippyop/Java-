package arays;
public class secondlargest 
{
    public static void main(String [] args)
    {
        int[] arr={20,3,0,24,5,4};
        int len=arr.length;
        second(arr,len);
    }
    public static void second(int[] arr,int len)
    {
        int first,second;
        if(len<2)
        {
            System.out.println("invalid input");
            return;
        }
        first=second=Integer.MIN_VALUE;
        System.out.println(Integer.MAX_VALUE);
        for(int i=0;i<len;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first)
                second=arr[i];
        }
        if(second==Integer.MIN_VALUE)
        {
            System.out.println("there is no second largest no.");
        }
        else
        {
            System.out.println("this is second largest no."+second);
        }
    }
}
