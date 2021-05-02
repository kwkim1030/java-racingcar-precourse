package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {

    @Test
    @DisplayName("Cars 생성 테스트")
    public void Cars_생성_Test () {
        Cars cars = new Cars("ab,bc,cd,de");
        assertThat(cars.getCars().size()).isEqualTo(4);
    }
}
