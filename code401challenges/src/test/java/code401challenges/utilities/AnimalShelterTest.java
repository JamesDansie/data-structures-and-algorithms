package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    AnimalShelter test;
    @Before
    public void setUp() throws Exception {
        test = new AnimalShelter();
        test.enqueue(new Dog("Dog 1"));
        test.enqueue(new Dog("Dog 2"));
        test.enqueue(new Cat("Cat 1"));
        test.enqueue(new Cat("Cat 2"));
;    }

    @Test
    public void dequeue() {
        Animal dog = test.dequeue("dog");
        assertEquals("Dog 1 should be first",
                "Dog 1",
                dog.name);
    }
}