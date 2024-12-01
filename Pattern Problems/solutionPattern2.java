import java.util.*;

public class solutionPattern2 {
    public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.print("Enter a Number to print Pattern: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        pattern2(n);
    } 
}
