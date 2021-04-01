package bubblesort;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random; 

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter the length of the elements you want to sort");
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        
        ArrayList<Integer> array = new ArrayList<>();
        
        Random rand = new Random();
        
        System.out.println("Before Sorting");
        for(int i = 0; i<length; i++)
        {
            array.add(rand.nextInt(1000000)+1);
            System.out.println("Element:"+(i+1)+" "+array.get(i));
        }
        System.out.println();
        int i , j , k;
        for(k = 0; k<length - 1; k++)
        {
            boolean flag = false;
            for(i = 0; i<length-k-1; i++)
            {
                if(array.get(i)>array.get(i+1))
                {
                    int tmp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1,tmp);
                    flag = true;
                }
            }
            System.out.println();
            if(flag == false)
            {
                System.out.println("The array is already sorted , exiting...");
                break;
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("After Sorting");
        for(i = 0; i<length; i++)
        {
            System.out.println("Element:"+(i+1)+" "+array.get(i));
        }
    }
}
