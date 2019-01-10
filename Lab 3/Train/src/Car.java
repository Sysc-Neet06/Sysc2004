/**
 * Car models car in a passenger train.
 *
 * @author L.S. Marshall, SCE
 * @version 1.01 October 9, 2007
 * @version 1.2 January 2018 - printTicket now returns String, method uses getId() convention
 */

public class Car
{
    /** This car's identifier. */
    private int id;
   
    /**
     * true == this car is a business-class car,
     * false == this car is an economy-class car.
     */
    private boolean businessClass;
    
    public static final double BUSINESS_SEAT_COST = 125.0;
    public static final double ECONOMY_SEAT_COST = 50.0;    
  
    /** The number of seats in a car. */
    public static final int ECONOMY_SEATS = 40;
    public static final int BUSINESS_SEATS = 30;    
   
    /** The list of this car's seats. */
    private Seat[] seats;
   
    /**
     * Constructs a new Car object with the specified id.
     * If parameter isBusinessClass is true, the car is a business-class
     * car. If parameter isBusinessClass is false, the car is an
     * economy-class car.
     */
    public Car(int carId, boolean isBusinessClass)
    {
        int i;
        double cost;
        id = carId;
        businessClass = isBusinessClass;
        if(businessClass) { //
            seats = new Seat[BUSINESS_SEATS];
            cost = BUSINESS_SEAT_COST;
        } else {
            seats = new Seat[ECONOMY_SEATS];
            cost = ECONOMY_SEAT_COST;
        }
        for (i=0;i<seats.length;i++) {
            seats[i]=new Seat(i+1,cost);
        }
    }

    public int getNumberOfSeats() { return this.seats.length; };
    public double getCost(int seatNo) { return this.seats[seatNo-1].getPrice(); }
    public boolean isBooked(int seatNo) { return this.seats[seatNo-1].isBooked(); }
    
    public int getNumberofFreeSeats() { 
        int numFree = 0;
        for (int i=0;i<seats.length;i++) {
            if ( !seats[i].isBooked() ) { numFree++; }
        }
        return numFree;
    }
    /** 
     * Returns true if this is a business-class car,
     * false if this is an economy-class car.
     * @return
     */
    public boolean isBusinessClass()
    {
        return businessClass;
    }
 
    /**
     * Returns the id of this car.
     */
    public int getId()
    {
        return id;
    }
  
    /**
     * This method is called when the specified seat has been booked,
     * to print a ticket for that seat.
     * @return Returns a string representation of the ticket
     */
    private String printTicket(int seatNo)
    {
        String s = "Car ID: " + id + '\n';
        s += "Seat number: " + seatNo + '\n';
        s += "Price: " + '\n';
        if (businessClass) {
            s += BUSINESS_SEAT_COST + '\n';
        } else {
            s += ECONOMY_SEAT_COST + '\n';
        }
        return s;
    }   
 
    /**
     * Attempts to book a seat. If successful, this method prints a 
     * String containing the ticket
     * If no seats are available, this method returns null.
     * Throws IllegalStateException if internal inconsistency found.
     * (exception optional)
     */
    public String bookNextSeat()
    {
        for (int i=1;i<=seats.length;i++) {
            if ( !seats[i-1].isBooked() ) { // found a free seat
                if ( !seats[i-1].book() )  // book it
                    // students don't have to do this to get full marks
                    // but it is a good idea to check that things are 
                    // consistent
                    throw new IllegalStateException(
                       "Car::bookNextSeat -- inconsistent Seat status");
                 return printTicket(seats[i-1].getNumber());
            }
        }
        // if we get to here all the seats are booked so return false       
        return null;
    }

    /** 
     * Cancels the booking for the specified seat, which must be between
     * 1 and the maximum number of seats in the car.
     * If the seat number is valid and if the seat has been reserved, this
     * method cancels the booking for that seat and returns true. 
     * If the seat number is not valid, this method returns false. 
     * If the seat number is valid, but the seat has not been reserved, 
     * this method returns false.
     * Throws IllegalStateException if internal inconsistency found.
     * (exception optional)
     */
    public boolean cancelSeat(int seatNo)
    {
        if ( ( seatNo < 1 ) || ( seatNo > seats.length ) // invalid seat number
           || ( !seats[seatNo-1].isBooked() ) ) // seat not booked
           return false;
        if ( !seats[seatNo-1].cancelBooking() ) 
           throw new IllegalStateException( // see notes in bookNextSeat
               "Car::bookNextSeat -- inconsistent Seat status");
        return true; // if we get to here the booking has been cancelled
    }    
    
    public String toString() {
         return "Car " + getId() + " : " + this.getNumberofFreeSeats() + " free, $" + this.getCost(1);
    }
}