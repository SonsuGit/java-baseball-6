package baseball.service;

import baseball.view.outputView;

import java.util.ArrayList;

public class GameService {
    // Todo 컴퓨터 인풋과 유저 인풋을 비교하여 동일하면(=게임 끝) true 를 반환하는 메소드
    public boolean numberChecker(
            ArrayList<Integer> computerNumbers, ArrayList<Integer> userNumbers,
            int ballCount, int strikeCount) {
        // Todo 루프를 돌아서 체크(strike인지 체크하고 아니면 그때 ball 체크)
        for(int index = 0; index<userNumbers.size(); index++){
            if(strikeCounter(userNumbers.get(index), index, computerNumbers)){
                strikeCount += 1;
            }else if(ballCounter(userNumbers.get(index), computerNumbers)){
                ballCount += 1;
            }
        }
        if(ballCount==0 && strikeCount == 0){
            outputView.printNothing();
        }
        if(ballCount!=0){
            outputView.printBall(ballCount);
        }
        if(strikeCount!=0){
            outputView.printStrike(strikeCount);
        }
        System.out.println();

        if(strikeCount == 3){
            return true;
        }
        return false;
    }
    private boolean ballCounter(int userNumber, ArrayList<Integer> computerNumbers){
        for(int computerNumber : computerNumbers){
            if (userNumber == computerNumber){
                return true;
            }
        }
        return false;
    }

    private boolean strikeCounter(int userNum, int index, ArrayList<Integer> computerNumbers) {
        if(userNum == computerNumbers.get(index)){
            return true;
        }
        return false;
    }
}

