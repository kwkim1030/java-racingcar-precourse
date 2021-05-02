package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    Car car;

    @BeforeEach
    public void setCar() {
        car = new Car("aa");
    }

    @Test
    @DisplayName("자동차 이동 Test")
    public void 자동차_이동_TEST() {
        car.move(4);
        assertThat(car.getDistance()).isEqualTo(1);

        car.move(2);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 위치 출력 Test")
    public void 자동차_위치_TEST() {
        car = new Car("kwkim", 5);
        assertThat(car.getRaceStatus()).isEqualTo("-----");
    }

    @Test
    @DisplayName("우승 자동차 출력 Test")
    public void 자동차_우승_TEST() {
        car = new Car("kwkim", 5);
        StringBuilder sb = new StringBuilder();
        assertThat(car.getWinnerNames(5,sb)).isEqualTo(", kwkim");
    }
}
