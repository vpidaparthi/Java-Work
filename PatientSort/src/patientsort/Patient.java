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
public class Patient {
    private String name;
    private int daysSpentInHospital;
    private String departmentName;
    
    //getter method
    public String getName(){
    return name;
    }
    
    public int getDaysSpentInHospital(){
    return daysSpentInHospital;
    }
    
    public String getDepartmentName(){
    return departmentName;
    }
    
    public Patient(String newName, int newDaysSpentInHospital, String newDepartmentName) {
    name = newName;
    daysSpentInHospital = newDaysSpentInHospital;
    departmentName = newDepartmentName;
    }

    @Override
    public String toString() {
        return("Name: " + name + "\nDays Spent in Hospital: "
                + daysSpentInHospital + "\nDepartment Name: " + departmentName);
    }
}

