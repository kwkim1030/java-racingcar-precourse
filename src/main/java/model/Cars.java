package model;

import utils.Message;
import utils.ValidatorUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {
    private final static int MAX_RANDOM_BOUND = 10;

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

    public void move() {
        for (Car car : cars) {
            car.move(generateRandomNumber());
        }
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_BOUND);
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
