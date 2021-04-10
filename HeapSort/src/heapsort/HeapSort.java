package heapsort;

import java.util.ArrayList;
import java.util.Random;

public class HeapSort 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 0; i<5000000; i++)
        {
            array.add(rand.nextInt(1000000+1));
        }
        
        Heap heap = new Heap();
        
        System.out.println("Before Sorting");
        
        for(int i =0; i<array.size(); i++)
        {
            System.out.println(array.get(i));
        }
        
        for(int i =0; i<array.size(); i++)
        {
            heap.add(array.get(i));
        }
        
        for(int i =0; i<array.size(); i++)
        {
            array.set(i, heap.remove());
        }
        System.out.println();
        System.out.println("After Sorting");
        
        for(int i =0; i<array.size(); i++)
        {
            System.out.println(array.get(i));
        }
        
        
    }
    
}
