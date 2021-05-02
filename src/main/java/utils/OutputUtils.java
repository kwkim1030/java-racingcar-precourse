package utils;

import model.Cars;

public class OutputUtils {
    private String WinnerNames;

    public static void printWinner(Cars cars) {
        System.out.println(cars.getWinner() + Message.WINNER_MSG.getMessage());
    }
}
