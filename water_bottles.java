import java.util.Scanner;

public class water_bottles {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String[]args){
        int numBottles,numExchange;
        
        Scanner k = new Scanner(System.in);
        System.out.println("Enter no. of Bottles");
        numBottles = k.nextInt();
        System.out.println("Enter no. of Bottles Exchange");
        numExchange = k.nextInt();
        k.close();
        int ans = waterBottles(numBottles, numExchange);
        System.out.println("Total bottles you can drink: " + ans);
    }

    public static int waterBottles(int numBottles, int numExchange){
        int ans = numBottles;

        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int reBottles = numBottles % numExchange;
            
            ans = ans + newBottles;
            numBottles = newBottles + reBottles;
        }
        return ans;
    }
}
