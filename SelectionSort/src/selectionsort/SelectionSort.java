package selectionsort;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SelectionSort 
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
        
        for(int i = 0; i<length-1; i++)
        {
            int min_index = i;
            //array.get(i);
            System.out.println("Comparing element:"+(i+1));
            for(int j = i+1; j<length; j++)
            {
                System.out.println("With element:"+(j+1));
                if(array.get(j)<array.get(min_index))
                {
                    min_index = j;
                    System.out.println("Value of:"+array.get(j)+" is less than " + array.get(i));
                }
            }
            System.out.println();
            System.out.println("Swapping "+array.get(min_index)+" with " + array.get(i));
            System.out.println();
            int tmp = array.get(min_index);
            array.set(min_index, array.get(i));
            array.set(i, tmp);
        }
        System.out.println("After Sorting");
        for(int i = 0; i<length; i++)
        {
            array.add(rand.nextInt(1000)+1);
            System.out.println("Element:"+(i+1)+" "+array.get(i));
        }
        
        
    }
    
}
