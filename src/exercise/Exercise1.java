package exercise;

import java.util.Scanner;
import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        String a;
        do {

            System.out.println("yes or no: ");

            Scanner scanner = new Scanner(System.in);
            a = scanner.next();

            Random rand = new Random();
            int n = rand.nextInt(100 - 1 + 1) + 1;

            if (n % 2 == 0) {
                System.out.println(n);
                System.out.println(n + "la so chan");

            } else {
                System.out.println(n);
                System.out.println(n + " la so le");
            }
        } while (a.equals("yes"));

    }

}
