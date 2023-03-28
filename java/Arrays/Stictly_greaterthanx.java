package Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Stictly_greaterthanx {

    static int greater(int[] Array, int x ){
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > x) {
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int[] Array = {1,14,5,15,12};
        System.out.println("There are "+greater(Array, x) + " Strictly greater numbers.");
        
    }
}
