public class NewRoom {
    //write a program which prints "fizz" if the number is a multiplier of 3,
    //print  "buzz" if its multiplier of 5 and prints "fizzbuzz" if the number is
    //divisible by both 3 and 5. AKA THE FIZZ BUZZ PROBLEM.
    // authors Bahadir & Joosep

    public static void main(String[] args) {
        String f = "fizz";
        String b = "buzz";
        String fb = "fizzbuzz";
        for (int x = 1; x <= 50; x++){
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println(fb);
            } else if(x % 3 == 0) {
                System.out.println(f);
            } else if(x % 5 == 0) {
                System.out.println(b);
            }
            }
        }
}

