package utils;

public enum Message {
    NAME_MSG("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    TRY_MSG("시도할 회수는 몇회인가요?"),
    EXCEED_MAX_LENGTH_MSG("자동차의 이름은 5자를 초과할 수 없습니다."),
    DUPLICATE_NAME_MSG("자동차의 이름은 중복될 수 없습니다."),
    BLACK_CAR_NAMES_MSG("자동차의 이름을 입력하여 주세요."),
    INVALID_TRY_COUNT_MSG("1 이상의 숫자를 입력해 주세요."),
    WINNER_MSG("가 최종 우승했습니다.");

    final private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
