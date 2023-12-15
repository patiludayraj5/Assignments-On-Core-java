import java.util.Scanner;

//Java Program to Compute Quotient and Remainder
public class Quotient_Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dividend No: ");
        float n= sc.nextFloat();
        System.out.println("Enter Divisor : ");
        int m=sc.nextInt();
        System.out.println("Quotient of no "+n+" is "+n/m);
        System.out.println("Reminder of no "+n+" is "+n%m);
    }
}
