// Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number>0) {
            System.out.println("+ ve");
        }else if(number<0){
            System.out.println("- ve");
        }
        else{
            System.out.println("Zero");
        }
        
    }
}