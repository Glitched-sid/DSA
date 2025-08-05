// check id the number is palindrome or not

import java.util.Scanner;
public class Palindrome{
    public static void main (String[]args){
        int n;
        Scanner k = new Scanner(System.in);
            n = k.nextInt();
        
        System.out.print(isPalindrome(n));
        
    }

    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int n = x;
        int revNum = 0;

        while (n>0){
            int d = n%10;
            revNum = revNum*10+d;
            n = n/10;
        }

        return revNum == x;
    }
}