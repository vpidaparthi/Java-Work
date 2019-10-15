/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Peter Seatter
 * @Date 11/10/19
 * @version 1
 * You'll be able to access records from script and then remove them if you choose from the array and if you choose delete it as well.
 *
 */
public class HospitalRecords {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        //the array list that stores all the information required
        ArrayList<Patient> patList = new ArrayList<>();
        Boolean foundPatId=false;
        
        String path = "E:\\CPP\\Data Structure & Algorithms\\Practical Task 1\\Question 1\\ListOfPatients.txt";
        //user path to the ListOfPatients.txt here
        
        LineNumberReader lr = null;
        //allows to read information from the file line by line
        String[] oneRecord = new String[4];
       
        //an array to store info about one patient
        Patient pat;
        try {
            //using try-catch for exeption handling to cathc possible
            //erros with i/o operations
            FileReader inputStream = new FileReader(path);
            //FileReader reads the file's contents
            lr = new LineNumberReader(inputStream);
            String str;
           
            while((str = lr.readLine()) != null) {
                //while the next line exists
                oneRecord = str.split(",");
                //dividing one file line by commas and assigning to array
                pat = new Patient(oneRecord[0], oneRecord[1], oneRecord[2], oneRecord[3]);
                patList.add(pat);
            }
        }
        catch(IOException ioe) {
            System.out.println("IOExcception occured");
        }
        //sets the loop to true and changes when it's needed to end.
        boolean running = true;
       
        //it does what's inside the loop while the boolean expression is true
        do {
            //asks the user for input and then stores it and goes to the if statement and if not then the else statement
            Scanner scannerObject = new Scanner(System.in);
            System.out.println("Press S for search, Press E for exit: ");
            String userInput = scannerObject.nextLine();
            System.out.println(userInput.toUpperCase());
            String outcome = userInput.toUpperCase();

            //It states if the user inputs S then it will ask for the Patient ID else it will say bye
            if("S".equals(outcome)) {
                System.out.println("Enter Patient ID to search");
                String patientIdInput = scannerObject.nextLine();
                String chosenId = patientIdInput.toUpperCase();
                System.out.println(patientIdInput.toUpperCase());
                
                //it checks i against the patList and if true then executes the if statement inside the for loop
                for (int i=0; i<patList.size();i++) {
                    Patient patient = (Patient)patList.get(i);
                   
                    if(chosenId.equals(patient.patientId)){
                        foundPatId = true;
                        System.out.println(patient.toString());
                        System.out.println("Would you like to remove the paitent's"
                                + " record(s)? \nY or N?");
                        String userDelete = scannerObject.nextLine();
                        String confirmDelete = userDelete.toUpperCase();
                        System.out.println(userDelete.toUpperCase());
                        
                        //if the records is said yes to be deleted then it will remove it from the patList if your don't
                        //then the else statement is executed.
                        if(confirmDelete.equals("Y")) {
                           patList.remove(patient);
                            System.out.println("Record(s) removed sucessfully");
                        } else {
                            System.out.println("You didn't want to remove the record");
                        }
                        //changes foundPatId back to false if the chosenId doesn't equal the patient.patientId
                    } else {
                        foundPatId = false;
                    }
                }
                //changes the running boolean expression to false so it ends and prints out bye and ends the program.
            } else {
                running = false;
                System.out.println("Bye...");
                break;
            }          
            
            //it mentions that if foundPatId returns false on the check then it will say that the search didn't find a 
            //matching patient
            if(foundPatId == false){
                System.out.println("The search found no matching patient");
            }
            //this allows for the program to be ended if you select e and foundPatId is false
            else if ("E".equals(outcome)) {
                System.out.print("\nBye...\n");
                System.exit(0);
            }
         //keeps the do loop continuing until it is false
        } while (running == true);
    }
}