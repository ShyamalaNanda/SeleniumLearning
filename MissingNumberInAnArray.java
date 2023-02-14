package week2.day2;

// Java program to find missing Number in
// a sorted array of size n and distinct
// elements.
import java.io.*;
public class MissingNumberInAnArray
{
    // Function to find missing number
    static int getMissingNo(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; i++)       
            if (a[i] != (i+1))
                return (i+1);
 
        // If all numbers from 1 to n
        // are present
        return n+1;
    }
       
    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1, 2,3, 4, 5, 6,8,9,10,11,12};
        System.out.println(getMissingNo(a));
    }
}
