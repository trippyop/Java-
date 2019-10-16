
package Sorting;
public class insertionsort
{
    public static void main(String[] args) 
    {
       int[] array={20,30,90,0,10,-12,55,50,60,70};
       int len=array.length;
       for(int first=1;first<len;first++)
       {
           int newelement=array[first];
           int i;
           for(i=first;i>0 && array[i-1]>newelement;i--)
           {
               array[i]=array[i-1];
           }
           array[i]=newelement;
       }
       for(int i=0;i<len;i++)
       {
           System.out.print(array[i]+" ");
       }
       
    }
}
