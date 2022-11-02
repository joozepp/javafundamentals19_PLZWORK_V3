package org.sda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise {
    public static void main(String[] args) {
        System.out.println("please give me a number");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int i = scanner.nextInt();
            System.out.println("int -> "+ i);
        } else if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("double ->" + d);
        }else {
            throw new InputMismatchException("Hey thats not a value try agfain!");
        }
    }


}
