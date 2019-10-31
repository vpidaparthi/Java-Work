/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *
 * @author Peter Seatter
 * @version 1 
 * @Description This is the class which stores the customer information and allows for it to be outputted in a certain format.
 */
public class CustomerInformation {
    
    private String name;
    private int customerRating;
    private String Address;
    
    //getter method
    public String getName(){
    return name;
    }
    
    public int getCustomerRating(){
    return customerRating;
    }
    
    public String getAddress(){
    return Address;
    }
    
    public CustomerInformation(String newName, int newCustomerRating, String newgetAddress) {
    name = newName;
    customerRating = newCustomerRating;
    Address = newgetAddress;
    }

    @Override
    public String toString() {
        return("Name: " + name + ", Customer Rating: " + customerRating +
               ", Address: " + Address);
    }
}
    
