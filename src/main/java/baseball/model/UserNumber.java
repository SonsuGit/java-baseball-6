package baseball.model;

import java.util.ArrayList;

public class UserNumber {
    ArrayList<Integer> userNumbers;

    int retryOrExit;

    public ArrayList<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(ArrayList<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public int getRetryOrExit() {
        return retryOrExit;
    }

    public void setRetryOrExit(int retryOrExit) {
        this.retryOrExit = retryOrExit;
    }
}
