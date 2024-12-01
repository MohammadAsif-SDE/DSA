
public class solutionPattern8 {
    static void pattern8(int n){
        for(int i=n; i>=1; i--){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    int n=5;
    pattern8(n);
}
}
