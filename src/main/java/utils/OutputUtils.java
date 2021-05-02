package utils;

import model.Cars;

public class OutputUtils {

    public static void printWinner(Cars cars) {
        System.out.println(cars.getWinner() + Message.WINNER_MSG.getMessage());
    }

    public static void printDoResult() {
        System.out.println('\n' + Message.DO_RESULT_MST.getMessage());
    }

    public static void printRaceResult(Cars cars) {
        System.out.println(cars.getRaceStatus());
    }
}
