package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {

    private static int guess;


    public static int read() {
        Scanner scanner = new Scanner(System.in);
        try {
            guess = scanner.nextInt();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("this is not integer format");
            read();
        }
        if (guess > 100 || guess < 0) {
            System.out.println("your guess more than 100 or less than 0");
            guess = read();
        }
        return guess;
    }

}
