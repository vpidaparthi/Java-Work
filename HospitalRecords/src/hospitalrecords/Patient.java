/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

/**
 *
 * @author Peter Seatter
 * @Date 11/10/19
 * This is the patient class which will hold the patient information
 */
public class Patient {
    public String patientId;
    public String name;
    public String checkInDate;
    public String assignedMedicalPersonnel;


    public Patient(String patientId, String name, String checkInDate, String assignedMedicalPersonnel) {
        this.patientId = patientId;
        this.name = name;
        this.checkInDate = checkInDate;
        this.assignedMedicalPersonnel = assignedMedicalPersonnel;
    } 
    
    @Override
    public String toString() {
        return("Patient ID: " + patientId + "\nName: " + name + "\nCheck in Date: "
                + checkInDate + "\nAssigned Medical Personal: " + assignedMedicalPersonnel);
    }
}
