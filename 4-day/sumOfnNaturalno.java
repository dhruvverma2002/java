import java.util.Scanner;

public class sumOfnNaturalno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("N :- " );
            int n =  s.nextInt();
            int sum =n;
            while( n-->0 ){
                sum += n;
            }
            System.out.println(sum);
           
    }
    
}
