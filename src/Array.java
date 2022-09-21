/**
 *
 * @author Joozepp
 */

public class Array {
    public static void main(String[] args) {
        int a = 9;
        int[] b = {9, 27, 48, 20, 839, 11000, 27, 40};     //kantsulud märgivad ära, et ARRAY. peab panema curly brackets ka
        //single dimensional array
        //NOTE: Array index always starts with 0.
        String [] fruits = {"apple", "orange", "mango", "apple", "banana", "mango"}; //java storeb array info indexidena.

        System.out.println(fruits[0]);
        System.out.println(b[4]);

        // System.out.println(fruits[3]);//<-- cant go out of range. 0, 1, 2

        System.out.println(b.length); // returns the number of indexes/values in the array
        System.out.println(b.length - 1); // returns array's last index.

        //defined array.
        int[] veggies = new int[5]; // 0, 1, 2, 3, 4 // new object

        veggies[3] = 65;            //definen slot 3 ja slot 4
        veggies[4] = 45;            // slot 0, 1, 2 on 0
        System.out.println(veggies[1]); // ainult siis kui defined tho.

        String [] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];



        //proccesing arrays
        //conventional for-loop
        for(int i=0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }


        //enhanced for-loop    WILL WORK ONLY FOR ARRAYS AND LIST (mostly)
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest element in the array.
        //This method is called BruteForce Method
        int result = b[0];  //b[0] = 9

        for(int x: b) {
            if(x < result) {
                result = x;

            }
        }
        System.out.println(result);


        //homework
        //To find smallest in the array: b





    }



}
