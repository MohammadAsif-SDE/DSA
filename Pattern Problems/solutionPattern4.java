import java.util.*;

public class solutionPattern4 {
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt();
    pattern4(n);
}
}
