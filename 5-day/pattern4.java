public class pattern4 {
    public static void main(String[] args) {
        int n = 5,k=0;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print( (char)(65+k) + " ");
                k++;
            }
            System.out.println();
        }
    }
    
}
