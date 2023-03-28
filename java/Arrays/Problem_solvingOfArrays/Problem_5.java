
//                    < -- Return the only first repeating value -- >

package Arrays.Problem_solvingOfArrays;
import java.util.Scanner;
public class Problem_5 {
    static int ReturnRepeating(int [] arr){
        int rep_val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    rep_val = arr[i];
                }else{
                    rep_val = -1;
                }
            }
        }
        return rep_val;
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
    System.out.println("repeating value is: " + ReturnRepeating(array));
}
}
