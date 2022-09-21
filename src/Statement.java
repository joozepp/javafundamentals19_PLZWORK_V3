/**
 * Statement examples
 *
 * @author Joozepp
 */
// TIP OF THE DAY: CTRL + ALT + L = AUTO ALIGN THE CODE

    // Adding multiple statementes togheter is called NESTED.

public class Statement {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Joosep";

        if (name == "Joosep" && name != "Joozep") ;  // if statementidel peab jälgima blokke {}
        {
            System.out.println("The name is correct");
        }
        if (i > y) {
            System.out.println("i is greater than y");
        }

        System.out.println("this is a simple program");


        if (i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");
        }

        /*
        if(shirt size == M && shirt color == black) {
        //buy the shirt
        } else if(shirt size == M && shirt color == blue {
        //buy the blue shirt
        } else {
        // buy the shirt from other shop
        }
        */


        if (i > y) {
            System.out.println("i is greater than y");
        } else if (i < 9) {
            System.out.println("i is lesser");
        } else {
            System.out.println(" i is invalid");
        }


        /*
        SWITCH
            if we want to check one condition for multiple values.
           (almost similar to if n else if)

         */
        int x = 5;
        int j = 6;
        int z = x + j; // 11

        switch (z) {   // switch on ka blokiga, nagu ülemised.
            case 10:
                System.out.println("the value of z is 10");
                break;
            case 11:
                System.out.println("the value of z is 11");
                break;  // kui value sobib siis järgnev osa koodist SIIN BLOKIS ei runni.
            case 12:
                System.out.println("the value of z is 12");
            default: // viskab tagasi eelmisesse blokki kui miskit ei juhtu
                System.out.println("deaful block executed!");

        }


        String color = "red";

        switch (color) {
            case "red":
                System.out.println("im red");
                break;
            case "white":
                System.out.println("im white");
                break;
        }


        // while - ENTRY CHECK LOOP
        int money = 0;

        while (money <= 5) {
            System.out.println("doing job");
            money++;  //money = money + 1
        }


        // Do-While    EXIT CHECK LOOP

        do {
            System.out.println("money =" + money);
            money += 10;  // money = money + 10
        } while(money < 100);



        //FOR LOOP (IMPORTANT@@@@@@@@@@@@@@ MOST USED)
        for (int g = 0; g <= 6; g++) {                      //init. is only for the first time
            System.out.println("g value is:" + g);
        }




    }

}
