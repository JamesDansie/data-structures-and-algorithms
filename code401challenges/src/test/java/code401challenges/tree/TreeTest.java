package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TreeTest {
    Tree test;
    @Before
    public void setUp() throws Exception {
        test = new Tree();
        test.add(6);
        test.add(4);
        test.add(8);
        test.add(3);
        test.add(5);
        test.add(7);
        test.add(9);
    }

    //Using a hash map to make a histogram to check randomness
    @Test
    public void randomInt() {
        HashMap<Integer, Integer> hist = new HashMap<Integer, Integer>();
        for(int i = 0; i < 300; i++){
            // we can think of random int as a coin toss
            Integer coin = test.randomInt();
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
    public void contains() {
        test.contains(3);
    }
}