import java.util.Scanner;

public class solutionPattern21 {
    static void pattern21(int n){
        int size = 2*n-1;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                int value = n-Math.min(
                    Math.min(i, size-1-i),
                    Math.min(j, size-1-j)
                );
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the Number to Print the matrix: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        pattern21(n);
    }
}
