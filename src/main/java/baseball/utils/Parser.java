package baseball.utils;

import java.util.ArrayList;

public class Parser {

    public void parseInput(ArrayList<Integer> inputs, int size, int min, int max) throws IllegalArgumentException{
        // 크기가 맞는지(여기선 3개의 숫자)
        checkSize(inputs, size);

        // 인풋 자체를 숫자로 받았는지(받은걸 숫자로 변환할 예정이라 필요 없을듯)
        // checkNum(inputs);

        // 숫자가 범위에 맞는지(여기선 1~9)
        checkRightNum(inputs, min, max);
    }

    private void checkSize(ArrayList<Integer> inputs, int size) throws IllegalArgumentException{
        if (inputs.size()!=size){
            throw new IllegalArgumentException();
        }

    }


    private void checkRightNum(ArrayList<Integer> inputs, int min, int max) throws IllegalArgumentException{
        for (int nums: inputs) {
            if(nums < min || nums > max) {
                throw new IllegalArgumentException();
            }
        }
    }


}