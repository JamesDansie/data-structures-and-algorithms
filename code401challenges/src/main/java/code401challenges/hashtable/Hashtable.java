package code401challenges.hashtable;

import org.checkerframework.checker.units.qual.K;

import java.util.Arrays;
import java.util.LinkedList;

public class Hashtable {
    //how to make an array of ll https://stackoverflow.com/questions/20202889/how-can-i-create-an-array-of-linked-lists-in-java
    public LinkedList<Storage>[] values = new LinkedList[10];

    public Hashtable(){
        for(int i = 0; i < values.length; i++){
            values[i] = new LinkedList<Storage>();
        }
    }

    public int hash(String key){
        return Math.abs((key == null ? 0 : key.hashCode()) % values.length);
    }

    public boolean add(String key, String value){
        boolean result = (contains(key) ? false : true);
        Storage thingToStore = new Storage(key, value);
        int index = hash(key);

        this.values[index].add(thingToStore);

        return result;
    }

    public String get(String key){
        int index = hash(key);

        LinkedList<Storage> llback = this.values[index];

        for(Storage storedThing : llback){
            if(key.equals(storedThing.getKey())){
                return storedThing.getValue();
            }
        }
        return null;
    }

    public boolean contains(String key){
        int index = hash(key);
        LinkedList<Storage> llback = this.values[index];

        boolean result = false;

        for(Storage storedThing : llback){
            if(key.equals(storedThing.getKey())){
                return true;
            }
        }

        return false;
    }

//    public static void main(String[] args){
//        Hashtable testTable = new Hashtable();
//        System.out.println("cat".hashCode());
//        System.out.println("cat".hashCode());
//        System.out.println(testTable.hash("cat"));
//        System.out.println(testTable.hash("cat"));
//
//        System.out.println(testTable.toString());
//        testTable.add("blah", "test");
//        testTable.add("3", "monkies");
//        System.out.println(testTable.toString());
//
//        System.out.println(testTable.get("3"));
//        System.out.println(testTable.contains("3"));
//        System.out.println(testTable.contains("lalalal"));
//
//        testTable.add("blah", "test");
//    }

    @Override
    public String toString() {
        return "Hashtable{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
