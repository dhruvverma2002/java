import java.util.Scanner;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 0;
        if( income < 500000){
            System.out.println("Tax = " + tax);
        }else if(income >= 500000 && income < 1000000){
            tax = income * 0.2;
            System.out.println("Tax = " + tax + " at the tax rate or 20%");
        }else{   
            tax = income * 0.3;
            System.out.println("Tax = " + tax + " at the tax rate or 30%");
        }
    }
}
