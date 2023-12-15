import java.util.Scanner;

//-> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
public class Harmonic_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float res=0;
        System.out.println("Enter the No.: ");
        int n=sc.nextInt();
        if (n>0) {
            for (int i = 1; i <= n; i++) {
                res += (float) 1 / i;
            }
            System.out.println("The Harmonic of " + n + " is: " + res);
        }else {
            System.out.println("Enter a valid No.!");
        }
    }
}
