/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Peter Seatter
 * @Date 29/10/19
 * @version 1
 * @Deseciption This program uses a java sort algorithm to sort out the array. 
 */
public class JavaSort {

    
    /* Prints the array */
    void printArray(CatalogueItem arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }
    
    
    static class itemId implements Comparator<CatalogueItem> { 
        // sorts the Id in ascending order
        public int compare(CatalogueItem a, CatalogueItem b) { 
            return a.getItemId() - b.getItemId(); 
        } 
    } 
    
    
    static class sortByCategory implements Comparator<CatalogueItem> { 
        // sorts the category in alphabetical order
        public int compare(CatalogueItem a, CatalogueItem b) { 
            return a.getCategory().compareTo(b.getCategory()) ; 
        } 
    } 
    
    
    // Driver method to test above
    public static void main(String args[]) {
        JavaSort ob = new JavaSort();
        
        CatalogueItem arr[] = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };   
        
        System.out.println("The array sorted by id using Java built in sort is");
        Arrays.sort(arr, new itemId()); 
        ob.printArray(arr);
        
        System.out.println("The array sorted by category using Java built in sort is");
        Arrays.sort(arr, new sortByCategory());
        ob.printArray(arr);   
        
        System.out.println("Out of the two algorithms that have been used which is the inuilt Java Sort and Quick Sort I would have to say that it would have to be Java Sort is better.\n"
                + "The reason for that is cause Quick sort takes more time to sort the algortim according to the Big O mathmatical notations. I feel that the data thats been used is the best and how it's been sorted was the best case.\n"
                + "From this the overall conclusion is that the in built Java Sort is better depending on the alogrithm required for the task at hand.\n"
                + "It's also good to have it as a binary structure in terms of how it searches the sorts out the algorithm or in a Array but it's good if it can be made simple to sort out the data and from that it will help you choose the algorithm suitable for the tasks at hand.");
    }
}
