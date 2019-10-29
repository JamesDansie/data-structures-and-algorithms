package code401challenges.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void firstRepeat() {
        String response = RepeatedWord.firstRepeat("The cat jumped over the dog.");
        assertEquals("the answer should be the",
                "the",
                response);
    }
}