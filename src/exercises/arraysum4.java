package exercises;

public class arraysum4 {
    public static void main(String[] args) {
        int sum = 4;
        int[] array = {1,2,7,3,10,2,9};
        System.out.println("Find numbers that equal with the number 4");

        for (int i=0; i <array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(i+j==sum){
                    System.out.println(i + " + " + j + " = "+sum);
                }
            }
        }
    }
}
