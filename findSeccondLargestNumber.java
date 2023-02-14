package week2.day2;
import java.util.Arrays;

public class findSeccondLargestNumber {
	
public static void main(String args[]) throws InterruptedException{
	
	int []scores = {98,89,97,91,88};
	int length = scores.length;
	
	System.out.println("The length of the array :"+length);
	
	//Sort an Array
	
	Arrays.sort(scores);
	
	//Find the Minimum value of this array
	
	System.out.println("The Minimum value in the array :"+scores[0]);
	
	//Find the Maximum value of this array
	
	System.out.println("The Maximum value in the array :"+scores[scores.length-1]);
	
	
	//Find the second Largest value of this array
	
	System.out.println("The Second Largest value in the array :"+scores[scores.length-2]);
	
		
		
}

}
