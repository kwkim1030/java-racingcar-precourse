package utils;

import model.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidatorUtilsTest {

    @Test
    @DisplayName("빈 값 체크 테스트")
    public void 공백_Test() {
        assertThat(ValidatorUtils.isBlank("abs")).isFalse();
        assertThat(ValidatorUtils.isBlank("")).isTrue();
    }

    @Test
    @DisplayName("이름길이 초과 테스트")
    public void 이름길이_Test() {
        assertThat(ValidatorUtils.exceedMaxLength("kwkim")).isFalse();
        assertThat(ValidatorUtils.exceedMaxLength("abweqdsdd")).isTrue();
    }

    @Test
    @DisplayName("시도횟수 테스트")
    public void 시도횟수_Test() {
        assertThat(ValidatorUtils.checkTryCnt(3)).isFalse();
        assertThat(ValidatorUtils.checkTryCnt(0)).isTrue();
    }

    @Test
    @DisplayName("중복 이름 테스트")
    public void 이름중복_Test() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("a"));
        carList.add(new Car("b"));
        carList.add(new Car("c"));
        assertThat(ValidatorUtils.duplicateCarName(carList, "a")).isTrue();
        assertThat(ValidatorUtils.duplicateCarName(carList, "d")).isFalse();
    }
}
