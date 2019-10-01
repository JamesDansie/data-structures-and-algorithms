package code401challenges;


import code401challenges.stacksandqueues.Stack;

public class PseudoQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int value){
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        s1.push(value);
    }

    public int dequeue(){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        return s2.pop();
    }
}
