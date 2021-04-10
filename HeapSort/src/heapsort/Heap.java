package heapsort;

import static java.lang.System.exit;
import java.util.ArrayList;
import static java.util.Collections.list;

public class Heap 
{
    public ArrayList<Integer> array = new ArrayList<>();
    
    public Heap()
    {
        
    }
    
    public void add(Integer x)
    {
        array.add(x);
        int currentIndex = array.size() - 1;
        
        while(currentIndex>0)
        {
            int parentIndex = (currentIndex-1)/2;
            if(array.get(currentIndex).compareTo(array.get(parentIndex)) > 0)
            {
                int temp = array.get(currentIndex);
                array.set(currentIndex,array.get(parentIndex));
                array.set(parentIndex , temp);
            }
            else
                break;
            
            currentIndex = parentIndex;
        }
    }
    
    public int remove()
    {
        if(array.size()==0)
        {
            System.out.println("The array is empty!");
            exit(1);
        }
        
        int removedObject = array.get(0);
        array.set(0,array.get(array.size()-1));
        array.remove(array.size()-1);
        
        int currentIndex = 0;
        
        while(currentIndex< array.size())
        {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex  + 2;
            
            if(leftChildIndex >= array.size())
                break;
            
            int maxIndex = leftChildIndex;
            
            if(rightChildIndex < array.size())
            {
                if(array.get(maxIndex).compareTo(array.get(rightChildIndex)) < 0)
                    maxIndex = rightChildIndex;
            }
            
            if(array.get(currentIndex).compareTo(array.get(maxIndex)) < 0)
            {
                int temp = array.get(maxIndex);
                
                array.set(maxIndex , array.get(currentIndex));
                array.set(currentIndex , temp);
                currentIndex = maxIndex;
            }
            else
                break;
        }
        
        return removedObject;
    }
    
    public int getSize()
    {
        return array.size();
    }
}
