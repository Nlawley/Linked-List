package cs145.labs.Lab3;
import java.util.Scanner;
//here i made a program to test the letterInventory with any input.

//Nolan Lawler
public class test {
    public static void main(String[] args) {
        System.out.println("What would you like to store?");
        Scanner scanner = new Scanner(System.in);
        letterInventory inventory = new letterInventory(scanner.nextLine());
        char[] index = inventory.toString().toCharArray();
        System.out.println("Size of Inventory: " + inventory.size());
        for(int i = 1; i <= inventory.size(); i++){
            char l = index[i];
            System.err.printf("number of '%s' in inventory: " +inventory.get(l)+"\n",l);
        }
        scanner.close();
    }
}
