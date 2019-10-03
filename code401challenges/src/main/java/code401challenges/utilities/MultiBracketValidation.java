package code401challenges.utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack<String> braces = new Stack<>();
        if(input.length() < 2){
            return false;
        }

        for(int i = 0; i < input.length(); i++){

            String letterIn = Character.toString(input.charAt(i));

            if(
            letterIn.equals("(") ||
            letterIn.equals("{") ||
            letterIn.equals("[")
            ){
                braces.push(letterIn);
            } else if(letterIn.equals(")")){
                if(!braces.pop().equals("(")){
                    return false;
                }
            }else if(letterIn.equals("}")){
                if(!braces.pop().equals("{")){
                    return false;
                }
            }else if(letterIn.equals("]")){
                if(!braces.pop().equals("[")){
                    return false;
                }
            }
        }
        return true;
    }
}
