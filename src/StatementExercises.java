public class StatementExercises {

    //solution 1
    public static void main(String[] args) {
        int i = 0;

        for(i=0; i <=20; i++) {

        if(i % 2 == 0) {
            System.out.println("this is even number");
        } else {
            System.out.println("this is odd number");
        }
    }
        // solution 2
        for (i = 0; i <= 20; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + " number");
            // i is even/odd number
        }

    }
}

