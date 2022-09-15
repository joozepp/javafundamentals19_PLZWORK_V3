/**
 * Examples for Java operators
 * @author Joozepp
 */
public class Operator {

    public static void main(String[] args) {

        //unary operators   (operator with one variable)
        //post-increment
        int i = 0;
        System.out.println(i);       // kui paned need --/++ taha siis töötab peale
        System.out.println(i++);    // 0 (increment here but not used)
        i++; // i+1 (incremented value plus another increment)
        System.out.println(i);

        // post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        // pre-decrement
        int j = 10;                      // kui paned --/++ ette siis töötab kohe
        System.out.println(j);
        System.out.println(--j);

        // brackets are the highest priority
        int x = i + (-j); //   x = i - j; 2 - 9
        System.out.println(x);

        //binary operators  (operator with two variables)
        //aritmeetilised operators
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b;
        System.out.println(d);

        float z = i * a + (c / b) - (-j) % x;   // unary operator has prio. then binary
        /*
         * 1. z = i * a + (c / b) + j % x;
         */
        System.out.println(z);

        int divide = 40 / 5; // jagatis (Quotient value)
        System.out.println(divide);

        int modulo = 40 % 7;  // Remainder value
        System.out.println(modulo);


        //comparison operators ( ==, !=, >, <, >=, <=)
        //always compare the variable with the same datatype.
        // EI TOHI COMPAREDA ERINEVAID DATATYPESID, NT. BOOELAN JA STRING jne, TRUE == "shaq" <<<--- BAD D:!
        // AGA        boolean checkNumber = 9 == 9.0; //int == float , see TRUE, aga 9 == 9.1 = FALSE

        boolean result = divide == modulo; // 8 == 5
        System.out.println(result);

        boolean result2 = divide != modulo; // 8 != 5
        System.out.println(result2);

        boolean lessCheck = divide < modulo; // 8 < 5
        System.out.println(lessCheck);

        boolean greaterCheck = divide > modulo; // 8 > 5
        System.out.println(greaterCheck);

        //less than or equals
        boolean lessEquals = divide <= modulo; // 8 <= 5
        System.out.println(lessEquals);


        // logical operators (&&, ||) - and , or.
        /*
         * true && false = false
         * false && true = false
         * false && false = false
         * true && true = true
         */
        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        /*
         * true || true = true
         * false || false = false
         * true || false = true
         * false || true = true
         */
        boolean orCheck = (8 > 9) || (10 > 4);
        System.out.println(orCheck);


        // ^ = xOR
        // true ^ false = true
        // false ^ true = true
        // true ^ true = false
        // false ^ false = false

        float expo = 12 ^ 25; // 12 = 00001100, 25 = 00011001  | binary to decimal conversion
        /**
         * 00001100
         * 00011001
         * --------
         * 00010101 = 21
         */


        System.out.println(expo);

        //Assigment operators
        x = x + y; //both are same
        x += y;    // both are same

        x /= y;
        x *= y;


        // ternary operators (?, :)   ? = ifTrue   : = ifFalse   (if-else pmst.)
        String ternary = (8 > 10) ? "cat" : "dog";
        System.out.println(ternary);

        int TernaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(TernaryCheck);

        int check2 = !lessCheck ? 9 : 10;
        System.out.println(check2);


        boolean checkNumber = 9 == 9.0; //int == float
        System.out.println(checkNumber);

        //most used operators ( vinod's example)
        //++, --
        //+
        //==, !=
        // &&, ||
        //?, :

        String LOL = "turbo";
        String XD = "chad";
        String omega = (LOL + XD);
        System.out.println(omega);

    }

}