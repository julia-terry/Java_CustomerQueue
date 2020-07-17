package driver;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        
        LinkedListQueue line = new LinkedListQueue();
        Random rand = new Random();
        int totalCustomers = 0;
        int maxLineLength = 0;
        int queueLength = 0;
       
        //for loop to iterate 60 times to represent 60 minutes
        for(int minutes = 60; minutes > 0; minutes-- ){         
            //generate random int betweek 1 and 4, giving a 25% chance a new customer arrives
            int newNum = rand.nextInt(5)+1;
            //if random number is 4, add customer to queue
            if(newNum == 4){
                //add new customer to our queue
                line.enqueue(new Customer());
                //add one to our queue length
                queueLength++;
                //change max line length if this is the longest the queue has been
                if(queueLength>maxLineLength){
                    maxLineLength = queueLength;
                }
                //print out new customer added and new queue length
                System.out.println("New customer added! Queue length is now " +queueLength);
            }
            //see if our line is empty or if we have someone to service
            if(!line.isEmpty()){
                //decrease their wait time by one
                line.decreaseFirstServiceTime();
                //if they are done waiting, remove them from queue
                if(line.getFirstServiceTime() == 0){
                    line.dequeue();
                    //decrease queue length by 1
                    queueLength--;
                    System.out.println("Customer serviced and removed from the queue. Queue length is now: "+ queueLength);
                    //increase total customers by 1
                    totalCustomers++;
                }
            }
            //end of the 1 minute/1 iteration of loop
            System.out.println("-");
        }
        //end 60 minutes and prints out the final numbers
        System.out.println("Total number of customers serviced: "+ totalCustomers);
        System.out.println("Maximum line length during the simulation: " + maxLineLength);
    }
    
}
