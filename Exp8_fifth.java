/*5) In a movie ticket booking application, create a scenario where a user attempts to reserve a seat that is already booked. Define a custom exception called 
SeatAlreadyBookedException that is thrown in such cases. Write a method bookSeat(int seatNumber) that simulates checking seat availability and throws the exception 
if the seat is not available. Demonstrate exception handling in the main method by trying to book the same seat twice.
 * 
 */
// Custom exception for already booked seats
class SeatAlreadyBookedException extends Exception {

    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

// TicketBooking class to manage seat reservations
class TicketBooking {

    private boolean[] seats = new boolean[10]; // Array to track seat bookings (10 seats)

    // Method to book a seat
    public void bookSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException("Error: Seat " + seatNumber + " is already booked!");
        }
        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " booked successfully!");
    }
}

public class Exp8_fifth {

    public static void main(String[] args) {
        // Create a TicketBooking instance
        TicketBooking bookingSystem = new TicketBooking();

        // Test case: Booking the same seat twice
        int seatNumber = 5;
        try {
            bookingSystem.bookSeat(seatNumber); // First booking - successful
            bookingSystem.bookSeat(seatNumber); // Second booking - exception should be thrown
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
    }
}
