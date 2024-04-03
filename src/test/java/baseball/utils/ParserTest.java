package baseball.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    private Parser parser;
    private ArrayList<Integer> inputs;

    @BeforeEach
    void beforeEach(){
        parser = new Parser();
        inputs = new ArrayList<>();
    }

    @AfterEach
    void afterEach(){
        inputs.clear();
    }
    @DisplayName("Parser 테스트")
    @Test
    public void testParseInput() {
        inputs.add(1);
        inputs.add(5);
        inputs.add(2);
        assertDoesNotThrow(() -> parser.parseInput(inputs, 3, 1, 9));
    }

    @DisplayName("Parser 에러 테스트")
    @Test
    public void testParseInputException() {
        inputs.add(1);
        inputs.add(5);
        //inputs.add(2);
        assertThrows(IllegalArgumentException.class, () -> parser.parseInput(inputs, 3, 1, 9));
    }


    @Test
    void testStringIntoArrayList() {
        String testString = "352";
        ArrayList<Integer> arrayList = parser.stringIntoArrayList(testString);

        assertEquals(testString.length(), arrayList.size());
        assertDoesNotThrow(() -> parser.parseInput(arrayList, 3, 1, 9));
    }
}