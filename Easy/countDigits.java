package Easy;
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
