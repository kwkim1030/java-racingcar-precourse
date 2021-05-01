package utils;

import model.Car;

import java.util.List;

public class ValidatorUtils {
    private static final int MAX_NAME_LENGTH = 5;

    public static boolean isBlank(String carNames) {
        return carNames == null || carNames.isEmpty();
    }

    public static boolean exceedMaxLength(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }

    public static boolean duplicateCarName(List<Car> cars, String carName) {
        int duplicateCnt = 0;
        for (Car car : cars) {
            duplicateCnt += countDuplicate(car, carName);
        }
        return duplicateCnt > 0;
    }

    private static int countDuplicate(Car car, String carName) {
        int cnt = 0;
        if (carName.equals(car.getName())) {
            cnt++;
        }
        return cnt;
    }
}
