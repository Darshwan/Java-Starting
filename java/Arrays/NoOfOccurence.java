package Arrays;
import java.util.Scanner;

public class NoOfOccurence {

static int Occurences(int[] array, int x){
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i]== x) {
            count++;
        }
    }
return count;
}

    public static void main(String[] args) {
        int[] array = {1,2,2,6,2,8,2,10,11,12};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to search");
        int x = sc.nextInt();

        System.out.println("Occurences is "+ Occurences(array,x));
        

    }
}
