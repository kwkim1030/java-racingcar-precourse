package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {

    @Test
    @DisplayName("Cars 생성 테스트")
    public void Cars_생성_Test () {
        Cars cars = new Cars("ab,bc,cd,de");
        assertThat(cars.getCars().size()).isEqualTo(4);
    }

    @Test
    @DisplayName("Cars 우승거리 테스트")
    public void Cars_우승거리_Test () {
        Car a = new Car("a", 5);
        Car b = new Car("b", 4);
        Car c = new Car("c", 4);
        List<Car> carList = new ArrayList<>();
        carList.add(a);
        carList.add(b);
        carList.add(c);

        Cars cars = new Cars(carList);


        assertThat(cars.getMaxDistance()).isEqualTo(5);
    }

    @Test
    @DisplayName("Cars 우승자 테스트")
    public void Cars_우승자_Test () {
        Car a = new Car("a", 5);
        Car b = new Car("b", 4);
        Car c = new Car("c", 5);
        List<Car> carList = new ArrayList<>();
        carList.add(a);
        carList.add(b);
        carList.add(c);

        Cars cars = new Cars(carList);


        assertThat(cars.getWinner()).isEqualTo("a, c");
    }
}
