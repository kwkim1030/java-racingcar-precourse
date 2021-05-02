package model;

import utils.Message;
import utils.ValidatorUtils;

public class Try {
    private int tryCnt;

    public Try(int tryCnt) {
        if (ValidatorUtils.checkTryCnt(tryCnt)) {
            throw new IllegalArgumentException(Message.INVALID_TRY_COUNT_MSG.getMessage());
        }
        this.tryCnt = tryCnt;
    }

    public int getTryCnt() {
        return tryCnt;
    }

    public void move() {
        tryCnt --;
    }

    public boolean checkRemainCnt() {
        return tryCnt > 0;
    }
}
