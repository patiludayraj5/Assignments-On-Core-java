import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int ly= sc.nextInt();
        if ((ly%4==0)  && (ly%100!=0) || (ly%400==0) ){
            System.out.println("Year is leap year");
        }else
        {
            System.out.println("Year is NOT leap year");
        }

    }
//    Java Program to Find the Largest Among Three Numbers
//    WAP to reverse number and String
//    Goutham Y11:27 AM
//1/10,2/10,3/10.......10/10

}