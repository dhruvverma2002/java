import java.util.Scanner;

public class multipalOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        do{
            System.out.print("Enter the multipal of 10:- ");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
            n++;
        }while(true);
    }
}
