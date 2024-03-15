import java.util.Scanner;

public class exceptMultiOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        do{
            System.out.print("Enter the multipal of 10:- ");
            int n = sc.nextInt();

            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
            
        }while(true);
        
        
    }
}
