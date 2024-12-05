public class solutionPattern20 {
    static void pattern20(int n){
        int totalRows = 2*n-1;
        for(int i=0; i<=totalRows; i++){
            int stars = (i<=n) ? i : totalRows - i + 1;
            int spaces = 2*(n-stars);
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=3;
        pattern20(n);
    }
}
