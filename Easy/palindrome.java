import java.util.*;

public class palindrome {

    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int currentdigits = x;
        int reversed = 0;

        while(x > 0){
            int digits = x%10;
            x/=10;
            if(reversed > Integer.MAX_VALUE /10 || reversed == Integer.MAX_VALUE /10 && digits > 7){
                return false;
            }
            reversed = reversed*10+digits;
        }
        System.out.println("Reversed number is: " + reversed);
        return reversed == currentdigits;
    }
    public static void main(String[] args){
        System.out.print("Enter a Number to Check if the Number is Palindrome or Not: ");
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();

        boolean result = isPalindrome(x);
        if(result == true){
            System.out.println("The Entered Number " + x + " is Palindrome: " + result);
        }else{
            System.out.println("The Entered Number " + x + " is not Palindrome: " + result);
        }
    }
}
