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
 * @description it validates bracket expressions to see if they are valid or invalid
 */
public class ExpressionValidation {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to the exression validating program\n");
        
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter your expression: ");
        String b = scannerObject.nextLine();
        System.out.println(b);
        
        System.out.println("Enter your opening character to validate: ");
        char open = scannerObject.next().charAt(0);
        System.out.println(open);
        
        System.out.println("Enter your closing character to validate: ");
        char close = scannerObject.next().charAt(0);
        System.out.println(close);
        
//        String userInputs = b + open + close;
                   
        BracketValidation v = new BracketValidation();
        System.out.println("The expression is valided " + v.validation(b, open, close));
    }
    
}
