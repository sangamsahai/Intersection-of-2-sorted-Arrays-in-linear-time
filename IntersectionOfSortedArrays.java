/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ssahai
 */
import java.util.*;

public class IntersectionOfSortedArrays {
    
    public static ArrayList<Integer> findIntersection(int[] array1 , int[] array2)
    {
        //Validation
        if(array1.length==0 || array2.length==0)
        {
            System.out.println("One of the Arrays is empty !!");
            System.exit(0);
        }
        
        int pointer1 =0;
        int pointer2=0;
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        boolean arrayIndexWithinBounds=true;
        
        while(arrayIndexWithinBounds==true)
        {
            if(array1[pointer1] > array2[pointer2])
            {
                pointer2 ++;
            }
            else  if(array1[pointer1] < array2[pointer2])
            {
                pointer1 ++;
            }
            else
            {
             intersection.add(array1[pointer1]);
             pointer1++;
             pointer2++;
            }
            
            if(pointer1 == array1.length || pointer2== array2.length)
            {
                arrayIndexWithinBounds=false;
            }
        }
        
       return intersection;
    }
    
    public static void main (String[] Args)
    {
       int[] arr1=new int[]{1,8,10,15,25};
       int[] arr2=new int[]{8,9,10,14,15,17,24}; 
       ArrayList<Integer> intersection=findIntersection(arr1,arr2);
       
       for(int i=0;i<intersection.size();i++)
       {
           System.out.println(intersection.get(i));
       }
       
    }
    
}
