import java.util.*;

public class arrays {
    public static void lenArray(int arrlen[]){
        for(int i=0; i<arrlen.length; i++){
            arrlen[i] = arrlen[i] + 1;
        }
    }
    
    public static void main(String args[]){
        int arrlen[] = {3, 32, 23, 53, 5};
        lenArray(arrlen); // First call modifies array
        for(int i=0; i<arrlen.length; i++){
            System.out.println(arrlen[i] + " Marks");
        }
        System.out.println();
    }
}
