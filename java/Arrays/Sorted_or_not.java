package Arrays;
import java.util.Scanner;

public class Sorted_or_not {
    
    static boolean isSorted(int[] array ){
        boolean check = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                check = false;
                break;
            }
            else{
                check = true;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n +" elements for array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Is Sorted: "+isSorted(array));
    }
}
