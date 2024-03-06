import java.util.Scanner;

public class whileTrue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("N :- " );
            int n =  s.nextInt();
            int counter = 1;
        while (counter <= n) {
            System.out.print(counter++ + " ");
        }
    }
    
}

/*

while(condition){
    work to be done
}

 */