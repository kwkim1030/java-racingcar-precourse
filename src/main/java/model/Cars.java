package model;

import utils.Message;
import utils.ValidatorUtils;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String carNames) {
        if (ValidatorUtils.isBlank(carNames)) {
            throw new IllegalArgumentException(Message.BLACK_CAR_NAMES_MSG.getMessage());
        }
        String [] carNameArr = carNames.split(",");
        List<Car> cars = new ArrayList<>();

        for (String carName : carNameArr) {
            addCars(cars, carName);
        }

        this.cars = cars;
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    private void addCars(List<Car> cars, String carName) {
        if (ValidatorUtils.duplicateCarName(cars, carName)) {
            throw new IllegalArgumentException(Message.DUPLICATE_NAME_MSG.getMessage());
        }
        cars.add(new Car(carName));
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }
}
