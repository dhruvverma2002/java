public class forLoop{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("N :- " );
            int n =  s.nextInt();
            
        for (int i = 1; i <= n;i++) {
            System.out.print(counter++ + " ");
        }
    }
    
}
