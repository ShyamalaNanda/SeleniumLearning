package week2.day2;
public class ArrayIntersection {  
   
	public static void main(String args[]) {
	      int arr1[] = {2, 4, 6, 8, 9};
	      int arr2[] = {1, 3, 4, 5, 6, 8, 9};
	      int m = arr1.length;
	      int n = arr2.length;
	      int i = 0, j = 0;
	      System.out.println("Array 1: ");
	      for(int k = 0; k < m; k++) {
	         System.out.println(arr1[k] + " "); 
	      }
	      System.out.println(" ");
	      System.out.println("Array 2: ");
	      for(int k = 0; k < n; k++) {
	         System.out.println(arr2[k] + " ");
	      }
	      System.out.println("");
	      System.out.println("Intersection of two arrays is: ");
	      while (i < m && j < n) {
	         if (arr1[i] < arr2[j])
	            i++;
	         else if (arr2[j] < arr1[i])
	            j++;
	         else {
	            System.out.println(arr2[j++]+" ");
	            i++; 
	         }
	      }
	   } 
}  