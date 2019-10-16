package arays;

import java.util.Scanner;

public class deleteatposition 
{
    public static void main(String [] args)
    {
        int[] array={10,20,30,40,50,60,70};
        Scanner sc=new Scanner(System.in);
        int del=sc.nextInt();
        if(del>array.length)
        {
            System.out.print("please enter valid position ");
        }
        else
        {
            for (int i = del - 1; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        
        }
        
    }
}
