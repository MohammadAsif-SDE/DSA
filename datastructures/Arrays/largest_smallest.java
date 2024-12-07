package datastructures.Arrays;
import java.util.*;

public class largest_smallest {
     static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.print("Smallest is" + smallest);
        return largest;
    }    
    public static void main(String[] args) {
        int numbers[] = {2, 5, 6, 3, 9};
        System.out.println("Largest number is: " + getlargest(numbers));
    }
}
