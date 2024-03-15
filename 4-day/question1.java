import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N :- " );
        int n =  s.nextInt();
        int fact = 1;
        while (n>1){
            fact *= n; 
            n--;
        }
        System.out.println(fact);

    }
}
