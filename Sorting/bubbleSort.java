
package Sorting;
public class bubbleSort 
{
    public static void main(String[] args) 
    {
        int[] array={50,20,90,10,0,-45,80,55,-5};
        int len=array.length;
        for(int last=len-1;last>0;last--)
        {
            for(int i=0;i<last;i++)
            {
                if(array[i]>array[i+1])
                {
                    swap(array,i,i+1);
                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
    public static void swap(int[] array,int i,int j)
    {
//        if(i==j)
//        {
//            return;
//        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        
    }
    
}
