package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TryTest {
    Try tryCnt;

    @BeforeEach
    public void setUp() {
        tryCnt = new Try(2);
    }

    @Test
    @DisplayName("Try 생성 테스트")
    public void Try_생성_Test () {
        assertThat(tryCnt.getTryCnt()).isEqualTo(2);
    }

    @Test
    @DisplayName("tryCnt 가 1 이상 남아있는지 테스트")
    public void Try_Remain_Test () {
        assertThat(tryCnt.checkRemainCnt()).isEqualTo(true);
    }
}
