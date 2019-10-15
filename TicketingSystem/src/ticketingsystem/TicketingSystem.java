package ticketingsystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Peter Seatter
 * @date 15/10/19
 * @version 1
 * @description creating a counted that will say who is customer 1 and so on then it will call them and store the rest which are generated
 * at 3 second intervals and then continues going until it reaches the limit specified on the for loop counter
 */

public class TicketingSystem {

    //creates a public but static queue which stores, displays and outputs the numbers for the queue
    public static Queue<String> customerNumber = new LinkedList();

    //the main method of the application
    public static void main(String[] args) {
        addCustomers();
        //i is a variable it displays the placemaker so null is not displayed as a counter 
        customerNumber.add("1");
        Timer timer = new Timer();
        
        //The timer which is located in CustomerArrivalTask and it counts ever 5 seconds.
        timer.schedule(new CustomerArrivalTask(), 0, 5000); 
        //it creates an output for one gernation of customer which starts at one
        for (int i = 1; i < 50; i++) {
            customerNumber.add("" + i);
        }
        //it creates an output for generation of customer which starts at two
        for (int i = 2; i < 50; i++) {
            customerNumber.add("" + i); 
        }
    }

    //a method which has a timer that adds a customer ever three seconds
    public static void addCustomers() {
        Timer timer = new Timer();
        timer.schedule(new SalesAssisstantTask(), 0, 3000);   
    }

    //inner class to describe the task of seing the next customer in a queue
    public static class CustomerArrivalTask extends TimerTask {

        //the inner class which deals with the next customer
        public void run() {
            //it states the if the customer number is empty then it will that they are ready to see the next customer and no customers to see
            if (customerNumber.isEmpty()) {
                System.out.println("Sales Assistant is ready to see the next customer..");
                System.out.println("There are no customers to see.\n");
            //this executes when it has customers in the queue and it will remove old values along with outputting which customer will be seen and who's in the queue
            } else {
                System.out.println("Sales Assistant is ready to see the next customer..");
                System.out.println("The customer with ticket number " + customerNumber.poll() + " will be seen");
                //removes the number from the top of the queue which has just been called
                customerNumber.remove(customerNumber.poll());
                //output for customers in queue
                System.out.println("The customers with the following tickets are in the queue: " + customerNumber.toString() + "\n");
            }
        }
    }

    //inner class to describe the task of displaying when the customer has been added to the queue and where they sit in the queue  
    public static class SalesAssisstantTask extends TimerTask {
        //the inner class which deals with the customer being added to the queue
        public void run() {
            //displaying the correct string
            customerNumber.add(customerNumber.element());
            //displays the customer with the ticket number and notifies they've been added to the queue
            System.out.println("Customer with ticket " + customerNumber.poll() + " is added to the queue.\n");
        }
    }
}