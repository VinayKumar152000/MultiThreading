package synchronization;

public class BookTheatreSeat {

	static int totalSeats = 30;

	/*
	 * create a synchronized method -> each object have a lock and two areas
	 * -unsynchronized and synchronized when a thread access a synchronized method
	 * of a object it acquire it's lock and than no other thread can access it. when
	 * thread release the lock than only other thread and access that method or sync
	 * block this will give us correct output
	 * 
	 */

	static synchronized public void bookSeat(int seats) {
//	public void bookSeat(int seats) {

		/*
		 * if we have a lot of code here and after the condition than thread need to
		 * wait for longer period of time for accessing this is not optmizedas we only
		 * need synchronization on if condiiton we can use synchronized block here, so
		 * that code performance improves
		 */

		/*
		 * there may be case when both threads simulatensouly enter this condition and
		 * seats got booked even we don't have that much seat, to avoid this,we provide
		 * synchroizaton that this block can only be accessible by one thread that at a
		 * time
		 */

//		synchronized (this) {
		if (totalSeats >= seats) {
			System.out.println("Seats Booked Successfully");
			totalSeats = totalSeats - seats;
			System.out.println("Seats left" + totalSeats);
		} else {
			System.out.println("Seats cannot be boooked");
			System.out.println("SeatsLeft" + totalSeats);
		}
	}
//	}
}
