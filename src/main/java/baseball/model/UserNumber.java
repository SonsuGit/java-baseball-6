package baseball.model;

import java.util.List;

public class UserNumber {
    List<Integer> userNumbers;

    int retryOrExit;

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public int getRetryOrExit() {
        return retryOrExit;
    }

    public void setRetryOrExit(int retryOrExit) {
        this.retryOrExit = retryOrExit;
    }
}
