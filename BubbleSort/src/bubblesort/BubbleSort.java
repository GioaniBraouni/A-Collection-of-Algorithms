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
            array.add(length-1);
            System.out.println("Element:"+(i+1)+" "+array.get(i));
        }
        System.out.println();
        int i , j , k;
        for(k = 0; k<length - 1; k++)
        {
            for(i = 0; i<length-1; i++)
            {
                System.out.println("Comparing element:"+i+" with element " + (i+1));
                if(array.get(i)>array.get(i+1))
                {
                    System.out.println(array.get(i)+ " is greater than " + array.get(i+1));
                    int tmp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1,tmp);
                }
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
