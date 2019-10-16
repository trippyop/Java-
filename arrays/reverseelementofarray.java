package arays;
public class reverseelementofarray 
{
    public static void main(String[] args)
    {
        int[] array={10,20,30,40,50,60,70,80};
        int len=array.length;
        int i,j;
        for(i=0,j=len-1;i<len/2;i++,j--)
        {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
//        for(i=0,j=(len/2)-1;i<len/4;i++,j--)
//        {
//            int temp=array[i];    //1st half reverse logic
//            array[i]=array[j];
//            array[j]=temp;
//        }
        for(int p=0;p<array.length;p++)
        {
            System.out.print(array[p]+" ");
        }
        
        
    }
}
