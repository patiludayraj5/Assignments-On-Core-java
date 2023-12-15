import java.util.Scanner;

public class Is_Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Alphabet: ");
        String str=sc.next();
        char ch=str.charAt(0);
        if(ch=='i'|| ch=='I' || ch=='a' || ch=='A' || ch=='e'|| ch=='E' || ch=='O' || ch=='o'|| ch=='u' || ch=='U'){
            System.out.println("Alphabet is Vowel");
        }else {
            System.out.println("Alphabet is Consonant");
        }
    }
}
    //java Program to Check Whether an Alphabet is Vowel or Consonant