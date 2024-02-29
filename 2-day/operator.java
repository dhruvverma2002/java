
public class operator {
    public static void main(String[] args) {
        int a=20;
        int b=10;

        //arthmetic operator
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        //pre Increment
        int c = ++a;
        System.out.println(a);
        System.out.println(c);

        //post Increment
        int d = a--;
        System.out.println(a);
        System.out.println(d);

        // Relational operator
        System.out.println((a==b));
        System.out.println((a!=b));
        System.out.println((a>b));
        System.out.println((a<b));
        System.out.println((a>=b));
        System.out.println((a<=b));
    }
}

// type of operator

//     arthmetic operator
            // Binary { + , - , * , / , % }
            // Unary  { ++ ,  -- }
                    // pre Increment eg:- ++a  1st (value change) 2nd (vlaue use)
                    // post Increment eg:- a++ 1st (vlaue use) 2nd (value change)
//     Relational operator { == , != , > , < , >= , <= }
//     Logical operator
//     Bitwise operator
//     Assingnment operator

