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
 * You'll be able to access records from script and then remove them if you choose from the array.
 *
 */
public class HospitalRecords {

    /**
     * @param args the command line arguments
     */
 
    //a method to obtain the records of the patients
   
    public static void main(String[] args) {
        // Asking the user for input
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
        boolean running = true;
       
        do {
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

                        if(confirmDelete.equals("Y")) {
                           patList.remove(patient);
                            System.out.println("Record(s) removed sucessfully");
                        } else {
                            System.out.println("You didn't want to remove the record");
                        }
                    }
                }
            } else {
                running = false;
                System.out.println("Bye...");
                break;
            }          
   
            if(foundPatId==false){
                System.out.println("The search found no matching patient");
            }
            else if ("E".equals(outcome)) {
                System.out.print("\nBye...\n");
                System.exit(0);
           
            }

        } while (true);
       
    }
}  
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hospitalrecords;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.LineNumberReader;
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// *
// * @author Peter Seatter
// * @Date 11/10/19
// * @version 1
// * You'll be able to access records from script and then remove them if you choose from the array.
// * 
// */
//public class HospitalRecords {
//
//    /**
//     * @param args the command line arguments
//     */
//  
//    //a method to obtain the records of the patients
//   
//    public static void main(String[] args) {
//        // Asking the user for input 
//         ArrayList<Patient> patList = new ArrayList<Patient>();
//
//        String path = "E:\\CPP\\Data Structure & Algorithms\\Practical Task 1\\Question 1\\ListOfPatients.txt";
//        
//        //user path to the ListOfPatients.txt here
//        LineNumberReader lr = null;
//        //allows to read information from the file line by line
//        String[] oneRecord = new String[4];
//       
//        //an array to store info about one patient
//        Patient pat;
//        try {
//            //using try-catch for exeption handling to cathc possible
//            //erros with i/o operations
//            FileReader inputStream = new FileReader(path);
//            //FileReader reads the file's contents
//            lr = new LineNumberReader(inputStream);
//            String str;
//            
//            while((str = lr.readLine()) != null) {
//                //while the next line exists
//                oneRecord = str.split(",");
//                //dividing one file line by commas and assigning to array
//                pat = new Patient(oneRecord[0], oneRecord[1], oneRecord[2], oneRecord[3]);
//                patList.add(pat);
//            }
//        }
//        catch(IOException ioe) {
//            System.out.println("IOExcception occured");
//        }
//        boolean running = true;
//        
//        do {
//            Scanner scannerObject = new Scanner(System.in);
//            System.out.println("Press S for search, Press E for exit: ");
//            String userInput = scannerObject.nextLine();
//            System.out.println(userInput.toUpperCase());
//            String outcome = userInput.toUpperCase();
//
//            //It states if the user inputs S then it will ask for the Patient ID else it will say bye
//            if("S".equals(outcome)) {
//                System.out.println("Enter Patient ID to search");
//                String patientIdInput = scannerObject.nextLine();
//                String chosenId = patientIdInput.toUpperCase();
//                System.out.println(patientIdInput.toUpperCase());
//
//                for(Patient sickPerson : patList) {
//                    if(sickPerson.patientId.equals(chosenId)){
//                        System.out.println(sickPerson.toString());
//                        System.out.println("Would you like to remove the paitent's"
//                                + " record(s)? \nY or N?");
//                        String userDelete = scannerObject.nextLine();
//                        String confirmDelete = userDelete.toUpperCase();
//                        System.out.println(userDelete.toUpperCase());
//
////                        if(confirmDelete.equals("Y")) {
////                           patList.remove(sickPerson);
////                            System.out.println("Record(s) removed sucessfully");
////                        } else {
////                            System.out.println("You didn't want to remove the record");
////                        }
//                    } else {
//                        System.out.println("The search found no matching patient");
//                    }
//                }
//            } else {
//                running = false;
//                System.out.println("Bye...");
//                break;
//            }
//        } while (true);
//        
//    }
//}    
            //if(patientIdInput.equals(patList))
                
//            for(int i = 0; i < patList.length; i++) {
//                if(i == patList[i]) {
//                    if(patientIdInput.equals(patList)){
//                
//                    } else {
//                        System.out.println("Did you enter the correct PatientID?");
//                    }
//                }
//            }
            
//        } else if ("E".equals(userInput)){
//            System.out.println("Bye...");                 
        //}
        
    //}
    
//    public static void obtainRecords() {
//        String path = "E:\\CPP\\Data Structure & Algorithms\\Practical Task 1\\Question 1\\ListOfPatients.txt";
//        
//        //user path to the ListOfPatients.txt here
//        LineNumberReader lr = null;
//        //allows to read information from the file line by line
//        String[] oneRecord = new String[4];
//        
//        
//        //an array to store info about one patient
//        Patient pat;
//        try {
//            //using try-catch for exeption handling to cathc possible
//            //erros with i/o operations
//            FileReader inputStream = new FileReader(path);
//            //FileReader reads the file's contents
//            lr = new LineNumberReader(inputStream);
//            String str;
//            
//            while((str = lr.readLine()) != null) {
//                //while the next line exists
//                oneRecord = str.split(",");
//                //dividing one file line by commas and assigning to array
//                pat = new Patient(oneRecord[0], oneRecord[1], oneRecord[2], oneRecord[3]);
//                patList.add(pat);
//                
//               
//            }
//            
//        }
//        catch(IOException ioe) {
//            System.out.println("IOExcception occured");
//        }
//    }
    
    
//}
