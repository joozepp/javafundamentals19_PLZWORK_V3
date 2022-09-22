package homeworks;

public class homeworkarra {
    public static void main(String[] args) {
        int[] b = {9, 27, 48, 20, 839, 11000, 27, 40};

        int result = b[1];  //b[0] = 9

        for(int x: b) {
            if(x < result) {
                result = x;

            }
        }
        System.out.println(result);
    }

}
