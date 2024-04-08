package baseball.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

        // 입력된 3개의 숫자가 모든 다른 숫자인지
        checkUniqueNum(inputs);
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

    private void checkUniqueNum(ArrayList<Integer> inputs) throws IllegalArgumentException{
        Set<Integer> inputSet = new HashSet<>(inputs);
        if(inputs.size()!= inputSet.size()){
            throw new IllegalArgumentException();
        }
    }


}