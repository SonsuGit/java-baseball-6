package baseball.model;

import java.util.List;

public class GameNumber {
    int ballCount;
    int strikeCount;

    public GameNumber(int ballCount, int strikeCount, List<Integer> computerNumbers) {
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

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }

    public void setComputerNumbers(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    List<Integer> computerNumbers;
}
