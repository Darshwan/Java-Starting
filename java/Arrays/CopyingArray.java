package Arrays;

public class CopyingArray {

    static void print_array(int[] a_array){
        for (int i = 0; i < a_array.length; i++) {
            System.out.println(a_array[i]+ " ");
         }
         System.out.println(); 
    }
    static void change_value(int[] b_array){
        for (int i = 0; i < b_array.length; i++) {
            b_array[i] = 0;
        }
    }
    
    public static void main(String[] args) {


         int[] org_array = {1,2,3,4};
         System.out.println("Original Array: ");
         print_array(org_array);

        //  tring to copy org_array to copd_arr
         int[] copd_array = org_array;
         System.out.println("Copied Array");
         print_array(copd_array);

        // //  Changing some value of copd_array only(Shallow Copy)
        copd_array[0] = 11;
        copd_array[1] = 12;
        System.out.println("Original array after changing value: ");
        print_array(org_array);

        System.out.println("Copid Array After changing value: ");
        print_array(copd_array);



        // Changing value of Array
        //  changing whole value , Original Array:
        System.out.println("After changing value , Original Array: ");
        change_value(org_array.clone());
        print_array(org_array);
        //  Changing whole value, Copied Array :
        System.out.println("After changing value , Copid Array: ");
        change_value(copd_array);
        print_array(copd_array);
    }
}
