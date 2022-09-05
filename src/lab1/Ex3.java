package lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] array = str.split("\\s+");
        for (int i = 0; i< (array.length - 1); i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + ".");
    }
}
