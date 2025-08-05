import java.util.Scanner;
public class Power_Two {
    public static void main (String[]args){
        int n;
        Scanner k = new Scanner(System.in);
            n = k.nextInt();
        
        System.out.print(twoPower(n));
}
    public static boolean twoPower(int n){
        if (n<1){
            return false;
        }
        else if (n == 1){
            return true;
        }
        else{
            while(n%2 == 0){
                n /= 2;
            }
            return n == 1;
        }
    }
}