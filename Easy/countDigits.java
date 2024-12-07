import java.util.*;

public class countDigits {
    static int digitcnt(int n){
        int cnt = 0;
        int originalNumber = n;

        while (n>0){
            int digit = n%10;
            if(digit !=0 && originalNumber % digit == 0){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
    public static void main(String[] args){
        System.out.print("Enter a Number to Count: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        int result = digitcnt(n);
        System.out.println("Number of digits that divide " + n + ": " + result);
    }
}


// Question

/*
    Problem statement
    You are given a number ’n’.
    Find the number of digits of ‘n’ that evenly divide ‘n’.
    
    Note:
    A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.

    Example:
    Input: ‘n’ = 336
    Output: 3

    Explanation:
    336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.
    Note:
    You don’t need to print anything. Just implement the given function.

    Detailed explanation ( Input/output format, Notes, Images )
    Sample Input 1:
    35
    Sample Output 1:
1
 */