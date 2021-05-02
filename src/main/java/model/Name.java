package model;

import utils.Message;
import utils.ValidatorUtils;

public class Name {
    private final String name;

    public Name(String name) {
        if (ValidatorUtils.exceedMaxLength(name)) {
            throw new IllegalArgumentException(Message.EXCEED_MAX_LENGTH_MSG.getMessage());
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
