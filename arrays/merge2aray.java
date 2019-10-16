package arays;

import java.util.Arrays;

public class merge2aray 
{
    public static void main(String [] args)
    {
        int a[]={20,60,80,90};
        int b[]={10,40,50,65};
        int c_len=a.length+b.length;
        int c[]=new int[c_len];
        
        for(int i=0,j=0;i<a.length && j<b.length;i++,j++)
        {
            c[i]=a[i];
            c[a.length+j]=b[j];
        }
        Arrays.sort(c);
        
//        System.arraycopy(a,0,c,0,a.length);
//        System.arraycopy(b,0,c,a.length,b.length); 
       
        for(int i:c)
        {
            System.out.print(i+" ");
        }
        
    }
}
