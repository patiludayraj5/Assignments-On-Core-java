import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Largest_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no: ");
        int a=sc.nextInt();
        System.out.println("Enter second no: ");
        int b=sc.nextInt();
        System.out.println("Enter third no: ");
        int c=sc.nextInt();
        int[] arr= new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        int d=0;
        for (int i=0;i<3;i++){
            if (arr[i]>d){
                d=arr[i];
            }
        }
        System.out.println(d);

    }
}
