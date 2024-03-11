import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("Number :- " );
            int n =  s.nextInt();
            int remainder, newNumber = 0;
            while (n>0) {
                remainder = n%10;
                newNumber = newNumber*10 + remainder;
                n /=10;
            }
            System.out.println("Reverse of a number:- " + newNumber);
    }
}
