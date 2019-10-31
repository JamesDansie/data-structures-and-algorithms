package code401challenges.LeftJoin;

import code401challenges.hashtable.Hashtable;
import code401challenges.hashtable.Storage;

import java.util.LinkedList;

public class LeftJoin {
    public static LinkedList<String>[] mushLeftIntoRight (Hashtable ht1, Hashtable ht2){
        LinkedList<Storage>[] data1 = ht1.values;
        LinkedList<String>[] ans = new LinkedList[data1.length];

        for(int i = 0; i < data1.length; i++){
            ans[i] = new LinkedList<String>();
        }
        for(int i = 0; i < data1.length; i++){
            for(Storage item : data1[i]) {
                ans[i].add(item.getKey());
                ans[i].add(item.getValue());
                ans[i].add(ht2.get(item.getKey()));
            }
        }
        return ans;
    }
}
