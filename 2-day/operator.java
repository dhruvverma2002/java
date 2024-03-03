
public class operator {
    public static void main(String[] args) {
        int a=20;
        int b=10;

        System.out.println("Arthmetic operator");
        //arthmetic operator
        System.out.println("a + b :- " + (a + b));
        System.out.println("a - b :- " + (a - b));
        System.out.println("a * b :- " + (a * b));
        System.out.println("a / b :- " + (a / b));
        System.out.println("a % b :- " + (a % b));
        
        System.out.println("Pre Increment");
        //pre Increment
        int c = ++a;
        System.out.println("a:- " + a);
        System.out.println("c:- " + c);

        System.out.println("Post Increment");
        //post Increment
        int d = a--;
        System.out.println("a:- " + a);
        System.out.println("d:- " + d);

        System.out.println("\nRelational operator\n");
        // Relational operator
        System.out.println("(a==b):- " + (a==b));
        System.out.println("(a!=b):- " + (a!=b));
        System.out.println("(a>b):- " + (a>b));
        System.out.println("(a<b):- " + (a<b));
        System.out.println("(a>=b):- " + (a>=b));
        System.out.println("(a<=b):- " + (a<=b));

        System.out.println("\nLogical operator\n");
        // Logical operator { && , || , ! }
        // &&
        System.out.println("true && true:- " + (true && true));
        System.out.println("true && false:- " + (true && false));
        System.out.println("false && true:- " + (false && true));
        System.out.println("false && false:- " + (false && false));
        System.out.println();
        // ||
        System.out.println("true || true:- " + (true || true));
        System.out.println("true || false:- " + (true || false));
        System.out.println("false || true:- " + (false || true));
        System.out.println("false || false:- " + (false || false));
        System.out.println();
        // !
        System.out.println("!true:- " + !true);
        System.out.println("!false:- " + !false);

        
        System.out.println("\nAssingnment operator\n");
        // Assingnment operator
        System.out.println("a=b:- " + (a=b));
        System.out.println("a+=b:- " + (a+=b));
        System.out.println("a-=b:- " + (a-=b));
        System.out.println("a*=b:- " + (a*=b));
        System.out.println("a/=b:- " + (a/=b));

    }
}

// type of operator

//     arthmetic operator
            // Binary { + , - , * , / , % }
            // Unary  { ++ ,  -- }
                    // pre Increment eg:- ++a  1st (value change) 2nd (vlaue use)
                    // post Increment eg:- a++ 1st (vlaue use) 2nd (value change)
//     Relational operator { == , != , > , < , >= , <= }
//     Logical operator { && , || , ! }
//     Bitwise operator
//     Assingnment operator { = , += , -= , *= , /= }
