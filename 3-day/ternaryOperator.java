public class ternaryOperator {
    public static void main(String[] args) {
        int num = 4;
        boolean adult = (num >= 18)?true:false;
        String type = ((num % 2) == 0)? "even":"odd";
        System.out.println(adult);
        System.out.println(type);
    }
    
}


// Ternary Operator
    // variable = condition?statement1:statement2;
        // if condition is true then statement1 one will execute
        // else statement2 