
import java.util.Scanner;

public class binarysearch {
    static int binaryNumSearch(int numbers [], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int numbers[] = {11, 12, 13, 14, 15, 17, 64, 90};
        
        System.out.print("Enter a Key to Search the Dictionary: ");
        Scanner Sc = new Scanner(System.in);
        int key = Sc.nextInt();

        System.out.print("Index of Key " + key  + " is: "+ binaryNumSearch(numbers, key));

    }
}
