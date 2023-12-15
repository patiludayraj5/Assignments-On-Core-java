import java.util.Scanner;

public class Swap_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No.: ");
        int n=sc.nextInt();
        System.out.println("Enter 2nd No.: ");
        int m=sc.nextInt();
        System.out.println("Before Swapping n= "+n+" m= "+m);
        int temp;
        temp=n;
        n=m;
        m=temp;
        System.out.println("After Swapping n= "+n+" m= "+m);
    }
}
