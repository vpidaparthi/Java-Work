/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

/**
 * @date 8/10/19
 * @author Peter Seatter
 * One Dimensional array tasks on grades so I'll be putting together multiple
 * arrays
 */
public class ArrayTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A string array that will contain a length of 5
        String stuArray[] = new String[5];
        
        stuArray[0] = "A";
        stuArray[1] = "B";
        stuArray[2] = "";
        stuArray[3] = "D";
        stuArray[4] = "F";
        
        //a loop while will output the whole array
        for(int i = 0; i < stuArray.length; i++) {
            System.out.println("The grades are: " + stuArray[i]);
        }
        
        //Copying a string that will take stuArray and put it into stuArray2
        String stuArray2[] = stuArray;
        
        //Adding the C to position 2 in the new array
        stuArray2[2] = "C";
       
        for(int a = 0; a < stuArray2.length; a++) {
            System.out.println("The grades are: " + stuArray2[a]);
        }
        
        //subjects array with an index of 3
        String subsArray1[] = new String[3];
        
        subsArray1[0]= "IT";
        subsArray1[1] = "English";
        subsArray1[2] = "Science";
        
        //outputs the second element
        System.out.println(subsArray1[1]);
        
        //creating another array which includes copying previous array
        String subsArray2[] = new String[5];
        
        //array copy method and that you first get the subsArray1 then say from
        //where you start from then the location with the length of the length 
        //you would like copied ie 3 elements or array.length for the whole array
        System.arraycopy(subsArray1, 0, subsArray2, 0, subsArray1.length);
        
        //adding two more elements to the 
        subsArray2[3] = "History";
        subsArray2[4] = "Classics";
        
        for(int s = 0; s < subsArray2.length; s++) {
            System.out.println("The subjects are: " + subsArray2[s]);
        }
    }
    
}
