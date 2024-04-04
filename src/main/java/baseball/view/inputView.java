package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class inputView {

    public static void printInputRequiredMessage() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public static void printRetryMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static String getUserInput() {
        return Console.readLine();
    }
}
