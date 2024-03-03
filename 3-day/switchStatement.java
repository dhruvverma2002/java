import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble() , num2 = sc.nextDouble() ;
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                    System.out.println(num1 + num2);                
                break;
            
            case '-':
                System.out.println(num1 - num2);                
            break;
            case '*':
                    System.out.println(num1 * num2);            
                break; 
            case '/':
                System.out.println(num1 / num2);                
            break;
            case '%':
                System.out.println(num1 % num2);                
            break;
            default:
                System.out.println("Not a valid Operator");
                break;
        }
    }
}

// switchStatement
/*
    switch(variable){
    case 1:

    case 2:

    case 3:

    default:

    }

*/