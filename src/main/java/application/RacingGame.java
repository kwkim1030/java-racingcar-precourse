package application;

import model.Cars;
import utils.InputUtils;

public class RacingGame {
    private Cars cars;

    public void startGame() {
        String carNames = InputUtils.inputCarName();
        cars = new Cars(carNames);
        int tryCount = InputUtils.inputTry();
    }
}
