/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

/**
 * @date 8/10/19
 * @author 92060001
 * This is just a array practice with different types
 */
public class ArraySelfPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this is going to stor ethe numbers 0 - 4
//        int[] intArray = new int[5];
        int inArray[] = new int[5];
        
        inArray[0] = 5;
        inArray[1] = 10;
        inArray[2] = 15;
        inArray[3] = 20;
        inArray[4] = 25;
                        
        for(int i = 0; i < inArray.length; i++) {
            System.out.println("Element at index: " + inArray[i]); 
        }
        
        //double array 
        double dubArray[] = new double[6];
        double j = 1.5;
        
        //loop to populate the array
        for(int p = 0; p < dubArray.length; p++) {
            dubArray[p] = 5 * j;
            j++;
            System.out.println("Elements at index for double is: " + dubArray[p]);
        }
        
        //String Array
        String stArray[] = new String[3];
        
        stArray[0] = "Peter";
        stArray[1] = "John";
        stArray[2] = "Mary";
        
        for(int k = 0; k < stArray.length; k++) {
            System.out.println("Elements at index for string is: " + stArray[k]);
        }
    }
}
