
//                    Swap Value 

package Arrays.Problem_solvingOfArrays;
public class SwapValue {
    static void swap (int a , int b){
        System.out.println("Original  value beffore swap:");
        System.out.println("a " + a);// a=9
        System.out.println("b "+ b);//b = 3
        int temp = a; // 9
        a = b; // a = 3
        b = temp; // b =9

        System.out.println("Values after swap:" );
        System.out.println("a: " + a);// a =3
        System.out.println("b: " + b);// b= 9;
    }
    public static void main(String[] args) {
        int a = 9;
        int b =  3;
        int[ ] arr = { 1,2,3,4,5,6,7,8,9};
        swap(a, b);
    }
}
