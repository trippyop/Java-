package seaching;
public class linear 
{
   public static void main(String[] args)
   {
       int[] array={1,5,0,-12,3,-22,45,99,-1,65};
       
       System.out.println(linearsearch(array,45));
   }
   public static int linearsearch(int[] array,int value)
   {
       for(int i=0;i<array.length;i++)
       {
           if(array[i]==value)
           {
               return i;
           }
       }
       return -1;
   }
}
