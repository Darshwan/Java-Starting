
//                              <---Second largest number in an array--->

package Arrays.Problem_solvingOfArrays;
import java.util.Scanner;

public class Problem_4 {
    static int FirstMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        return max;
    }
    static int SecondMax(int[] arr){
        int max = FirstMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int SecondMax = FirstMax(arr);
        return SecondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] array =new int[n];

        System.out.println("Enter " + n +" elements for array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Second largest number is: " + SecondMax(array));
    }
}
