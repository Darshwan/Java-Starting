
    //   Array Manipulation
// find the value in given array where all elements are different and repeated and with one value being unique .

package Arrays.Problem_solvingOfArrays;
import java.util.Scanner;

public class Problem_3 {
    static int unique(int[] arr ){
        int ans  = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
                
            }
        }
        return ans;

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

        System.out.println("Unique Value is: "+ unique(array));
        
    }
}
