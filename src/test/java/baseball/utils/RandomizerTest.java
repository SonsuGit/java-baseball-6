package baseball.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static baseball.utils.Randomizer.getRandomNumArraylist;
import static org.junit.jupiter.api.Assertions.*;

class RandomizerTest {

    @DisplayName("랜덤넘버 어레이 테스트")
    @Test
    void testGetRandomNumArraylist() {

        int size = 3;
        int start = 1;
        int end = 9;

        List<Integer> nums = getRandomNumArraylist(size, start, end);

        // Check if the size of the list is equal
        assertEquals(size, nums.size());

        // Check if all numbers are in right range
        for(int num: nums){
            assertTrue(num>=start && num<=end);
        }

    }
}