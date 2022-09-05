package lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a number of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> randomIntegers = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int randomValue = random.nextInt((n+100));
            while (randomIntegers.contains(randomValue)){
                randomValue = random.nextInt((n+100)); // distinct random value
            }
            randomIntegers.add(randomValue);
        }
        System.out.println("Array: " + randomIntegers);
    }
}
