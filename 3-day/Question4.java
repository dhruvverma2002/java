// Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year % 4 == 0  ){
            if(year % 100 != 0 ){
                System.out.println("leap year");
            }else if(year % 400 == 0){
                System.out.println("leap year");
            }else{
                System.out.println("not leap year");
            } 
        }
        else{
            System.out.println("not leap year");
        }
        
    }
    
}
