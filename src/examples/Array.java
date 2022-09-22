package examples;

/**
 *
 * @author Joozepp
 */

public class Array {
    public static void main(String[] args) {
        int a = 9;
        int[] b = {9, 27, 48, 20, 839, 11000, 27, 40};     //kantsulud märgivad ära, et ARRAY. peab panema curly brackets ka
        //single dimensional array
        //NOTE: examples.Array index always starts with 0.
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


        //multi-dimensional array   x-axis ja y-axis
        //2D-array
        int[][] array2D = new int[3][3];  //tehtud õpsi diagrammi järgi
        //row-1
        array2D[0][0] = 1;
        array2D[0][1] = 0;
        array2D[0][2] = 1;

        //row-2
        array2D[1][0] = 2;
        array2D[1][1] = 10;
        array2D[1][2] = 9;

        //row-3
        array2D[2][0] = 4;
        array2D[2][1] = 9;
        array2D[2][2] = 8;

        int[][] array2Dver2 = {{1, 0, 1}, {2, 10, 9}, {4, 9, 8}};



        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                System.out.print(array2D[x][y] + " ");
            }
            System.out.println();
        }

        //3D-array = 1D + 2D array
        //1D represents number of tables
        //2D => array with rows and columns
        int[][][] array3D = new int[2][3][3];
        //TABLE-1
        //ROW-1
        array3D[0][0][0] = 1;
        array3D[0][0][1] = 0;
        array3D[0][0][2] = 1;

        int[][][] arrayd3dver2 = {{{1,0,1}, {1,8,0}, {2,5,7}},
                {{8,8,7}, {5,8,9}, {3,5,0}},
                {{5,6,2}, {4,5,7}, {2,6,8}}
        };

        //print 3D array
        for(int x=0; x<3;x++) {
            for(int y=0; y<3;y++) {
                for(int z=0;z<3;z++){
                    System.out.print(arrayd3dver2[x][y][z] + "\t");
                }
                System.out.println();
            }
            System.out.println("\n");
        }


    }



}
