package application;

import model.Cars;
import model.Try;
import utils.InputUtils;

public class RacingGame {
    private Cars cars;
    private Try tryCnt;

    public void startGame() {
        cars = new Cars(InputUtils.inputCarName());
        tryCnt = new Try(InputUtils.inputTry());

        while(tryCnt.checkRemainCnt()) {
            race();
        }
    }

    private void race() {
        tryCnt.move();
        cars.move();
    }
}
