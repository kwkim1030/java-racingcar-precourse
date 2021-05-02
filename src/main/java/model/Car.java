package model;

import java.util.Objects;

public class Car {
    private static final int MOVE_NUMBER = 3;

    private Name name;
    private Distance distance;

    public Car(String name) {
        this.name = new Name(name);
        this.distance = new Distance();
    }

    public Car(String name, int distance) {
        this.name = new Name(name);
        this.distance = new Distance();
    }

    public void move(int randomNumber) {
        if (randomNumber > MOVE_NUMBER) {
            this.distance = distance.move();
        }
    }

    public String getWinnerNames(int maxDistance, StringBuilder sb) {
        if (isWinner(maxDistance)) {
            sb.append(", ").append(name.getName());
        }
        return sb.toString();
    }

    public String getRaceStatus() {
        StringBuilder status = new StringBuilder();
        for (int i = 0 ; i < distance.getDistance() ; i ++) {
            status.append("-");
        }
        return status.toString();
    }

    private boolean isWinner(int maxDistance) {
        return distance.equals(new Distance(maxDistance));
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
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
