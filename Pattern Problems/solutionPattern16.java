public class solutionPattern16 {
    static void pattern16(int n){
        for(int i=1; i<=n; i++){
            char ch=(char)('A'+i-1);
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pattern16(n);
    }
}
