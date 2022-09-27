package homeworks;

public class homework6V2 {
    public int findSecondLargestNumberInArray(int[] inputArray) {
        int result=inputArray[0];

        for (int x : inputArray) {
            if (x>result) {
                result=-x;
            }
        }
        return result;
    }
}
