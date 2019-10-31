package code401challenges.LeftJoin;

import code401challenges.hashtable.Hashtable;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void mushLeftIntoRight() {
        Hashtable ht1 = new Hashtable();
        Hashtable ht2 = new Hashtable();
        ht1.add("cat", "feline");
        ht1.add("dog", "canine");
        ht1.add("student", "learner");
        ht2.add("cat", "nice");
        ht2.add("dog", "smells nice");
        ht2.add("car", "cheap");

        LinkedList<String>[] ans = LeftJoin.mushLeftIntoRight(ht1, ht2);
//        System.out.println(Arrays.toString(ans));
        //I know I shouldn't test like this, but how to check otherwise?
        assertEquals("Should have cat, dog, and student, but not car",
                "[[], [], [cat, feline, nice], [], [dog, canine, smells nice], [student, learner, null], [], [], [], []]",
                Arrays.toString(ans));
    }
}