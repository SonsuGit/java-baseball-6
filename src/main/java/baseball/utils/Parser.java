package baseball.utils;

import java.util.ArrayList;

public class Parser {

    public ArrayList<Integer> stringIntoArrayList(String input) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<input.length();i++) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            arrayList.add(digit);
        }

        return arrayList;
    }
    public void parseInput(ArrayList<Integer> inputs, int size, int min, int max) throws IllegalArgumentException{
        // 크기가 맞는지(여기선 3개의 숫자)
        checkSize(inputs, size);

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