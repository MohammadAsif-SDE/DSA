public class solutionPattern18 {
    static void pattern18(int n){
        char startingChar=(char)('A'+(n-1));
        for(int i=0; i<n; i++){
            char currenntChar= (char)(startingChar - i);
            for(int j=0; j<=i; j++){
                // System.out.print((char)(currenntChar + j) + " ");
                // For reverse
                System.out.print((char)(startingChar - j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=3;
        pattern18(n);
    }
}
