package code401challenges.utilities;


import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    Queue<Dog> dogQueue = new LinkedList<>();
    Queue<Cat> catQueue = new LinkedList<>();

    public void enqueue(Cat catIn){
        catQueue.add(catIn);
    }

    public void enqueue(Dog dogIn){
        dogQueue.add(dogIn);
    }

    public Cat dequeue(String pref){
        if(pref.toLowerCase().equals("cat")){
            return catQueue.remove();
        } else {
            return null;
        }
    }

    //Code is unhappy from conflicts with dequeue. Should have made
    //cat and dog implement and animal interface and used animal as
    //the return type. Screw it, bed time.
    public Dog dequeue(String pref){
        if(pref.toLowerCase().equals("dog")){
            return dogQueue.remove();
        } else {
            return null;
        }
    }
}
