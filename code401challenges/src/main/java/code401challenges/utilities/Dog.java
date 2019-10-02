package code401challenges.utilities;

public class Dog implements Animal{
    String name;

    Dog(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("Woof!");
    }
}
