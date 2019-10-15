/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketingsystem;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;


public class TicketingSystem {
    
    public static Queue<String> cutomerNumber = new LinkedList();
    public static String customerArrival;
    public int queueNumber = 0;
    
    
    public static void main(String[] args) {
     
        addCustomers();
        Timer timer = new Timer();
        Timer ticketing = new Timer();
        timer.schedule(new SalesAssisstantTask(), 0, 5000); //run code in the SalesAssistantTask run() method every 3 seconds
        ticketing.schedule(new SalesAssisstantTask(), 0, 3000); 
    }
    
    
    public static void addCustomers(){
        for (int i = 1; i < 100; i++){
            cutomerNumber.add("Customer " + i);
        }
    }
    
    public static class SalesAssisstantTask extends TimerTask { //inner class
        
        public void run() {
                
            System.out.println("Sales Assistant is ready to see the next customer."); 
            
//            System.out.println("Customer with ticket 1 is added to the queue");
            
            /*the rest of code to display the next customer in line, what number
            ticket is 
            next in line and list all customers in a queue */
            
            if (cutomerNumber.isEmpty()){
                System.out.println("There are no customers to see.\n");
                System.exit(0);
            }
            else if (cutomerNumber.size() == 1){
                System.out.println("The customer with ticket number " + cutomerNumber.poll() + " will be seen");
                System.out.println("There are no more customers to see.\n");
            }
            else{
                System.out.println("The customer with ticket number " + cutomerNumber.poll() + " will be seen");
                System.out.println("The customers with the following tickets are in the queue: " + cutomerNumber.toString() + "\n");
            }
        }
    }
   
    
}
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package icecreamqueue;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;
//
///**
// *
// * @author CPP_Curriculum
// */
//public class IceCreamQueue {
//
//    public static void main(String[] args) {
//        addCustomers();
//        Timer timer = new Timer();
//        //timed event - first customer in line to be seen, if there are any customers
//        timer.schedule(new IceCreamServingTask(), 0, 4000);
//    }
//    
//    public static void addCustomers(){
//        for (int i=1; i<5; i++){
//            customerQueue.add("Customer " + i);
//        }
//    }
//    
//    //inner class to describe the task of serving ice cream to the first customer in a queue
//    public static class IceCreamServingTask extends TimerTask{
//        
//        public void run() {
//              
//            System.out.println("Sales Assistant is ready to serve the next customer."); 
//            if (customerQueue.isEmpty()){
//                System.out.println("There are no customers to see.\n");
//                System.exit(0);
//            }
//            else if (customerQueue.size() == 1){
//                System.out.println("The customer with ticket number " + customerQueue.poll() + " is getting ice cream");
//                System.out.println("There are no more customers to see.\n");
//            }
//            else{
//                System.out.println("The customer with ticket number " + customerQueue.poll() + " is getting ice cream");
//                System.out.println("The customers with the following tickets are in the queue: " + customerQueue.toString() + "\n");
//            }       
//        }
//    }
//}