import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();    // capture only till space 
                                    //  input:- Tony Stark
        System.out.println(input); // output:- Tony


        String sentence = sc.nextLine();    // capture only till new line 
                                    //  input:- Tony Stark is my name.
        System.out.println(sentence); // output:- Tony Stark is my name.

        // sc.nextInt()
        // sc.nextByte()
        // sc.nextFloat()
        // sc.nextDouble()
        // sc.nextShort()
        // sc.nextBoolean()
        // sc.nextLong()

    }   
}
