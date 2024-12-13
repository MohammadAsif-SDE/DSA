import java.util.Scanner;

public class linearsearch {
    static int menusearch(String menu[], String menusearch) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i].equals(menusearch)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"Samosa", "Jalabi", "Rabdi", "kabab"};
        System.out.println("We have a Menu:");

        for(int i=0; i<menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        
        System.out.print("Enter what do you like to eat? : ");
        Scanner Sc = new Scanner(System.in);
        String menusearch = Sc.nextLine();

        int index = menusearch(menu, menusearch);

        if(index == -1){
            System.out.println("menu not Found");
        }else{
            System.out.println("'" + menusearch + "' is Founded at Index " + index + " go and get your order");
        }


        
        // int numbers[] = {1, 4, 6, 8, 3, 9, 21};
        // int key = 21;

        // int index = linearsearch(numbers, key);

        // if(index == -1){
        //     System.out.println("Key not found");
        // }else{
        //     System.out.println("Key founded at Index" + index);
        // }

    }
}
