package driver;
import java.util.*;

class LinkedListQueue {

    private Customer first, last;
    
    //creates an empty LinkedListQueue
    public LinkedListQueue(){
        //set both first and last to null, as it is an empty queue
        //if the first reference is null, nothing is in the list
        first = last = null;
    }
    
    //if no one is in the front of the line, the list is empty (returns true)
    public boolean isEmpty (){
        return first == null;
    }
    
    //adds Customer customer to the back of the queue  
    public void enqueue(Customer customer) {
        //if the queue is empty, first should reference the new object
        if (isEmpty()){
            first = customer;
        }
        else {
            //before we change last to reference the new object set the current 
            //last object's next reference to point to the new object
            last.setNext(customer);
        }
        //last references the new object
        last = customer;
    }
    
    //removes and returns the first customer in the queue
    public Customer dequeue(){
        //lets the user know if they are trying to remove an already empty queue
        if (isEmpty()) {
            System.out.println("The queue is already empty.");
            return null;
        }
        //Store a temp reference to the object we want to remove
        Customer temp = first;
        //Set first to reference the current first object's next reference
        //(which is the current second object in the list)
        first = first.getNext();
        //if the queue is now empty, set last to null
        if (isEmpty()){
            last = null;
        }
        return temp;
    }
    
    //returns the service time of the first customer
    public int getFirstServiceTime(){
        return(first.getServiceTime());
    }
    
    //decreases the service time of the first customer by one
    public void decreaseFirstServiceTime() {
        first.decServiceTime();
    }
}
