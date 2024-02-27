import java.util.*;

public class typeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // possble automatically 
        int a = 25;
        long b = a;
        System.out.println(b);

        // lossy conversion
        /*   
        long x = 25;
        int y = x;
        System.out.println(y);
        */   

        float num = sc.nextInt();
        System.out.println(num);
    }
    
}

/*

conversin happen when 
1. type compatible 
2. destination type > source type

*/

// byte -> short -> int -> float -> long -> double 