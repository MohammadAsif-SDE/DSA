// decimal = 0-9
// Binary = 0, 1

public class conversions {
    // Binary to decimal
    public static void bin2Dec(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow =0;

        while(binNum > 0){
           int lastDigit = binNum%10;

           decNum = decNum +(lastDigit *  (int)Math.pow(2, pow));
           pow++;

           binNum = binNum/10;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);
    }

    public static void dec2Bin(int decNum){
        int myDec = decNum;
        int pow =0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;

            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary Number of " + myDec + " is " + binNum);
    }
    public static void main(String[] args) {
        dec2Bin(11);
        bin2Dec(1010100101);
    }
}
