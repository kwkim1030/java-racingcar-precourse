package model;

import utils.Message;
import utils.ValidatorUtils;

import java.util.Objects;

public class Car {
    private static final int MOVE_NUMBER = 3;

    private String name;
    private int distance;

    public Car(String name) {
        if (ValidatorUtils.exceedMaxLength(name)) {
            throw new IllegalArgumentException(Message.EXCEED_MAX_LENGTH_MSG.getMessage());
        }
        this.name = name;
    }

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void move(int randomNumber) {
        if (randomNumber > MOVE_NUMBER) {
            distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distance == car.distance && Objects.equals(getName(), car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), distance);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
