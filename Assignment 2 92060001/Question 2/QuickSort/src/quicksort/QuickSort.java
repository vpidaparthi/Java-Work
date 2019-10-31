/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Peter
 * @Date 26/10/19
 * @version 1
 * @description this uses two arrays and the quick sort algorithm to sort them out as required.
 */

public class QuickSort {
    
    private CatalogueItem[] items;
    private int number;
    static int counter = 0; 

    public void sort(CatalogueItem[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.items = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = items[low + (high-low)/2].getItemId();

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (items[i].getItemId() < pivot) {
                i++;
                counter++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (items[j].getItemId() > pivot) {
                j--;
                counter++;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
//                counter++;
            }
            counter++;
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        CatalogueItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

 
    /* Prints the array */
    void printArray(CatalogueItem arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }
    
        private void quicksort2(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = items[low + (high-low)/2].getItemId();

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (items[i].getItemId() < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (items[j].getItemId() > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;

            }
        }
        // Recursion
        if (low < j)
            quicksort2(low, j);
        if (i < high)
            quicksort2(i, high);
    }

    private void exchange2(int i, int j) {
        CatalogueItem temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

 
    /* Prints the array */
    void printArray2(CatalogueItem arr2[])
    {
        int n = arr2.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr2[i].getItemId() + " "
                    + "name: " + arr2[i].getItemName() + " "
                    + "category: " + arr2[i].getCategory() + "\n");
        System.out.println();
        System.out.println();
    }    
    // Driver method to test above
    public static void main(String args[])
    {
        QuickSort ob = new QuickSort();
        
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
        
        CatalogueItem arr2[] = {
            new CatalogueItem( 9, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 6, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 5, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 4, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 3, "This book will save your life","Books"),
            new CatalogueItem( 2, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        System.out.println("The Unsorted array is");
        ob.printArray(arr);
        
         //apply sort
        ob.sort(arr);
        System.out.println("Total number of comparisons for first array: " + counter);
        System.out.println("The Quick Sorted array is");
        ob.printArray(arr);
        
        ob.sort(arr2);
        System.out.println("The Quick Sorted array in Reverse");
        System.out.println("Total number of comparisons reverse: " + counter);
        ob.printArray2(arr2);
        
         System.out.println("The difference in the performance between the data used it substantial. "
                + "The reason for this is cause it using best case data sets are the data is already provided "
                + "and it just needs to go through each iteration again but making it make to how it was which requires more iterations through the code.\n"
                + "The result of this is that it's better to have it mixed up and run through a sort than already sorted in such that it has to do everything in reverse. "
                + "This makes what's been done a second time not worth it for the code since it takes up to much time to run through the number of sorts required to be completed\n"
                + "by the algorithm.");
    }
}