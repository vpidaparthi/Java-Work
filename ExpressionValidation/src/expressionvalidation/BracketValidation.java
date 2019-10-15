/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionvalidation;

import java.util.*;

/**
 *
 * @author Peter Seatter
 * @date 15/10/19
 * @version 1
 * @description 
 */
public class BracketValidation {
//    private String brackets;
    
    
//    public BracketValidation(String s) {
//        this.brackets = s;
//    }
    
    
    public static boolean validation(String b, char open, char close) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        char current; //previous;
        for(int i = 0; i < b.length(); i++) {
            current = b.charAt(i);
            if(current == open ) {
                stack.push(current);
            } else if(current == close) {
                if(stack.isEmpty()) {
                    result = false;
                    return result;
                } else if(current == close){
                    //previous = stack.peek();
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            result = false;
        }
        
//        if (stack.size() == 0) {
//            result = true;
//        }
        return result;
    }
    
    
}
