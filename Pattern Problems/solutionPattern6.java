import java.util.*;

public class solutionPattern6 {
    public static void pattern6(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
public static void main(String [] args){
    int n = 4;
    pattern6(n);
}
}
