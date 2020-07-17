package driver;

import java.util.Random;		

public class Customer {
	
    private int serviceTime;
    private Customer next;
	
    /// Constructor
    public Customer() {		
      // Randomly assign required service time 1-5
      serviceTime = new Random().nextInt(5) + 1;	
      next = null;
    }
   
   // Getter for next Customer in list
   public Customer getNext(){
      return next;
   }
   
   // Setter for next reference
   public void setNext(Customer c){
      next = c;
   }
	
    /// Getter for ServiceTime
    public int getServiceTime() {							
	return serviceTime;
    }
	
    /// Decrement ServiceTime by 1
    public void decServiceTime() {		
	serviceTime--;
    }
    
}


