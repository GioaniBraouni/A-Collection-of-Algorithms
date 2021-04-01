package insertionsort;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random; 

public class InsertionSort 
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
            array.add(rand.nextInt(100000)+1);
            System.out.println("Element:"+(i+1)+" "+array.get(i));
        }

        System.out.println();
        
        int i, j, value;

        for (i = 0; i < length; i++) 
        {
            System.out.println("Comparing element:"+i);
           
            value = array.get(i);

            j = i;

            while (j > 0 && array.get(j-1) > value) 
            {
                  System.out.println("With element:"+j);
                  array.set(j,array.get(j-1));
                  j--;
            }
            
            array.set(j,value);
        }
        System.out.println();
        System.out.println("After Sorting");
        for(i = 0; i<length; i++)
        {
            array.add(rand.nextInt(1000)+1);
            System.out.println("Element:"+(i+1)+" "+array.get(i));
        }
    }
    
}

