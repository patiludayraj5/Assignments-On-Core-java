import java.util.Random;
import java.util.Scanner;

//Flip Coin and print percentage of Heads and Tails
public class Coin_Flip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int count1=0;
        int count2=0;
        System.out.println("How many times you want to flip the coin: ");
        int n= sc.nextInt();
        int i=1;
        while (i<=n) {
            int flip =random.nextInt(2);
            if (flip == 1) {
                count1++;// how many times head occurred
            } else {
                count2++;// how many times tails occurred
            }
            i++;
        }
        float res1=((float) count1 /n)*100;
        float res2=((float) count2 /n)*100;
//        System.out.println(count2);
        System.out.println("Percentage of Head: "+res1);
        System.out.println("Percentage of Tails: "+res2);

    }
}
