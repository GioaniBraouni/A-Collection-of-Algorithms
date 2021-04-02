/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Giannis
 */
public class MergeSort 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        int length = 100000;
        int i;
        
        int array[] = new int[length];
        int result[] = new int[length];
        
        System.out.println("Before Sorting");
    
        for(i = 0; i<length; i++)
        {
            array[i]=rand.nextInt(1000000+1);
            System.out.println("Element:"+(i+1)+" "+array[i]);
        }
       
        result = mergeSort(array);
        System.out.println();
        System.out.println("After Sorting");
        for(i = 0; i<length; i++)
        {
            System.out.println("Element:"+(i+1)+" "+result[i]);
        }
    }
    public static int [] mergeSort(int [] array)
    {
        //Recursive Control
        if(array.length <= 1)
        {
            return array;
        }
        
        int midpoint = array.length/2;
        
        //Left Side of Array
        int left[] = new int[midpoint];
    
        for(int i = 0; i < midpoint; i++)
        {
            left[i] = array[i];
        }
        
        //RightSide of Array
        int right[];
        if(array.length % 2 == 0)
            right = new int[midpoint];
        else
            right = new int[midpoint+1];
        
        for(int j = 0; j < right.length; j++)
        {
            right[j] = array[midpoint+j];
        }
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        int result [] = merge(left,right);
        
        return result;
    }
    
    private static int [] merge(int left[] , int right[])
    {
        int result [] = new int[left.length + right.length];
        
        int leftPointer , rightPointer , resultPointer;
        
        leftPointer = rightPointer = resultPointer = 0;
        
        while(leftPointer < left.length || rightPointer < right.length)
        {
            //Both elements in left and right array
            if(leftPointer < left.length && rightPointer < right.length)
            {
                if(left[leftPointer]<right[rightPointer])
                {
                    result[resultPointer++] = left[leftPointer++];
                }
                else
                {
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            //Only element in left array
            else if(leftPointer < left.length)
            {
               result[resultPointer++] = left[leftPointer++];
            }
            //Only element in right array
            else if(rightPointer < right.length)
            {
               result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
