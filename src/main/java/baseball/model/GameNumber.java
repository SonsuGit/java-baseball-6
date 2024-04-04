package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class GameNumber {
    int ballCount;
    int strikeCount;

    public GameNumber(int ballCount, int strikeCount, ArrayList<Integer> computerNumbers) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
        this.computerNumbers = computerNumbers;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public ArrayList<Integer> getComputerNumbers() {
        return computerNumbers;
    }

    public void setComputerNumbers(ArrayList<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    ArrayList<Integer> computerNumbers;
}
