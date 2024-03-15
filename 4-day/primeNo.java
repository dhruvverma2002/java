import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }

        if(prime){
            System.out.println(n + " is a prime no");
        }else{
            System.out.println(n + " is not a prime no");
        }
    }
}
