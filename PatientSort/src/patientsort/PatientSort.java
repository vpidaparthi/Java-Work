/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsort;

/**
 *
 * @author 92060001
 */
public class PatientSort {

    /**
     * @param args the command line arguments
     */
    public void doOptimisedBubbleSort(Patient[] arr) {
      int n = arr.length-1;
      for(int i=1; i< n-1; i++) {
        boolean is_sorted = true;
        int currentSwap = -1;

        for(int j=0; j < n-i-1; j++) {
          //only sort by days where the department names are equal
          if(/*arr[j].getName().compareTo(arr[j + 1].getName()) == 0 &&*/ arr[j].getDaysSpentInHospital() <= arr[j + 1].getDaysSpentInHospital()) {
            
            //swap temp and arr[i]
            Patient temp = arr[i];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            is_sorted = false;
            currentSwap = j;
          }
        }

        if(is_sorted) return;
        n = currentSwap;
      }
    }
 
    /* Prints the array */
    void printArray(Patient[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println();
        }
    }
    
    // Driver method to test above
    public static void main(String args[]) {
        PatientSort ob = new PatientSort();
        Patient arr[] = {
            new Patient("Joe", 5, "Ortho"),
            new Patient("Jane", 3, "Paediatrics"),
            new Patient("Harry", 6, "Paediatrics"),
            new Patient("Keizer", 2, "Paediatrics"),
            new Patient("Keith", 1, "Ortho"),
            new Patient("Ben", 1, "Ortho"),
            new Patient("Sara", 5, "Paediatrics")
        };
        
        System.out.println("The Unsorted array is");
        ob.printArray(arr);
        
         //apply sort
        ob.doOptimisedBubbleSort(arr);
        System.out.println("The Optimised Bubble Sorted array is" );
        ob.printArray(arr);
    }
    
}
