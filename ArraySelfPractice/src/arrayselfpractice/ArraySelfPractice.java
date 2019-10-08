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
        
        //MULTI-DIMENSIONAL Arrays
        int multiArray[] [] = new int[6] [5];
        
        multiArray[0] [0] = 10; multiArray[1] [0] = 20;
        multiArray[0] [1] = 12; multiArray[1] [1] = 45;
        multiArray[0] [2] = 43; multiArray[1] [2] = 56;
        multiArray[0] [3] = 11; multiArray[1] [3] = 1;
        multiArray[0] [4] = 22; multiArray[1] [4] = 33;
        
        multiArray[2] [0] = 30; multiArray[3] [0] = 40;
        multiArray[2] [1] = 67; multiArray[3] [1] = 12;
        multiArray[2] [2] = 32; multiArray[3] [2] = 87;
        multiArray[2] [3] = 14; multiArray[3] [3] = 14;
        multiArray[2] [4] = 44; multiArray[3] [4] = 55;
        
        multiArray[4] [0] = 50; multiArray[5] [0] = 60;
        multiArray[4] [1] = 86; multiArray[5] [1] = 56;
        multiArray[4] [2] = 66; multiArray[5] [2] = 44;
        multiArray[4] [3] = 13; multiArray[5] [3] = 12;
        multiArray[4] [4] = 66; multiArray[5] [4] = 11;
        
        int rows = 6;
        int coloumns = 5;
        int p, k;
        
        for(p = 0; p < rows; p++) {
            for(k = 0; k < coloumns; k++) {
                System.out.println(multiArray[p] [k] + " ");
            }
            System.out.println("");
        }
    }
}
