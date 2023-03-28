                            // | ----------------------|
// Program to find totalno of pairs in the Array whose sum is equal to the given value of x.| 
                            // |       Target Sum      |      
                            // | ----------------------|
package Arrays.Problem_solvingOfArrays;
import java.util.Scanner;

public class Problem1 {
    static int Target_sum(int [] array_1, int target){
        int a = array_1.length;
        int ans = 0;
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j < a; j++) {
                if (array_1[i] + array_1[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // taking input of array
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] array =new int[n];

        System.out.println("Enter " + n +" elements for array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Sum: ");
        int x = sc.nextInt();

        System.out.println("Pair of target is: "+Target_sum(array,x));
    
    }
}
