package arays;
public class printevenoddseperately 
{
    public static void main(String [] args)
    {
        int a[] = {1, 20, 3, 40, 5, 0, 25, 14};
        int b[] = new int[10];
        int c[] = new int[10];
        int j = 0,k = 0;
        for (int i = 0; i < a.length; i++) 
        {
            
            if(a[i]%2==0)
            {
                b[j]=a[i];
                j++;
            }
            else
            {
                c[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
   
}
