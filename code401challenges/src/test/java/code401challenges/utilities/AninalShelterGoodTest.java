package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AninalShelterGoodTest {

    @Test
    public void enqueue() {
        AninalShelterGood test = new AninalShelterGood();
        test.enqueue(new Dog("Dog 1"));
        test.enqueue(new Dog("Dog 2"));
        test.enqueue(new Cat("Cat 1"));
        test.enqueue(new Cat("Cat 2"));

        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());

//        System.out.println(test.dequeue());

        Animal stuffBack = test.dequeue();
        System.out.println("***************** stuff back *************");
        System.out.println(stuffBack);
        stuffBack.sound();
//        stuffBack.hungry();



    }

    @Test
    public void dequeue() {
    }
}