package homeworks;

public class homework6v2Exercise {
    public static void main(String[] args) {
        int[]z = {1,7,3,10,9};

        homework6V2 homework6V2 = new homework6V2();
        int result = homework6V2.findSecondLargestNumberInArray(z);

        System.out.println("Finding the element...");
        System.out.println("Second largest # in array: "+ result);
    }
}
