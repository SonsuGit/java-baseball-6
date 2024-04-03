package baseball;

import baseball.view.inputView;
import baseball.view.outputView;

public class Controller {

    public void run(){
        startGame();
        askRetry();
    }
    private void startGame() {

        // 기본적인 변수 설정 - ballCount를 0으로 하는 등

        // 입력하라는 메시지 출력
        inputView.printInputRequiredMessage();

        // 입력을 받음

        // 받은 입력이 3스트라이크가 아니면 계속 루프

        // 맞으면 끝났다는 메시지 출력
        outputView.printGameEnd();

    }

    private void askRetry() {
        inputView.printRetryMessage();
        // 그 다음 인풋을 받고, 1이면 run(), 2면 종료
    }
}
