
 class Addfunc {
  int add(int a, int b){
    int ans = a+b;
    return ans;
  }
    
}

public class OOPs {
    public static void main(String[] args){
        Addfunc obj = new Addfunc();
        int x = 1;
        int y = 2;

        System.out.print("The sum is :- ");
       int ans =  obj.add(x,y);
        System.out.print(ans);
    }
    
}