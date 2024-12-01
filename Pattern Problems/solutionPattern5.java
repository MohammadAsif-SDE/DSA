import java.util.*;

public class solutionPattern5 {
    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    int n = 4;
    pattern5(n);
}
}
