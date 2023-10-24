package code401challenges.utilities;

public class Cat implements Animal{
    String name;
    Cat(String name){
        this.name = name;
    }
    public void sound(){
        System.out.println("Meow");
    }
    public void hungry(){
        System.out.println("I'm fat");
    }
}
