import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N :- " );
        int n =  s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
