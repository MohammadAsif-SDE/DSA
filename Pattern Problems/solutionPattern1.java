import java.util.*;

public class solutionPattern1 {
    public static void nForest(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number to print the pattern: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        nForest(n);
    }
    
}