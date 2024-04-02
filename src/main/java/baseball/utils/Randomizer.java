package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Randomizer {

    public static List<Integer> getRandomNumArraylist(int size, int start, int end) {

        List<Integer> nums = new ArrayList<>();

        while(nums.size() < size){
            int randomNum = getRandomNum(start, end);
            if(!nums.contains(randomNum)){
                nums.add(randomNum);
            }
        }

        return nums;

    }

    private static int getRandomNum(int start, int end) {
        return Randoms.pickNumberInRange(start, end);
    }
}
