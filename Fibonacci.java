import java.util.Scanner;

public class Fibonacci {
   
    public static void main (String[]args){
        int n;
        Scanner k = new Scanner(System.in);
            n = k.nextInt();
        
        System.out.print(fib(n));
        k.close();
    }

    public static int fib(int n){
        if (n ==0){
            return 0;
        }
        else if (n ==1){
            return 1;
        }

        int firstTerm = 0;
        int secondTerm = 1;

        for(int i=1;i<=n;i++){
            int thirdTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        return firstTerm;
    }
}
