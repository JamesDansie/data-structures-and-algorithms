package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    FizzBuzzTree test;
    @Before
    public void setUp() throws Exception {
        test = new FizzBuzzTree();
        test.add("1");
        test.add("3");
        test.add("7");
        test.add("5");
        test.add("15");
    }

    //Using a hash map to make a histogram to check randomness
    @Test
    public void randomInt() {
        HashMap<Integer, Integer> hist = new HashMap<Integer, Integer>();
        for(int i = 0; i < 300; i++){
            // we can think of random int as a coin toss
            Integer coin = test.randInt();
            Integer coinTotal = hist.get(coin);
            if (coinTotal == null){
                hist.put(coin, 1);
            } else {
                hist.put(coin, coinTotal+1);
            }
        }
        assertTrue("Should be more than 100 of each",
                hist.get(0) > 100 && hist.get(1) > 100);
        System.out.println(hist);
    }

    @Test
    public void fizzBuzz() {
        FizzBuzzTree blah = new FizzBuzzTree();
        blah.add("3");
        assertTrue("3".equals(blah.root.data));
        blah.FizzBuzzTree();
        assertTrue("Fizz".equals(blah.root.data));
    }

    @Test
    public void fizzBuzzBuzz() {
        FizzBuzzTree blah = new FizzBuzzTree();
        blah.add("5");
        assertTrue("5".equals(blah.root.data));
        blah.FizzBuzzTree();
        assertTrue("Buzz".equals(blah.root.data));
    }

    @Test
    public void fizzfizzBuzzBuzz() {
        FizzBuzzTree blah = new FizzBuzzTree();
        blah.add("15");
        assertTrue("15".equals(blah.root.data));
        blah.FizzBuzzTree();
        assertTrue("FizzBuzz".equals(blah.root.data));
    }

    @Test
    public void fizzBuzzTree() {
        test.inOrder();
        test.FizzBuzzTree();
        System.out.println("******* After Fizz Buzz ********");
        test.inOrder();
    }

}