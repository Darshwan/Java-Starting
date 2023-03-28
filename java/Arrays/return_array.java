package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class return_array {
    static int[] returnsarray (int[] arr){
        int [] sorted_array = Arrays.sort(arr);;
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
    }
}
