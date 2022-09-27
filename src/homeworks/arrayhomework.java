package homeworks;

public class arrayhomework {
    public static void main(String[] args) {
        int[] x = {1,7,3,10,9};
        int result = x[0];  //b[0] = 9

        for(int z: x) {
            if(z < result) {
                result = z;

            }
        }
        System.out.println(result);
    }
}
