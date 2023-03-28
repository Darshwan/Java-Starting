
//                  Reverse an array with Integer value ;

package Arrays.Problem_solvingOfArrays;
import java.util.Scanner;

public class ReverseArray {
    static int [] Reverse_array(int[] array){
        int[] reversed_arr = new int[array.length];
         int j = 0;
        // Traverse original array in reverse direction
        for (int i = array.length-1; i >= 0; i--) {
            reversed_arr[j++] = array[i];
        }
        return reversed_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input of array
        System.out.println("Enter size fo array");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("enter "+ n +"Elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        // Printing the array by passing in above method
        int[] Ans_array = Reverse_array(array);

        for (int i = 0; i < Ans_array.length; i++) {
            System.out.print( Ans_array[i] + " ");
        }
        
    }
}
