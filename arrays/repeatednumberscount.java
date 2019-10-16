package arays;
public class repeatednumberscount 
{
    public static void main(String [] args)
    {
        int[]array={10,20,10,50,50,9,20,10,10};
       for(int i=0;i<array.length-1;i++)
       {
          int count=1;
           for(int j=i+1;j<array.length;j++)
           {
               if(array[i]==0)
               {
                   continue;
               }
               if(array[i]==array[j])
               {
                   count++;
                   array[j]=0;
               }
                  
           }
           if(count>1)
           {
               System.out.println(array[i]+" "+count+" times");
           }
       }
    }
}
