package code401challenges.RepeatedWord;

import code401challenges.hashtable.Hashtable;

import java.util.Scanner;

public class RepeatedWord {
    public static String firstRepeat(String strIn){
        Scanner sc = new Scanner(strIn);
        Hashtable ht = new Hashtable();
        while(sc.hasNext()){
            String word = sc.next().toLowerCase();
            if(ht.contains(word)){
                return word;
            } else {
                ht.add(word, null);
            }
        }
        return null;
    }
}
