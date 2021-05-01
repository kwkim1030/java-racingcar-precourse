package utils;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputCarName() {
        System.out.println(Message.NAME_MSG.getMessage());
        return scanner.nextLine();
    }

    public static int inputTry() {
        System.out.println(Message.TRY_MSG.getMessage());
        return scanner.nextInt();
    }
}
