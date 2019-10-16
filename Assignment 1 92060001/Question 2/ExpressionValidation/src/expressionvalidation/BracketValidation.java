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
 * @description holds the main functionality of the ExpressionValidation program
 */
public class BracketValidation {

    //sets the validation method linking to the expression validation
    public static boolean validation(String b, char open, char close) {
        //sets the result to true until stated otherwise
        boolean result = true;
        //creates the stack which stores the information
        Stack<Character> stack = new Stack<>();
        char current;
        //has a for loop which then compares the string length and initiates the loop
        for(int i = 0; i < b.length(); i++) {
            current = b.charAt(i);
            if(current == open ) {
                stack.push(current);
            } else if(current == close) {
                //if the stack is empty then it will then make the result turn false and end the loop
                if(stack.isEmpty()) {
                    result = false;
                    return result;
                // this removes the elemont from the stack
                } else if(current == close){
                    stack.pop();
                }
            }
        }
        // if the stack is not empty then it will return the result of false
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
    
    
}
