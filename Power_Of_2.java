//This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
public class Power_Of_2 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);// it takes command line argument from args
        int i=1;
        int power_2=0;
        while (i<=n){
            power_2+= (int) Math.pow(2,i);
            i++;
        }
        System.out.println(power_2);

    }
}
