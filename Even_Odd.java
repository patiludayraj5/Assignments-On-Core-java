import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No.: ");
        int n=sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Number "+n+" is Even Number");
        }else {
            System.out.println("Number "+n+" is Odd Number");
        }
    }
}
