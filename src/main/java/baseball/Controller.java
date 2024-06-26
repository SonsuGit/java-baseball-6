package baseball;

import baseball.model.GameNumber;
import baseball.model.UserNumber;
import baseball.service.GameService;
import baseball.utils.Parser;
import baseball.utils.Randomizer;
import baseball.view.inputView;
import baseball.view.outputView;

import java.util.ArrayList;

public class Controller {

    public void run(){
        setGame();
        startGame();
        askRetry();
    }
    private GameNumber gameNumber;
    private UserNumber userNumber;
    private Parser parser;
    private GameService gameService;
    private int ballCount;
    private int strikeCount;

    private void setGame() {
        // 기본적인 변수 설정 - ballCount를 0으로 하는 등
        ballCount = 0;
        strikeCount = 0;
        ArrayList<Integer> computerNumbers = Randomizer.getRandomNumArraylist(3,1,9);
        gameNumber = new GameNumber(ballCount, strikeCount, computerNumbers);
        userNumber = new UserNumber();
        gameService = new GameService();
    }

    private void startGame() {
        // 입력하라는 메시지 출력
        inputView.printInputRequiredMessage();

        // 입력을 받음
        parser = new Parser();
        String userInputString = inputView.getUserInput();
        ArrayList<Integer> inputArray = parser.stringIntoArrayList(userInputString);
        parser.parseInput(inputArray,3,1,9);
        userNumber.setUserNumbers(inputArray);

        //TODO 받은 입력이 3스트라이크가 아니면 계속 루프
        if(!gameService.numberChecker(
                gameNumber.getComputerNumbers(),userNumber.getUserNumbers(),
                ballCount,strikeCount)
        ) startGame();
    }

    private void askRetry() {

        // 맞으면 끝났다는 메시지 출력
        outputView.printGameEnd();
        // 다시 할거냐고 물어봄
        inputView.printRetryMessage();

        //TODO 그 다음 인풋을 받고, 1이면 run(), 2면 종료
        String userInputString = inputView.getUserInput();
        if(userInputString.equals("1")){
            run();
        }

    }
}
