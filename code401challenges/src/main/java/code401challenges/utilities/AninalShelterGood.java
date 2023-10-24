package code401challenges.utilities;

import java.util.LinkedList;
import java.util.Queue;

public class AninalShelterGood {
    Queue<Animal> queue = new LinkedList<>();

    public void enqueue(Animal in){
        queue.add(in);
    }

    public Animal dequeue(){
        return queue.poll();
    }
}
