package synchronization;

public class MovieBookApp extends Thread {

	static BookTheatreSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String args[]) {

		b = new BookTheatreSeat();

		// creating threads to book seats for two persons parallely

//		MovieBookApp t1 = new MovieBookApp();
//		t1.seats = 8;
//		t1.start();
//		MovieBookApp t2 = new MovieBookApp();
//		t2.seats = 9;
//		t2.start();

	}
}
